package com.example.marvelapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelapp.screens.Filters
import com.example.marvelapp.screens.Main

sealed class Router(val route:String ){
        object Main:Router("main_screen")
        object Filter:Router("filter_screen")
    }
@Composable
fun MarvelAppNavHost(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Router.Main.route){
        composable(Router.Main.route){ Main(navController = navController) }
        composable(Router.Filter.route){ Filters() }
    }
}