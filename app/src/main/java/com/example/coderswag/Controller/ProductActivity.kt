package com.example.coderswag.Controller

import android.content.res.Configuration
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.coderswag.Adapter.ProductRecyclerAdapter
import com.example.coderswag.R
import com.example.coderswag.Service.DataService
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    private lateinit var productAdapter: ProductRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        val products = DataService.getProducts(categoryType)

        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720) {
            spanCount = 3
        }

        productAdapter = ProductRecyclerAdapter(
            this, products
        ) { product ->
            Toast.makeText(
                this,
                "You selected ${product.title}, Please pay ${product.price}",
                Toast.LENGTH_SHORT
            ).show()
        }
        val layoutManager = GridLayoutManager(this, spanCount)
        productRecyclerView.adapter = productAdapter
        productRecyclerView.layoutManager = layoutManager
    }
}
