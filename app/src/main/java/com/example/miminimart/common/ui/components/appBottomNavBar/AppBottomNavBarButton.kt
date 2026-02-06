package com.example.miminimart.common.ui.components.appBottomNavBar

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miminimart.common.ui.colors.AppTheme

@Composable
fun AppBottomNavBarButton(title: String, @DrawableRes iconRes: Int, isSelected: Boolean, onClick: () -> Unit) {

    val appColors = AppTheme.colors
    val containerColor = if (isSelected) appColors.primarySoft else appColors.surface2
    val contentColor = if (isSelected) appColors.text else appColors.textMuted

    Button(
        colors = ButtonDefaults.buttonColors(
            containerColor = containerColor,
            contentColor = contentColor,
        ),
        border = BorderStroke(
            1.dp,
            appColors.border
        ),
        modifier = Modifier.height(50.dp).width(80.dp),
        contentPadding = PaddingValues(0.dp),
        onClick = onClick
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(iconRes),
                contentDescription = title,
                tint = contentColor,
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = title,
                fontSize = 10.sp,
            )
        }
    }
}