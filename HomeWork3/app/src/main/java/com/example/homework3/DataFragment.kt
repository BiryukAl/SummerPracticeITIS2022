package com.example.homework3

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class DataFragment : Fragment(R.layout.data_fragment) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


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