package com.paulina.latestkpopnews.model

import androidx.annotation.StringRes

data class KpopGroup(
    val imageResourceId: Int,
    @StringRes val nameResourceId: Int
)