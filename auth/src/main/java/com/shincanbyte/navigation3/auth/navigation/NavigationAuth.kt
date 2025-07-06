package com.shincanbyte.navigation3.auth.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entry
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSavedStateNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.shincanbyte.navigation3.auth.route.AuthRoute
import com.shincanbyte.navigation3.auth.screen.ForgotPasswordScreen
import com.shincanbyte.navigation3.auth.screen.SignInScreen
import com.shincanbyte.navigation3.auth.screen.SignUpScreen

@Composable
fun NavigationAuth() {

    val backStack = rememberNavBackStack<AuthRoute>(AuthRoute.SignIn)

    NavDisplay(
        backStack = backStack,
        onBack = {backStack.removeLastOrNull()},
        entryDecorators = listOf(
            rememberSavedStateNavEntryDecorator(),
            rememberViewModelStoreNavEntryDecorator()
        ),
        entryProvider = entryProvider {
            entry<AuthRoute.SignIn> {
               SignInScreen()
            }
            entry<AuthRoute.SignUp> {
                SignUpScreen()
            }
            entry<AuthRoute.ForgotPassword> {
                ForgotPasswordScreen()
            }
        }
    )
}