package com.example.miminimart.modules.dashboard.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miminimart.R
import com.example.miminimart.common.ui.components.appTopNavBar.AppTopNavBar
import com.example.miminimart.common.ui.theme.AppTheme

@Composable
fun DashboardView(
    paddingValues: PaddingValues
) {

    val appSize = AppTheme.size
    val appColors = AppTheme.colors
    val shape = RoundedCornerShape(appSize.cornerRadiusPercentage)
    val state = remember { TextFieldState() }

    Scaffold(
        modifier = Modifier
            .padding(paddingValues),
        topBar = { AppTopNavBar(title = "Panel") }
    ) { padding ->
        Row(modifier = Modifier.padding(padding)) {

            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(56.dp),
                shape = shape,
                color = appColors.surface,
                border = BorderStroke(
                    appSize.borderWith,
                    appColors.border
                ),
                shadowElevation = appSize.elevation,
                tonalElevation = appSize.elevation
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, end = 10.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        modifier = Modifier.size(appSize.iconSize),
                        painter = painterResource(R.drawable.ic_top_nav_bar_bell),
                        contentDescription = "Notification",

                    )
                    BasicTextField(state)
                    Icon(
                        painter = painterResource(R.drawable.ic_top_nav_bar_bell),
                        contentDescription = "Notification",
                        tint = appColors.text,
                        modifier = Modifier.size(appSize.iconSize)
                    )
                }
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun DashboardViewPreview() {
    Scaffold() { paddingValues ->
        DashboardView(paddingValues)
    }

}
