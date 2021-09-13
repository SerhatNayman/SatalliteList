package com.example.satallitesapp.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.satallitesapp.model.SatallitesList
import com.example.satallitesapp.restAPI.SatalliteAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class SatallitesListViewModel : ViewModel() {

    val satallites = MutableLiveData<List<SatallitesList>>()
    val errorMessage = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()
    val durum = MutableLiveData<Boolean>()

    private val satalliteApiService = SatalliteAPIService()
    private val disposable = CompositeDisposable()


    fun refleshData() {
        getDataViewModel()


    }

    private fun getDataViewModel() {

        loading.value = true

        disposable.add(
            satalliteApiService.getData()
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<List<SatallitesList>>() {
                    override fun onSuccess(t: List<SatallitesList>) {

                        satallites.value = t
                        errorMessage.value = false
                        loading.value = false
                    }

                    override fun onError(e: Throwable) {

                        errorMessage.value = true
                        loading.value = false
                        e.printStackTrace()

                    }


                })


        )


    }

}