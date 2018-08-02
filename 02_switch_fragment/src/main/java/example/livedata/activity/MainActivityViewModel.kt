package example.livedata.activity

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val fragment = MutableLiveData<String>()

    fun gc() {
        Runtime.getRuntime().gc()
    }

    fun showFragment1() {
        fragment.postValue("fragment1")
    }

    fun showFragment2() {
        fragment.postValue("fragment2")
    }
}
