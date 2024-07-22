package com.example.disabilityhelperapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.disabilityhelperapp.components.TopBar

@Composable
fun AdvancedExercisesScreen(isUnlocked: Boolean) {
    Scaffold(
        topBar = {
            TopBar(
                title = "Advanced Exercises",
                navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onNavigationIconClick = { /* Handle back navigation */ }
            )
        }
    ) { innerPadding ->
        if (isUnlocked) {
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .padding(16.dp)
            ) {
                Text(text = "Advanced Exercises", style = MaterialTheme.typography.headlineSmall)
                // Add advanced exercises here
            }
        } else {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(innerPadding),
                contentAlignment = Alignment.Center
            ) {
                Text(text = "Complete the basic exercises to unlock advanced exercises.")
            }
        }
    }
}
