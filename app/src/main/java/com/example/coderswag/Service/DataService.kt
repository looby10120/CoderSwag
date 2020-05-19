package com.example.coderswag.Service

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage"),
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphics Beanie","$18", "hat1"),
        Product("Devslopes Hat Black","$28", "hat2"),
        Product("Devslopes Hat White","$18", "hat3"),
        Product("Devslopes Hat Snapback","$22", "hat4")
    )

    val hoodies = listOf(
        Product("Devspoles Hoodies Gray", "$28", "hoodie1"),
        Product("Devspoles Hoodies Red", "$32", "hoodie2"),
        Product("Devspoles Gray Hoodie", "$28", "hoodie3"),
        Product("Devspoles Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18", "shirts1"),
        Product("Devslopes Badge Light Gray","$20", "shirts2"),
        Product("Devslopes Logo Shirt Red","$22", "shirts3"),
        Product("Devslopes Hustle","$22", "shirts4"),
        Product("Kickflip Studios","$18", "shirts5")
    )

    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product> {
        return when(category) {
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGood
        }
    }

}