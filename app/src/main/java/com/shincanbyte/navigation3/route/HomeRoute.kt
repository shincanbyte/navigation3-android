package com.shincanbyte.navigation3.route

import androidx.navigation3.runtime.NavKey

sealed class HomeRoute : NavKey {

    data object Shortcut : HomeRoute()

    data object Automation : HomeRoute()

    data object Account : HomeRoute()

}