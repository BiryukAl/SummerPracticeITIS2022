package com.example.homework3

import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ItemUserBinding

class UserHolder(
    private val binding: ItemUserBinding,

    ) : RecyclerView.ViewHolder(binding.root) {

        fun onBind(user: User){
            with(binding){
                textName.text = user.name
                textCompany.text = user.company
            }
        }


}