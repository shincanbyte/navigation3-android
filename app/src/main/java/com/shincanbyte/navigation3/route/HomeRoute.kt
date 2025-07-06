package com.shincanbyte.navigation3.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class HomeRoute : NavKey {

    @Serializable
    data object Shortcut : HomeRoute()

    @Serializable
    data object Automation : HomeRoute()

    @Serializable
    data object Account : HomeRoute()

}