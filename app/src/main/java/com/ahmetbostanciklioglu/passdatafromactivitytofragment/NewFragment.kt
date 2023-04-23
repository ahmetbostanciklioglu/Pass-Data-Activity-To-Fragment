package com.ahmetbostanciklioglu.passdatafromactivitytofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.ahmetbostanciklioglu.passdatafromactivitytofragment.databinding.FragmentNewBinding


class NewFragment : Fragment() {

    private lateinit var binding: FragmentNewBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_new, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        retrieveData()
    }


    private fun retrieveData(withKey: String= "EditTextKey") {
        val result = arguments?.getString(withKey)
        binding.textView.text = result.toString()
    }

}