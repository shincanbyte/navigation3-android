package com.shincanbyte.navigation3.route

sealed class HomeScreen {

    data object Shortcut : HomeScreen()

    data object Automation : HomeScreen()

    data object Account : HomeScreen()

}