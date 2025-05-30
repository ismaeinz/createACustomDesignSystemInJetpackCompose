package com.example.createacustomdesignsysteminjetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

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
    onBackground = Purple40,
    primary = Purple40,
    onPrimary = PurpleGrey40,
    secondary = Pink40,
    onSecondary = Pink80
)
private val typography = AppTypography(
    titleLarge = TextStyle(
        fontFamily = Dancing
    ),
    titleNormal = TextStyle(
        fontFamily = Dancing
    ),
    body = TextStyle(
        fontFamily = Dancing
    ),
    labelLarge = TextStyle(
        fontFamily = Dancing
    ),
    labelNormal = TextStyle(
        fontFamily = Dancing
    ),
    labelSmall = TextStyle(
        fontFamily = Dancing
    ),
)
private val shape = AppShape(
    container = RoundedCornerShape(12.dp), button = RoundedCornerShape(12.dp)
)
private val size = AppSize(
    large = 24.dp, medium = 16.dp, normal = 10.dp, small = 9.dp
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