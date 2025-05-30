package com.example.createacustomdesignsysteminjetpackcompose.app.presention.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val darkColorScheme = AppColorScheme(
    background = Color.Black,
    onBackground = Purple80,
    primary = Purple40,
    onPrimary = PurpleGrey80,
    secondary = Pink40,
    onSecondary = Pink80
)

private val lightColorScheme = AppColorScheme(
    background = Color.White,
    onBackground = Purple40, primary = PurpleGrey80,
    onPrimary = PurpleGrey40,
    secondary = Pink40, onSecondary = Pink40
)


private val typography = AppTypography(
    titleLarge = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
    titleNormal = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
    body = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
    labelLarge = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
    labelNormal = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Dancing, fontWeight = FontWeight.Bold, fontSize = 24.sp
    ),
)

private val shape = AppShape(
    container = RoundedCornerShape(12.dp), button = RoundedCornerShape(50)
)
private val size = AppSize(
    large = 24.dp, medium = 16.dp, normal = 8.dp, small = 6.dp
)


@Composable
fun AppTheme(
    isDarkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit
) {
    val colorScheme = if (isDarkTheme) darkColorScheme else lightColorScheme
//    val rippleIndication = rememberRipple()
    CompositionLocalProvider(
        LocalAppColorScheme provides colorScheme,
        LocalAppTypography provides typography,
        LocalAppShape provides shape,
        LocalAppSize provides size,
//        LocalIndication provides rippleIndication,
        content = content

    )
}

object AppTheme {
    val colorScheme: AppColorScheme
        @Composable get() = LocalAppColorScheme.current
    val typography: AppTypography
        @Composable get() = LocalAppTypography.current
    val shape: AppShape
        @Composable get() = LocalAppShape.current
    val size: AppSize
        @Composable get() = LocalAppSize.current

}