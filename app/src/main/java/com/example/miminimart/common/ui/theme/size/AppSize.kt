package com.example.miminimart.common.ui.theme.size

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Immutable
data class AppSize(
    val cornerRadiusPercentage: Int,
    val elevation: Dp,
    val paddingDefault: Dp,
    val borderWith: Dp,
    val iconSize: Dp,

    val titleFont: TextUnit,
    val textFieldFont: TextUnit
)

val AppConfigSize = AppSize(
    cornerRadiusPercentage = 25,
    elevation = 2.dp,
    paddingDefault = 10.dp,
    borderWith = 1.dp,
    iconSize = 24.dp,
    titleFont = 14.sp,
    textFieldFont = 14.sp
)