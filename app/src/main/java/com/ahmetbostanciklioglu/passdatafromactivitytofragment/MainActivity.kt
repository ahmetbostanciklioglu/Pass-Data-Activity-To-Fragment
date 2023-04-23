package com.ahmetbostanciklioglu.passdatafromactivitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passdatafromactivitytofragment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.buttonId.setOnClickListener {


            prepareDataPassingViaReference(NewFragment())



        }
    }

    private fun prepareDataPassingViaReference(fragment: Fragment) {
        val editTextReferenceProperty = binding.editTextId.text.toString()

        val bundle = Bundle()
        bundle.putString("EditTextKey", editTextReferenceProperty)
        fragment.arguments = bundle

        show(fragment)
    }

    private fun show(NewFragment: Fragment) {
        supportFragmentManager.beginTransaction().add(R.id.frame_layout, NewFragment).commit()
    }
}