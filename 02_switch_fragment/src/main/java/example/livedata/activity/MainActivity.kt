package example.livedata.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import example.livedata.R
import example.livedata.databinding.ActivityMainBinding
import example.livedata.fragment.Fragment1
import example.livedata.fragment.Fragment2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.setLifecycleOwner(this)
        val vm = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        binding.vm = vm

        vm.fragment.observe(this, Observer {
            when (it) {
                "fragment1" -> {
                    changeMainFragment(Fragment1())
                }
                "fragment2" -> {
                    changeMainFragment(Fragment2())
                }
            }
        })
    }

    fun changeMainFragment(newFragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.main_fragment, newFragment)
        transaction.commit()
    }
}
