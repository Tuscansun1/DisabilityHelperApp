package com.example.disabilityhelperapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.disabilityhelperapp.components.TopBar

@Composable
fun BasicExercisesScreen() {
    Scaffold(
        topBar = {
            TopBar(
                title = "Basic Exercises",
                navigationIcon = Icons.AutoMirrored.Filled.ArrowBack,
                onNavigationIconClick = { /* Handle back navigation */ }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Exercises with Prosthetic Leg",
                style = MaterialTheme.typography.headlineSmall
            )
            // Add exercises
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Exercises without Prosthetic Leg",
                style = MaterialTheme.typography.headlineSmall
            )
            // Add exercises
        }
    }
}
