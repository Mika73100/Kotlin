package com.example.monresto.ui.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.monresto.data.DataService
import com.example.monresto.model.Screens

@Composable
fun Home() {

    //Création du navigationController.
    val navigationController = rememberNavController()

    //Suivre le menu actif.
    var menu by remember { mutableStateOf(DataService().americain) }

    //BackStackEntry
    val backStackEntry by navigationController.currentBackStackEntryAsState()

    //ScreenActuelle
    val currentScreen = Screens.valueOf(backStackEntry?.destination?.route ?: Screens.Home.title)

    Scaffold(
        topBar = {
            AppBar(
                screens = currentScreen,
                up = { navigationController.navigateUp() },
                canGoBack = navigationController.previousBackStackEntry != null
            )
        },
        content = { paddingValues ->
            NavHost(
                navController = navigationController,
                startDestination = Screens.Home.name,
                modifier = Modifier.padding(paddingValues)
            ) {
                // NavGraph
                composable(route = Screens.Home.name) {
                    HomeScreen(onClick = { newMenu ->
                        menu = newMenu
                        navigationController.navigate(route = Screens.Entree.name)
                    })
                }
                composable(route = Screens.Entree.name) {
                    DetailView(article = menu.entree, btnTitle = "Vers les plats", onClick = {
                        navigationController.navigate(route = Screens.Plat.name)
                    })
                }
                composable(route = Screens.Plat.name) {
                    DetailView(article = menu.plat, btnTitle = "Vers les desserts", onClick = {
                        navigationController.navigate(route = Screens.Dessert.name)
                    })
                }
                composable(route = Screens.Dessert.name) {
                    DetailView(article = menu.dessert, btnTitle = "Retour aux menus", onClick = {
                        navigationController.popBackStack(Screens.Home.name, inclusive = false)
                    })
                }
            }
        }
    )
}
