package example.livedata.fragment;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

public class Fragment2ViewModel extends ViewModel {
    public Fragment2ViewModel() {
        Log.d(getClass().getName(), "initialize");
    }

    @Override
    protected void finalize() throws Throwable {
        Log.d(getClass().getName(), "finalize");

        super.finalize();
    }

    @Override
    protected void onCleared() {
        super.onCleared();

        Log.d(getClass().getName(), "onCleared");
    }
}
