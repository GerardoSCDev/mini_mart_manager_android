package com.example.miminimart.modules.dashboard.view

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.miminimart.common.ui.components.appTextField.AppSearchTextField
import com.example.miminimart.common.ui.components.appTopNavBar.AppTopNavBar
import com.example.miminimart.common.ui.theme.AppTheme

@Composable
fun DashboardView(
    paddingValues: PaddingValues
) {

    val appSize = AppTheme.size
    val appColors = AppTheme.colors
    val shape = RoundedCornerShape(appSize.cornerRadiusPercentage)
    var searchText by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier
            .padding(paddingValues),
        topBar = { AppTopNavBar(title = "Panel") }
    ) { padding ->

        Column(
            modifier = Modifier.padding(appSize.paddingDefault)
        ) {
            AppSearchTextField(
                value = searchText,
                onValueChange = { searchText = it },
                paddingValues = padding,
                onScanClick = {}
            )
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
