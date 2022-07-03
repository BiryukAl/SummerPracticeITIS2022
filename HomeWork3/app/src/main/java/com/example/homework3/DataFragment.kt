package com.example.homework3

import android.os.Bundle
import androidx.fragment.app.Fragment

class DataFragment : Fragment(R.layout.data_fragment) {

    companion object{

        private const val ID_USER = "ID_USER"

        fun createBundle(int: Int): Bundle {
            val bundle = Bundle()
            bundle.putInt(ID_USER, int)

            return bundle

        }
    }
}