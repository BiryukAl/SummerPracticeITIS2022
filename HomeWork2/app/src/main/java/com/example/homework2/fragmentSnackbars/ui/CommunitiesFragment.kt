package com.example.homework2.fragmentSnackbars.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.homework2.R
import com.example.homework2.databinding.FragmentCommunitiesBinding
import com.example.homework2.databinding.FragmentMainBinding
import com.example.homework2.fragmentSnackbars.SettingsFragment

class CommunitiesFragment : Fragment(R.layout.fragment_communities) {
    private var _binding: FragmentCommunitiesBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentCommunitiesBinding.bind(view)

        with(binding) {
            buttonToSettings.setOnClickListener(){
                findNavController().navigate(
                    R.id.action_communitiesFragment_to_settingsFragment,
                    SettingsFragment.createBundle(R.string.communities.toString()))
            }
        }

    }
}