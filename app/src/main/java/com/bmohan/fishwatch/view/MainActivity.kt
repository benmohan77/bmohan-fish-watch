package com.bmohan.fishwatch.view

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Main()
        }
    }

    @Composable
    fun Main() {
        val navController = rememberNavController()
        NavHost(navController = navController, startDestination = "fish") {
            composable("fish") { }
            composable(
                "fish/{id}",
                arguments = listOf(navArgument("id") { type = NavType.StringType })
            ) {

            }
        }

    }
}