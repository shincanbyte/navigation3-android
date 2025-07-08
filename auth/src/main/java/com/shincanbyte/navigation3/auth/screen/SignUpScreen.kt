package com.shincanbyte.navigation3.auth.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.shincanbyte.navigation3.auth.R
import com.shincanbyte.navigation3.auth.route.AuthRoute
import com.shincanbyte.navigation3.core.ui.BasicTextScreen
import com.shincanbyte.navigation3.core.ui.utils.ButtonProperties

@Composable
fun SignUpScreen(
    modifier: Modifier = Modifier,
    onSignUpClick : () -> Unit
) {
    val name = AuthRoute.SignUp::class.simpleName

    BasicTextScreen(
        modifier = modifier,
        text = name,
        primaryButton = ButtonProperties(
            text = stringResource(R.string.sign_up),
            onClick = onSignUpClick
        )
    )
}