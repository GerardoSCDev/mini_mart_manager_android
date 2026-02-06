package com.example.miminimart.common.ui.components.appBottomNavBar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miminimart.R
import com.example.miminimart.common.ui.colors.AppTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomNavBar(
    selected: AppScreenOptions,
    onSelected: (AppScreenOptions) -> Unit
) {

    val appColors = AppTheme.colors

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .offset(y = 2.dp),
        color = appColors.surface,
        border = BorderStroke(
            1.dp,
            appColors.border
        ),
        shape = RoundedCornerShape(25.dp)
    ) {

        Row(
            modifier = Modifier
                .padding(16.dp)
                .padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            AppBottomNavBarButton(
                title = "Panel",
                iconRes = R.drawable.ic_bottom_nav_bar_dashboard,
                isSelected = selected == AppScreenOptions.DASHBOARD,
                onClick = { onSelected(AppScreenOptions.DASHBOARD) }
            )

            AppBottomNavBarButton(
                title = "Inventario",
                iconRes = R.drawable.ic_bottom_nav_bar_inventory,
                isSelected = selected == AppScreenOptions.INVENTORY,
                onClick = { onSelected(AppScreenOptions.INVENTORY) }
            )

            AppBottomNavBarButton(
                title = "Ventas",
                iconRes = R.drawable.ic_bottom_nav_bar_sell,
                isSelected = selected == AppScreenOptions.SELL,
                onClick = { onSelected(AppScreenOptions.SELL) }
            )

            AppBottomNavBarButton(
                title = "Configuracion",
                iconRes = R.drawable.ic_bottom_nav_bar_config,
                isSelected = selected == AppScreenOptions.CONFIG,
                onClick = { onSelected(AppScreenOptions.CONFIG) }
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppBottomNavBarPreviewDevice() {

    var screenSelected by remember { mutableStateOf(AppScreenOptions.DASHBOARD) }

    Scaffold(
        bottomBar = { AppBottomNavBar(
            selected = screenSelected,
            onSelected = { screenSelected = it }
        ) }
    ) {
        Text(
            text = screenSelected.name,
            modifier = Modifier.padding(it)
        )

    }
}

enum class AppScreenOptions {
    DASHBOARD,
    INVENTORY,
    SELL,
    CONFIG
}