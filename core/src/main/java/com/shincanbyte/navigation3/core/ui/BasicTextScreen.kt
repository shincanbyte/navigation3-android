package com.shincanbyte.navigation3.core.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.shincanbyte.navigation3.core.ui.theme.Navigation3Theme

@Composable
fun BasicTextScreen(
    modifier: Modifier = Modifier,
    text: String? = null,
    onClick: (() -> Unit)? = null
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.Center,
    ) {
        text?.let {
            Text(text = it)
        }

        onClick?.let{
            Button(
                onClick = onClick
            ){
                Text(text = "Next")
            }
        }
    }
}

@Preview
@Composable
fun BasicTextScreenPreview() {
    Navigation3Theme {
        BasicTextScreen(
            text = "Preview"
        )
    }
}