package com.example.disabilityhelperapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.disabilityhelperapp.components.TopBar

@Composable
fun CareRoutineScreen() {
    Scaffold(
        topBar = {
            TopBar(
                title = "Care Routine",
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
                text = "Care Routine for Stump",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "1. Clean your stump with mild soap and water.")
            Text(text = "2. Dry thoroughly to prevent skin irritation.")
            Text(text = "3. Inspect your stump for any signs of redness or sores.")
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Care Routine for Liner",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "1. Wash the liner daily with mild soap and water.")
            Text(text = "2. Dry completely before use to prevent moisture buildup.")
            Text(text = "3. Inspect the liner for any wear and tear regularly.")
            Spacer(modifier = Modifier.height(16.dp))
            HorizontalDivider()
            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = "Care Routine for Prosthetic Leg",
                style = MaterialTheme.typography.headlineSmall
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "1. Clean the prosthetic leg with a damp cloth regularly.")
            Text(text = "2. Check for any loose parts or damage.")
            Text(text = "3. Ensure the mechanical parts are functioning smoothly.")
            Text(text = "4. Visit your prosthetist for regular maintenance and adjustments.")
        }
    }
}


