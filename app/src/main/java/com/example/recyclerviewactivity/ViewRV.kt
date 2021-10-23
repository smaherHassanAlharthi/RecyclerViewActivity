package com.example.recyclerviewactivity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ViewRV  : AppCompatActivity() {

    private lateinit var rvView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.view_rv)

        rvView= findViewById(R.id.rvView)
        val adapter= RVAdapter()
        rvView.adapter= adapter
        rvView.layoutManager= LinearLayoutManager(this)


    }
}