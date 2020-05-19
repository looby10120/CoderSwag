package com.example.coderswag.Controller

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapter.CategoryRecyclerAdapter
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(
            this, DataService.categories
        ) { category ->
            val productIntent = Intent(this, ProductActivity::class.java).also {
                it.putExtra(EXTRA_CATEGORY, category.title)
            }
            startActivity(productIntent)
        }
        categoryRecyclerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryRecyclerView.layoutManager = layoutManager
        categoryRecyclerView.setHasFixedSize(true)
    }
}
