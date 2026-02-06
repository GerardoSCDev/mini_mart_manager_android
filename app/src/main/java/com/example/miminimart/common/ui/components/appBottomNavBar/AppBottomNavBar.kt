package com.example.miminimart.common.ui.components.appBottomNavBar

import android.view.Surface
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBottomNavBar(onSelected: (AppScreenOptions) -> Unit) {

    var screenSelected by remember { mutableStateOf(AppScreenOptions.DASHBOARD) }

    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp)
            .offset(y = 2.dp),
        color = Color(0xFF0B1F1A),
        border = BorderStroke(1.dp, Color(0xFF1A3A33)),
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
                isSelected = screenSelected == AppScreenOptions.DASHBOARD,
                onClick = {
                    screenSelected = AppScreenOptions.DASHBOARD
                    onSelected(AppScreenOptions.DASHBOARD)
                }
            )

            AppBottomNavBarButton(
                title = "Inventario",
                isSelected = screenSelected == AppScreenOptions.INVENTORY,
                onClick = {
                    screenSelected = AppScreenOptions.INVENTORY
                    onSelected(AppScreenOptions.INVENTORY)
                }
            )

            AppBottomNavBarButton(
                title = "Ventas",
                isSelected = screenSelected == AppScreenOptions.SELL,
                onClick = {
                    screenSelected = AppScreenOptions.SELL
                    onSelected(AppScreenOptions.SELL)
                }
            )

            AppBottomNavBarButton(
                title = "Configuracion",
                isSelected = screenSelected == AppScreenOptions.CONFIG,
                onClick = {
                    screenSelected = AppScreenOptions.CONFIG
                    onSelected(AppScreenOptions.CONFIG)
                }
            )
        }
    }
}

@Composable
fun AppBottomNavBarButton(title: String, isSelected: Boolean, onClick: () -> Unit) {
    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(if (isSelected) 0xFF134E4A else 0xFF0D2721),
            contentColor = Color(color = 0xFF9BC3BA),
        ),
        border = BorderStroke(1.dp, Color(0xFF1A3A33)),
        modifier = Modifier.height(50.dp).width(80.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = onClick
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "",
                tint = Color(color = 0xFF9BC3BA)
            )
            Text(
                text = title,
                fontSize = 10.sp,
            )
        }
    }
}

@Preview
@Composable
fun AppBottomNavBarPreview() {
    AppBottomNavBar(
        onSelected = {}
    )
}

@Preview(showSystemUi = true)
@Composable
fun AppBottomNavBarPreviewDevice() {

    var screenSelected by remember { mutableStateOf(AppScreenOptions.DASHBOARD) }

    Scaffold(
        bottomBar = { AppBottomNavBar(
            onSelected = { option ->
                screenSelected = option
            }
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