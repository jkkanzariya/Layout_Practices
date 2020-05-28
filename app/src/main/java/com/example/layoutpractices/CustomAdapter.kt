package com.example.layoutpractices

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.profile_list.view.*

class CustomAdapter(private val userList: List<UserList>) : RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profile_list, parent, false)
        return CustomViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val currentItem = userList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.titleU.text = currentItem.title
        holder.dayU.text = currentItem.day
        holder.timeU.text = currentItem.time
    }

    override fun getItemCount() = userList.size

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView: ImageView = itemView.image_view
        val titleU: TextView = itemView.user_title
        val dayU: TextView = itemView.user_day
        val timeU: TextView = itemView.user_time
    }
}