package com.example.miminimart.modules.main.view

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miminimart.common.ui.components.appBottomNavBar.AppBottomNavBar
import com.example.miminimart.common.ui.components.appBottomNavBar.AppScreenOptions
import com.example.miminimart.modules.config.view.ConfigView
import com.example.miminimart.modules.dashboard.view.DashboardView
import com.example.miminimart.modules.inventory.view.InventoryView
import com.example.miminimart.modules.sell.view.SellView

@Composable
fun MainView() {

    var screenSelected by remember { mutableStateOf(AppScreenOptions.DASHBOARD) }

    Scaffold(
        bottomBar = { AppBottomNavBar(
            selected = screenSelected,
            onSelected = { screenSelected = it }
        ) }
    ) { padding ->
        Box(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize()
        )
        {
            when (screenSelected) {
                AppScreenOptions.DASHBOARD -> DashboardView()
                AppScreenOptions.INVENTORY -> InventoryView()
                AppScreenOptions.SELL -> SellView()
                AppScreenOptions.CONFIG -> ConfigView()
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainViewPreview() {
    MainView()
}