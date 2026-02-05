package com.example.miminimart.common.ui.components.appTopNavBar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
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
fun AppTopNavBar() {

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .statusBarsPadding(),
        color = Color.White,
        border = BorderStroke(1.dp, Color.Black),
        shape = RoundedCornerShape(16)
    ) {
        Row(
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                "Mi Mini Mart"
            )
            Spacer(Modifier.weight(1f))
            Text(
                "Mi Mini Mart"
            )
        }
    }

}

@Preview
@Composable
fun AppTopNavBarPreview() {
    AppTopNavBar()
}

@Preview(showSystemUi = true)
@Composable
fun AppTopNavBarPreviewDevice() {
    Scaffold(
        topBar = { AppTopNavBar() }
    ) { padding ->

    }

}