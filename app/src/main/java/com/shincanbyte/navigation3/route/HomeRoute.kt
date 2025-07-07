package com.shincanbyte.navigation3.route

import androidx.compose.runtime.saveable.Saver
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

val homeItems = listOf(
    HomeRoute.Shortcut,
    HomeRoute.Automation,
    HomeRoute.Account
)

val homeSaver = Saver<HomeRoute, String>(
    save = { it::class.simpleName ?: "Unknown"},
    restore = {
        when(it){
            HomeRoute.Shortcut::class.simpleName -> HomeRoute.Shortcut
            HomeRoute.Automation::class.simpleName -> HomeRoute.Automation
            HomeRoute.Account::class.simpleName -> HomeRoute.Account
            else -> HomeRoute.Shortcut
        }
    }
)