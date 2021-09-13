package com.example.testapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.testapp.R
import com.example.testapp.adapter.SatallitesListAdapter
import com.example.testapp.databinding.FragmentSatalliteListBinding


class SatalliteListFragment : Fragment() {

    lateinit var binding : FragmentSatalliteListBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_satallite_list, container, false)
    }







}