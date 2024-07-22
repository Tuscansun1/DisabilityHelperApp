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















































































/*
 * Custom MIT License for DisabilityHelperAPP
 *
 * Copyright (c) 2024 Emile B. Oosthuizen
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, subject to the following conditions:
 *
 * 1. Attribution: The above copyright notice and this permission notice must be included in all copies
 *    or substantial portions of the Software.
 *
 * 2. Monetization Restrictions:
 *    - You may use, modify, and distribute the Software for non-commercial purposes without restriction.
 *    - For any commercial use or distribution, you must obtain written permission from the original author (Emile B. Oosthuizen).
 *
 * 3. Liability Disclaimer: The Software is provided "as is", without warranty of any kind. In no event shall
 *    the authors or copyright holders be liable for any claim, damages, or other liability, whether in an action
 *    of contract, tort, or otherwise, arising from, out of, or in connection with the Software or the use or
 *    other dealings in the Software.
 *
 * 4. Termination: This license is effective until terminated. You may terminate it at any time by destroying all
 *    copies of the Software. The license will terminate automatically if you fail to comply with any of its terms.
 *
 * 5. Governing Law: This license shall be governed by and construed in accordance with the laws of [South Africa].
 */

