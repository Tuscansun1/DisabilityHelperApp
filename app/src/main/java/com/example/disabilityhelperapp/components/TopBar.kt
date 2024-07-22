package com.example.disabilityhelperapp.components

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar(
    title: String,
    navigationIcon: ImageVector? = null,
    onNavigationIconClick: (() -> Unit)? = null
) {
    TopAppBar(
        title = {
            Text(
                text = title,
                style = MaterialTheme.typography.titleLarge.copy(fontSize = 20.sp)
            )
        },
        navigationIcon = {
            navigationIcon?.let {
                IconButton(onClick = { onNavigationIconClick?.invoke() }) {
                    Icon(it, contentDescription = "Navigation Icon")
                }
            }
        },
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewMyTopBar() {
    TopBar(title = "My App")
}