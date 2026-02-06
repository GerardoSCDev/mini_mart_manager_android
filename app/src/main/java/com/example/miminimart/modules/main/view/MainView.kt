package com.example.miminimart.modules.main.view

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.example.miminimart.common.ui.components.appBottomNavBar.AppBottomNavBar
import com.example.miminimart.common.ui.components.appBottomNavBar.AppScreenOptions
import com.example.miminimart.common.ui.components.appTopNavBar.AppTopNavBar

@Composable
fun MainView() {

    var screenSelected by remember { mutableStateOf(AppScreenOptions.DASHBOARD) }

    Scaffold(
        topBar = { AppTopNavBar() },
        bottomBar = { AppBottomNavBar(
            onSelected = { screenSelected = it }
        ) }
    ) { padding ->

    }
}

@Preview(showSystemUi = true)
@Composable
fun MainViewPreview() {
    MainView()
}