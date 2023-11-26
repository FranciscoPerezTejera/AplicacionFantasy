package com.example.aplicacionfantasy.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacionfantasy.pantallaDatos.PantallaDatos
import com.example.aplicacionfantasy.pantallanuevopokemon.PantallaNuevoPokemon
import com.example.aplicacionfantasy.pantallaprincipal.PantallaPrincipal
import com.example.aplicacionfantasy.ruta.Rutas

@Composable
fun GrafoNavegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.PantallaPrincipal.ruta) {
        composable(Rutas.PantallaPrincipal.ruta) {backStackEntry ->
            val arguments = backStackEntry.arguments
            val nombrePokemon = arguments?.getBundle("nombrePokemon")

            PantallaPrincipal(navController =  navController, nombrePokemon = nombrePokemon)
        }
        composable(Rutas.PantallaNuevoPokemon.ruta) {
            PantallaNuevoPokemon(navController =  navController)
        }
        composable(Rutas.PantallaDatos.ruta  + "/{nombrePokemon}") {
            llamada ->
            val pokemon = llamada.arguments?.getString("nombrePokemon")
            if (pokemon != null) {
                PantallaDatos(nombre = pokemon)
            }
        }
    }
}