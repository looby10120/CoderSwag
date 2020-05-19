package com.example.coderswag.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(
            this, DataService.categories
        )
        categoryRecyclerView.adapter = adapter
    }
}
