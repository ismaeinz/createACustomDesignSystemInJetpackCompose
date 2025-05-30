package com.example.createacustomdesignsysteminjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.createacustomdesignsysteminjetpackcompose.app.presention.composable.PrimaryButton
import com.example.createacustomdesignsysteminjetpackcompose.app.presention.composable.SecondaryButton
import com.example.createacustomdesignsysteminjetpackcompose.app.presention.theme.AppTheme
import com.example.createacustomdesignsysteminjetpackcompose.app.presention.theme.Dancing

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(), color = AppTheme.colorScheme.background
                ) {
                    Test()
                }

            }
        }
    }
}

@Composable
fun Test() {
    Column(
        Modifier.padding(16.dp)
    ) {
        Text(text = "From AppTheme", style = AppTheme.typography.body)
        Spacer(modifier = Modifier.height(12.dp))
        Text(text = "Direct FontFamily", fontFamily = Dancing, fontSize = 24.sp)
        PrimaryButton(label = "Primary", onClick = {})
        SecondaryButton(label = "OutlinedButton", onClick = {})

    }
}