package com.example.homework3

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework3.databinding.ItemUserBinding

class UsersAdapter(
    private var list: List<User>,
    private val onItemClick: (User) -> Unit,
) : RecyclerView.Adapter<UserHolder>() {


        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int,
        ): UserHolder = UserHolder(
            ItemUserBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            onItemClick
        )

    override fun onBindViewHolder(
        holder: UserHolder,
        position: Int,
        ) {
            holder.onBind(list[position])
        }

    override fun getItemCount(): Int = list.size
}