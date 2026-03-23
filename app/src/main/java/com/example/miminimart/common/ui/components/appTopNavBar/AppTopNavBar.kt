package com.example.miminimart.common.ui.components.appTopNavBar

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miminimart.R
import com.example.miminimart.common.ui.theme.AppTheme

@Composable
fun AppTopNavBar(title: String = "") {

    val appColors = AppTheme.colors
    val appSize = AppTheme.size

    Surface(
        modifier = Modifier
            .padding(appSize.paddingDefault)
            .fillMaxWidth()
            .statusBarsPadding()
            .height(55.dp),
        color = appColors.surface,
        border = BorderStroke(appSize.borderWith, appColors.border),
        shape = RoundedCornerShape(appSize.cornerRadiusPercentage),
        shadowElevation = appSize.elevation,
    ) {
        Row(
            modifier = Modifier
                .padding(appSize.paddingDefault),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                title,
                color = appColors.text,
                fontSize = appSize .titleFont,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(Modifier.weight(1f))
            AppTopNavBarButton(
                onClick = {}
            )
        }
    }

}

@Composable
fun AppTopNavBarButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {

    val appColors = AppTheme.colors
    val appSize = AppTheme.size

    Surface(
        onClick = onClick,
        modifier = modifier.size(40.dp),
        shape = RoundedCornerShape(appSize.cornerRadiusPercentage),
        color = appColors.surface2,
        border = BorderStroke(
            appSize.borderWith,
            appColors.border
        ),
        shadowElevation = appSize.elevation,
        tonalElevation = appSize.elevation
    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_top_nav_bar_bell),
                contentDescription = "Notification",
                tint = appColors.text,
                modifier = Modifier.size(appSize.iconSize)
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppTopNavBarPreviewDevice() {
    Scaffold(
        topBar = { AppTopNavBar("Titulo") }
    ) { padding ->

    }

}