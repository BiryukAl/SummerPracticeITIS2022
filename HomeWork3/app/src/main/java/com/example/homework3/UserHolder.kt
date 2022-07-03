package com.example.homework3

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ItemUserBinding

class UserHolder(
    private val binding: ItemUserBinding,
    private val onItemClick: (User) -> Unit,
    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(user: User){
            with(binding){
                textName.text = user.name
                textCompany.text = user.company

                root.setOnClickListener {
                    onItemClick(user)

                }

            }
        }


}