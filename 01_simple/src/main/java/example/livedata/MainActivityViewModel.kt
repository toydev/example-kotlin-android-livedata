package example.livedata

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val textValue1 = MutableLiveData<String>()

    init {
        textValue1.setValue("")
    }
}