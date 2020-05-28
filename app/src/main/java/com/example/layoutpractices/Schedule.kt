package com.example.layoutpractices

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.schedule.*

class Schedule : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.schedule)


        val userList = fillDummyData(300)

        recycler_profile_list.adapter = CustomAdapter(userList)
        recycler_profile_list.layoutManager = LinearLayoutManager(this)
        recycler_profile_list.setHasFixedSize(true)
    }

    private fun fillDummyData(size: Int): List<UserList> {
        val list = ArrayList<UserList>()
        for (i in 0 until size) {
            val drawable = R.drawable.ic_account
            val item = UserList(drawable, "Title $i", "Date", "10.00 AM")
            list += item
        }
        return list
    }
}