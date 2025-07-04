package com.shincanbyte.auth.route

import androidx.navigation3.runtime.NavKey

sealed class AuthRoute : NavKey {

    data object SignIn : AuthRoute()

    data object SignUp : AuthRoute()

    data object ForgotPassword : AuthRoute()

}