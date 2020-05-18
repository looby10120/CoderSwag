package com.example.coderswag.Service

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphics Beanie","$18", "hat01"),
        Product("Devslopes Hat Black","$28", "hat02"),
        Product("Devslopes Hat White","$18", "hat03"),
        Product("Devslopes Hat Snapback","$22", "hat04")
    )

    val hoodies = listOf(
        Product("Devspoles Hoodies Gray", "$28", "hoodie01"),
        Product("Devspoles Hoodies Red", "$32", "hoodie02"),
        Product("Devspoles Gray Hoodie", "$28", "hoodie03"),
        Product("Devspoles Black Hoodie", "$32", "hoodie04")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black","$18", "shirts01"),
        Product("Devslopes Badge Light Gray","$20", "shirts02"),
        Product("Devslopes Logo Shirt Red","$22", "shirts03"),
        Product("Devslopes Hustle","$22", "shirts04"),
        Product("Kickflip Studios","$18", "shirts05")
    )

}