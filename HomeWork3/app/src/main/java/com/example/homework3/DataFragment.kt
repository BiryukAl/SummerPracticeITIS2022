package com.example.homework3

import android.os.Bundle
import android.view.View
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import com.example.homework3.databinding.DataFragmentBinding
import com.example.homework3.databinding.MainFragmentBinding

class DataFragment : Fragment(R.layout.data_fragment) {

    lateinit var binding: DataFragmentBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding =DataFragmentBinding.bind(view)




//        with(binding){
//            textIdd.text = "id: $iddd"
//        }

    }

    companion object{

        private const val ID_USER = "ID_USER"

        fun createBundle(int: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ID_USER, int)

            return bundle

        }
    }
}