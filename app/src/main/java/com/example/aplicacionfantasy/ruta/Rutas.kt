package com.example.aplicacionfantasy.ruta

sealed class Rutas (val ruta : String) {

    object PantallaPrincipal: Rutas("pantallaprincipal")
    object PantallaNuevoUsuario: Rutas("pantallanuevousuario")
    object PantallaDatos: Rutas("pantalladatos")

}