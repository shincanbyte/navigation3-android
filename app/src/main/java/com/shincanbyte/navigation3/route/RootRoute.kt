package com.shincanbyte.navigation3.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class RootRoute : NavKey {

    @Serializable
    data object Auth : RootRoute()

    @Serializable
    data object Home : RootRoute()

    @Serializable
    data object Notification : RootRoute()

    @Serializable
    data object Settings : RootRoute()

}