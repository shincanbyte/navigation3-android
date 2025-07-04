package com.shincanbyte.navigation3.route

import androidx.navigation3.runtime.NavKey

sealed class RootRoute : NavKey {

    data object Auth : RootRoute()

    data object Home : RootRoute()

    data object Notification : RootRoute()

    data object Settings : RootRoute()

}