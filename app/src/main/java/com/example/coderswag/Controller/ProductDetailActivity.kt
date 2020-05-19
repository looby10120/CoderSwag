package com.example.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.coderswag.Model.ProductDetail
import com.example.coderswag.R
import com.example.coderswag.Utilities.EXTRA_PRODUCT
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val productDetail = intent.getParcelableExtra<ProductDetail>(EXTRA_PRODUCT)
        productDetail.apply {
            val resourceId = resources.getIdentifier(image, "drawable", packageName)
            detailTitle.text = title
            detailPrice.text = price
            detailDesc.text = description
            detailImage.setImageResource(resourceId)
        }

    }
}
