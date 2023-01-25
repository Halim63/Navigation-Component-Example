package com.example.taskofnavcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_go_to_settings.setOnClickListener {
            val action=HomeFragmentDirections.actionHomeFragmentToSettingsFragment2()
            findNavController().navigate(action)

        }
        btn_clickMe.setOnClickListener {
            val action=HomeFragmentDirections.actionHomeFragmentToDealsFragment("Open From Home")
            findNavController().navigate(action)
        }
    }

}