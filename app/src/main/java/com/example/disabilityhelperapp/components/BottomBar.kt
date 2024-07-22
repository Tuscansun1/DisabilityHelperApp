package com.example.disabilityhelperapp.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector

@Composable
fun BottomBar(
    actions: List<Pair<ImageVector, () -> Unit>> = listOf()
) {
    BottomAppBar {
        actions.forEach { (icon, onClick) ->
            IconButton(onClick = { onClick() }) {
                Icon(icon, contentDescription = null)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMyBottomBar() {
    // Example icons and actions
    BottomBar(
        actions = listOf(
            Pair(Icons.Filled.Home, { /* TODO: Handle Home click */ }),
            Pair(Icons.Filled.Search, { /* TODO: Handle Search click */ })
        )
    )
}
