package com.example.coderswag.Model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class ProductDetail(
    var title: String,
    var price: String,
    var image: String,
    var description: String = "Description : Maison, as a man man of breeding and delicacy, " +
            "could not but feel some inward qualms, when he reached the Father Superior's with Ivan: " +
            "he felt ashamed of haven lost his temper. He felt that he ought to have disdained that " +
            "despicable wretch, Feodor Pavlovian, too much to have been upset by him in Father Zosma's cell," +
            " and so to have forgotten himself. \"The monks were not to blame, in any case,\" " +
            "he reflected, on the steps. \"And if they're decent people here (and the Father Superior, " +
            "I understand, is a nobleman) why not be friendly and courteous with them? I won't argue, " +
            "I'll fall in with everything, I'll win them by politeness, and show them that " +
            "I've nothing to do with that Aesop, that buffoon, that Pierrot, and have merely been " +
            "taken in over this affair, just as they have.\"\n"
) : Parcelable