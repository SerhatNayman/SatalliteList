

import com.example.testapp.model.Position
import com.example.testapp.model.SatalliteDetail
import com.example.testapp.model.SatallitesList
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class SatalliteAPIService {


    private val BASE_URL = "https://raw.githubusercontent.com/SerhatNayman/JsonRepository/main/"
    private val api =
            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .build().create(SatalliteAPI::class.java)

    fun getData(): Single<List<SatallitesList>> {

        return api.getSatallites()

    }

    fun getDetails(): Single<List<SatalliteDetail>> {

        return api.getSatallitesDetail()
    }

    fun getPosition(): Single<List<Position>> {
        return api.getPosition()
    }

}