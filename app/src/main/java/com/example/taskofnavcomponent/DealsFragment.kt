package com.example.taskofnavcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkBuilder
import androidx.navigation.NavDestination
import androidx.navigation.fragment.navArgs
import androidx.navigation.navDeepLink
import kotlinx.android.synthetic.main.fragment_deals.view.*

class DealsFragment : Fragment() {
    val args: DealsFragmentArgs by navArgs()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val pendingIntent= NavDeepLinkBuilder(requireContext())
            .setGraph(R.navigation.main_nav_graph)
            .setDestination(R.id.dealsFragment)
            .setArguments(args = null)
            .createPendingIntent()


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_deals, container, false)

        val textMessage = args.message
        view.tv_deals.text = textMessage
        Toast.makeText(requireContext(), textMessage, Toast.LENGTH_LONG).show()

        return view
    }

}