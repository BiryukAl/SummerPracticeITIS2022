package com.example.homework3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework3.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {

    private lateinit var binding: MainFragmentBinding

    private val usersService = UsersService()

        private var adapter :UsersAdapter?  = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding = MainFragmentBinding.bind(view)

        adapter = UsersAdapter(usersService.getUsers()) {
            findNavController().navigate(
                R.id.action_mainFragment_to_dataFragment,

                DataFragment.createBundle(it.id.toInt()))
        }

        binding.rcUsers.adapter = adapter

    }




}