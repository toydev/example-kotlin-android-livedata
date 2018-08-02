package example.livedata.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import example.livedata.R
import example.livedata.databinding.Fragment2Binding

class Fragment2 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<Fragment2Binding>(
                inflater,
                R.layout.fragment2,
                container,
                false)
        binding.setLifecycleOwner(this)

        val vm = ViewModelProviders.of(this).get(Fragment2ViewModel::class.java)
        binding.setVm(vm)

        return binding.root
    }
}
