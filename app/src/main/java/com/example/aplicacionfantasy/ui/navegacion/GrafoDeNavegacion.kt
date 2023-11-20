package com.example.aplicacionfantasy.ui.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.aplicacionfantasy.pantallaDatos.PantallaDatos
import com.example.aplicacionfantasy.pantallanuevousuario.PantallaNuevoUsuario
import com.example.aplicacionfantasy.pantallaprincipal.PantallaPrincipal
import com.example.aplicacionfantasy.ruta.Rutas

@Composable
fun GrafoNavegacion() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Rutas.PantallaPrincipal.ruta) {
        composable(Rutas.PantallaPrincipal.ruta) {
            PantallaPrincipal(navController =  navController)
        }
        composable(Rutas.PantallaNuevoUsuario.ruta) {
            PantallaNuevoUsuario(navController =  navController)
        }
        composable(Rutas.PantallaDatos.ruta) {
            PantallaDatos(navController =  navController)
        }
    }
}