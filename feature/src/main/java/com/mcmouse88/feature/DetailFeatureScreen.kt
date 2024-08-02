package com.mcmouse88.feature

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun DetailFeatureScreen(
    onBackClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = onBackClick,
            modifier = Modifier.align(alignment = Alignment.Center)
        ) {
            Text("Back")
        }
    }
}