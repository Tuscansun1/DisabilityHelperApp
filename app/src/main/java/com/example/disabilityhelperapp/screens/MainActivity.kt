package com.example.disabilityhelperapp.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.disabilityhelperapp.components.BottomBar
import com.example.disabilityhelperapp.components.TopBar
import com.example.disabilityhelperapp.helpers.ReminderWorker
import com.example.disabilityhelperapp.ui.theme.DisabilityHelperAPPTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisabilityHelperAPPTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MyScreen() // Use your screen composable here
                }
            }
        }
        ReminderWorker.scheduleReminder(applicationContext)
    }
}

@Composable
fun MyScreen() {
    Scaffold(
        topBar = {
            TopBar(
                title = "DisabilityHelperAPP",
                navigationIcon = Icons.Filled.Menu,
                onNavigationIconClick = { /* Handle menu click */ }
            )
        },
        bottomBar = {
            BottomBar(
                actions = listOf(
                    Pair(Icons.Filled.Home, { /* Handle Home click */ }),
                    Pair(Icons.Filled.Search, { /* Handle Search click */ })
                )
            )
        }
    ) { innerPadding ->
        // Your screen content goes here
        // Apply padding to the content to avoid overlap with the top and bottom bars
        Modifier.padding(innerPadding)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DisabilityHelperAPPTheme {
        MyScreen() // Preview the screen composable
    }
}
