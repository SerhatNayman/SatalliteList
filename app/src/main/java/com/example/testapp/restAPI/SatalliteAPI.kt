
import com.example.testapp.model.Position
import com.example.testapp.model.SatalliteDetail
import com.example.testapp.model.SatallitesList
import io.reactivex.Single
import retrofit2.http.GET

interface SatalliteAPI {

    @GET("satallite-list.json")
    fun getSatallites(): Single<List<SatallitesList>>

    @GET("satallite-detail.json")
    fun getSatallitesDetail(): Single<List<SatalliteDetail>>

    @GET("position.json")
    fun getPosition(): Single<List<Position>>


}