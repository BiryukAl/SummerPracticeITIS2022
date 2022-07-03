package com.example.homework2.fragmentSnackbars

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.homework2.R
import com.google.android.material.snackbar.Snackbar

class SettingsFragment : Fragment(R.layout.fragment_settings){




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val text = arguments?.getString(FROM_FRAGMENT).orEmpty()

        if (text.isNotEmpty()){
//            Toast.makeText(this, text, Toast.LENGTH_LONG).show()
            Snackbar.make(view, text, Snackbar.LENGTH_LONG).show()

        }
    }

    companion object{

        private const val FROM_FRAGMENT = "FROM_FRAGMENT"

        fun createBundle(text: String): Bundle{
            val bundle = Bundle()
            bundle.putString(FROM_FRAGMENT, text)

            return bundle


        }
    }
}