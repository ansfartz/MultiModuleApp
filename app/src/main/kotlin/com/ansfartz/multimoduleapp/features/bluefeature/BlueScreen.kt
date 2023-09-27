package com.ansfartz.multimoduleapp.features.bluefeature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.ansfartz.multimoduleapp.ui.theme.MultiModuleAppTheme

@Composable
fun BlueScreen(
    modifier: Modifier = Modifier,
    onRedButtonClick: () -> Unit = {},
    onGreenButtonClick: () -> Unit = {},
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(255, 255, 255, 255))
    ) {
        Column(
            modifier = modifier
                .align(Alignment.Center)
        ) {

            Button(
                modifier = modifier.width(100.dp),
                onClick = { onRedButtonClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(207, 84, 84, 255),
                    contentColor = Color(255, 255, 255, 255),
                )
            ) {
                Text("Red")
            }

            Button(
                modifier = modifier.width(100.dp),
                onClick = { onGreenButtonClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(102, 207, 84, 255),
                    contentColor = Color(255, 255, 255, 255),
                )
            ) {
                Text("Green")
            }

            Button(
                modifier = modifier.width(100.dp),
                onClick = {  },
                enabled = false,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White,
                    disabledContainerColor = Color(175, 175, 175, 255),
                    disabledContentColor = Color(90, 90, 90, 255),
                )
            ) {
                Text("Blue")
            }

        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun BlueScreenPreview() {
    MultiModuleAppTheme {
        BlueScreen()
    }
}