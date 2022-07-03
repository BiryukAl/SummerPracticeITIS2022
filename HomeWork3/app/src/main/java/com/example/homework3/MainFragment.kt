package com.example.homework3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.homework3.databinding.MainFragmentBinding

class MainFragment : Fragment(R.layout.main_fragment) {

    lateinit var binding: MainFragmentBinding


    private var adapter :UsersAdapter?  = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding = MainFragmentBinding.bind(view)

//        adapter =



    }


    companion object{

        private const val ID_USER = "ID_USER"

        fun createBundle(int: Int): Bundle{
            val bundle = Bundle()
            bundle.putInt(ID_USER, int)

            return bundle

        }
    }

}