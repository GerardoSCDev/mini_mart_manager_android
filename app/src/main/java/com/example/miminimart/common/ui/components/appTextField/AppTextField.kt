package com.example.miminimart.common.ui.components.appTextField

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.LocationOn
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.miminimart.R
import com.example.miminimart.common.ui.theme.AppTheme

@Composable
fun AppSearchTextField(
    value: String,
    onValueChange: (String) -> Unit,
    paddingValues: PaddingValues,
    placeholder: String = "Buscar producto o SKU",
    onScanClick: () -> Unit = {}
) {
    val appSize = AppTheme.size
    val borderColor = Color(0xFFC9DBD5)
    val textColor = Color(0xFF6F8A82)
    val trailingBg = Color(0xFFBFEAE2)
    val shape = RoundedCornerShape(appSize.cornerRadiusPercentage)

    Row(
        modifier = Modifier.padding(paddingValues)
            .fillMaxWidth()
            .height(55.dp)
            .clip(shape)
            .background(Color.White)
            .border(
                width = 1.dp,
                color = borderColor,
                shape = shape
            )
            .padding(appSize.paddingDefault),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Outlined.Search,
            contentDescription = "Buscar",
            tint = Color.Black,
            modifier = Modifier.size(appSize.iconSize)
        )

        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            singleLine = true,
            cursorBrush = SolidColor(textColor),
            textStyle = TextStyle(
                color = textColor,
                fontSize = appSize.textFieldFont
            ),
            modifier = Modifier.weight(1f).padding(horizontal = 10.dp),
            decorationBox = { innerTextField ->
                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.CenterStart
                ) {
                    if (value.isEmpty()) {
                        Text(
                            text = placeholder,
                            color = textColor,
                            fontSize = appSize.textFieldFont
                        )
                    }
                    innerTextField()
                }
            }
        )

        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(shape)
                .background(trailingBg)
                .clickable { onScanClick() },
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Default.LocationOn,
                contentDescription = "Escanear",
                tint = Color.Black
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun AppSearchTextFieldPreview() {
    var text by remember { mutableStateOf("") }

    Column() {

        Spacer(modifier = Modifier.height(100.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            AppSearchTextField(
                value = text,
                onValueChange = { text = it },
                paddingValues = PaddingValues(0.dp),
                onScanClick = {}
            )
        }
    }

}
