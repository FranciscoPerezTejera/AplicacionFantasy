package com.example.aplicacionfantasy.ruta

sealed class Rutas (val ruta : String) {

    object PantallaPrincipal: Rutas("pantallaprincipal")
    object PantallaNuevoPokemon: Rutas("pantallanuevopokemon")
    object PantallaDatos: Rutas("pantalladatos")

}