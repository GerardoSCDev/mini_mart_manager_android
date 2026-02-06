package com.example.miminimart.common.ui.colors

import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

@Immutable
data class AppColors(
    val bg: Color,
    val surface: Color,
    val surface2: Color,
    val border: Color,
    val text: Color,
    val textMuted: Color,
    val textSubtle: Color,

    val primary: Color,
    val primaryHover: Color,
    val primaryPressed: Color,
    val onPrimary: Color,
    val primarySoft: Color,

    val successSolid: Color,
    val successSoft: Color,

    val warningSolid: Color,
    val warningSoft: Color,

    val dangerSolid: Color,
    val dangerSoft: Color,

    val infoSolid: Color,
    val infoSoft: Color,
)


val LightColors = AppColors(
    bg = Color(0xFFF6FBFA),
    surface = Color(0xFFFFFFFF),
    surface2 = Color(0xFFECF7F4),
    border = Color(0xFFD7E7E2),
    text = Color(0xFF0B1F1A),
    textMuted = Color(0xFF3B5B53),
    textSubtle = Color(0xFF6B877F),

    primary = Color(0xFF0F766E),
    primaryHover = Color(0xFF115E59),
    primaryPressed = Color(0xFF134E4A),
    onPrimary = Color(0xFFFFFFFF),
    primarySoft = Color(0xFFCCFBF1),

    successSolid = Color(0xFF16A34A),
    successSoft = Color(0xFFDCFCE7),

    warningSolid = Color(0xFFD97706),
    warningSoft = Color(0xFFFFEDD5),

    dangerSolid = Color(0xFFDC2626),
    dangerSoft = Color(0xFFFEE2E2),

    infoSolid = Color(0xFF0284C7),
    infoSoft = Color(0xFFE0F2FE),
)

val DarkColors = AppColors(
    bg = Color(0xFF071714),
    surface = Color(0xFF0B1F1A),
    surface2 = Color(0xFF0D2721),
    border = Color(0xFF1A3A33),
    text = Color(0xFFE6F4F1),
    textMuted = Color(0xFF9BC3BA),
    textSubtle = Color(0xFF6F958C),

    primary = Color(0xFF2DD4BF),
    primaryHover = Color(0xFF14B8A6),
    primaryPressed = Color(0xFF0D9488),
    onPrimary = Color(0xFF071714),
    primarySoft = Color(0xFF134E4A),

    successSolid = Color(0xFF16A34A),
    successSoft = Color(0xFF0B2A1A),

    warningSolid = Color(0xFFD97706),
    warningSoft = Color(0xFF2A1D0B),

    dangerSolid = Color(0xFFDC2626),
    dangerSoft = Color(0xFF2A0B0B),

    infoSolid = Color(0xFF0284C7),
    infoSoft = Color(0xFF0B1F2A),
)