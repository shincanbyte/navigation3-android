package com.shincanbyte.navigation3.auth.route

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

@Serializable
sealed class AuthRoute : NavKey {

    @Serializable
    data object SignIn : AuthRoute()

    @Serializable
    data object SignUp : AuthRoute()

    @Serializable
    data object ForgotPassword : AuthRoute()

}