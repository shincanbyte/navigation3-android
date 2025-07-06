package com.shincanbyte.navigation3.auth.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shincanbyte.navigation3.auth.route.AuthRoute
import com.shincanbyte.navigation3.core.ui.BasicTextScreen

@Composable
fun SignInScreen(
    modifier: Modifier = Modifier
) {
    val name = AuthRoute.SignIn::class.simpleName

    BasicTextScreen(
        modifier = modifier,
        text = name
    )
}