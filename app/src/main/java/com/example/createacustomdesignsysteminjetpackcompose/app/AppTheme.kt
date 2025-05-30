package com.example.createacustomdesignsysteminjetpackcompose.app

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import com.example.createacustomdesignsysteminjetpackcompose.ui.theme.DarkColors
import com.example.createacustomdesignsysteminjetpackcompose.ui.theme.LightColors

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {

    val colorScheme = if (useDarkTheme) DarkColors else LightColors
//
//    val typography = Typography(
//        headlineLarge = headlineLarge(),
//        headline = headline(),
//        titleLarge = titleLarge(),
//        title = title(),
//        titleMedium = titleMedium(),
//        body = body(),
//        caption = caption(),
//    )
//
//    CompositionLocalProvider(
//        localColorScheme provides colorScheme,
//        localTypography provides typography,
//        localDimens provides Dimens(),
//        localRadius provides Radius(),
//    ) {
//        content()
//    }
}
