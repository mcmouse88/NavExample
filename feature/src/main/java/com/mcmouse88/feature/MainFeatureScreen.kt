package com.mcmouse88.feature

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainFeatureScreen(
    onDetailClick: () -> Unit
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Button(
            onClick = onDetailClick,
            modifier = Modifier.align(alignment = Alignment.Center)
        ) {
            Text("Detail")
        }
    }
}