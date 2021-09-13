import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.testapp.model.Position
import com.example.testapp.model.SatalliteDetail
import com.example.testapp.model.SatallitesList

class SatallitesDetailsViewModel : ViewModel() {

    val satallitesLiveData = MutableLiveData<SatallitesList>()
    val satallitesLiveDataDetail = MutableLiveData<SatalliteDetail>()
    val satallitesLiveDataPosition = MutableLiveData<Position>()


}