package com.ansfartz.redfeature

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun RedScreen(
    modifier: Modifier = Modifier,
    onGreenButtonClick: () -> Unit = {},
    onBlueButtonClick: () -> Unit = {},
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
                onClick = { /*TODO*/ },
                enabled = false,
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White,
                    disabledContainerColor = Color(175, 175, 175, 255),
                    disabledContentColor = Color(90, 90, 90, 255),
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
                onClick = { onBlueButtonClick() },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(84, 178, 207, 255),
                    contentColor = Color(255, 255, 255, 255),
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
fun RedScreenPreview() {
    Surface {
        RedScreen()
    }
}