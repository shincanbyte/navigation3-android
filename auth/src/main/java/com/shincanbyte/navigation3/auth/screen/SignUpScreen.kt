package com.shincanbyte.navigation3.auth.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.shincanbyte.navigation3.auth.route.AuthRoute
import com.shincanbyte.navigation3.core.ui.BasicTextScreen

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    onNextClick : () -> Unit
) {
    val name = AuthRoute.SignUp::class.simpleName

    BasicTextScreen(
        modifier = modifier,
        text = name,
        onClick = onNextClick
    )
}