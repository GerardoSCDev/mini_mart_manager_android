package com.example.miminimart.common.ui.components.appBottomNavBar

import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AppBottomNavBar() {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .padding(bottom = 10.dp)
            .statusBarsPadding(),
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black),
        shape = RoundedCornerShape(16)
    ) {

        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Text("Hola")
        }


    }

}

@Preview
@Composable
fun AppBottomNavBarPreview() {
    AppBottomNavBar()
}

@Preview(showSystemUi = true)
@Composable
fun AppBottomNavBarPreviewDevice() {
    Scaffold(
        bottomBar = { AppBottomNavBar() }
    ) {

    }
}