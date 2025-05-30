package com.example.createacustomdesignsysteminjetpackcompose.app.presention.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.createacustomdesignsysteminjetpackcompose.app.presention.theme.AppTheme

@Composable
fun PrimaryButton(modifier: Modifier = Modifier, label: String, onClick: () -> Unit) {
    Button(
        modifier = modifier, onClick = onClick, colors = ButtonDefaults.buttonColors(
            containerColor = AppTheme.colorScheme.onPrimary,
            contentColor = AppTheme.colorScheme.primary
        ),
        shape = AppTheme.shape.button
    ) {
        Text(label, style = AppTheme.typography.labelLarge)
    }

}

@Composable
fun SecondaryButton(modifier: Modifier = Modifier, label: String, onClick: () -> Unit) {
    OutlinedButton(
        modifier = modifier,
        onClick = onClick,
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = AppTheme.colorScheme.primary,
            contentColor = AppTheme.colorScheme.onPrimary
        ),
        shape = AppTheme.shape.button,
        border = BorderStroke(2.dp, AppTheme.colorScheme.onSecondary)
    ) {
        Text(label, style = AppTheme.typography.labelLarge)
    }

}