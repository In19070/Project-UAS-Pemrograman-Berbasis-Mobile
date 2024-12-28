package com.paulina.latestkpopnews.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class LatestKpopNews(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int,
    val url: String // Add this property for the URL
)