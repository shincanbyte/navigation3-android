package com.shincanbyte.navigation3.core.ui.utils

data class ButtonProperties(
    val text : String,
    val onClick : (() -> Unit)? = null
)
