package example.livedata.fragment

import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import example.livedata.R
import example.livedata.databinding.Fragment1Binding


class Fragment1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val binding = DataBindingUtil.inflate<Fragment1Binding>(
                inflater,
                R.layout.fragment1,
                container,
                false)
        binding.setLifecycleOwner(this)

        val vm = ViewModelProviders.of(this).get(Fragment1ViewModel::class.java)
        binding.setVm(vm)

        return binding.root
    }
}
