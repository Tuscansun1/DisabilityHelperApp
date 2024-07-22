package com.example.disabilityhelperapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavGraph(startDestination: String = "home") {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable("home") { HomeScreen(navController) }
        composable("reminders") { RemindersScreen(navController) }
        composable("care") { CareScreen(navController) }
        composable("exercises") { ExercisesScreen(navController) }
        // Add more destinations as needed
    }
}

@Composable
fun HomeScreen(navController: NavHostController) {
    // Home screen content
}

@Composable
fun RemindersScreen(navController: NavHostController) {
    // Reminders screen content
}

@Composable
fun CareScreen(navController: NavHostController) {
    // Care routine screen content
}

@Composable
fun ExercisesScreen(navController: NavHostController) {
    // Exercises screen content
}