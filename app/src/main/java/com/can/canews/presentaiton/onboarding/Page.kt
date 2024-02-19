package com.can.canews.presentaiton.onboarding

import androidx.annotation.DrawableRes
import com.can.canews.R

data class Page(
    val title:String,
    val description:String,
    @DrawableRes val image:Int
)

val pages= listOf(
    Page(
        title = "Personalized News App",
        description = "A new news app offers customized content based on users' interests. Users can easily access the latest news by filtering by category.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Fast and Simple News Reading Experience",
        description = "A sophisticated news app allows users to access news quickly. With a simple interface on their mobile devices, users can browse news headlines and easily access content of interest.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "User Friendly News App",
        description = "An innovative news app designed to meet the needs of users. Thanks to its simple and user-friendly interface, users can easily browse news and access engaging content.",
        image = R.drawable.onboarding3
    )
)
