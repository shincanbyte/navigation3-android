package com.shincanbyte.navigation3.route

sealed class RootScreen {

    data object Auth : RootScreen()

    data object Home : RootScreen()

    data object Notification : RootScreen()

    data object Settings : RootScreen()

}