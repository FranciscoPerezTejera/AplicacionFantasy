@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.aplicacionfantasy.pantallanuevopokemon

import android.os.Bundle
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.aplicacionfantasy.clases.ListaDePokemons
import com.example.aplicacionfantasy.clases.Pokemon
import com.example.aplicacionfantasy.ruta.Rutas

@Composable
fun PantallaNuevoPokemon(navController: NavHostController) {

    var expandirNombre by remember { mutableStateOf(false) }
    var nombrePokemon by remember { mutableStateOf("") }
    var tipoPokemon by remember { mutableStateOf("") }
    var numeroDePokedex by remember { mutableStateOf("") }
    var sliderValuePS by remember { mutableStateOf(0f) }
    var sliderValueATK by remember { mutableStateOf(0f) }
    var sliderValueDEF by remember { mutableStateOf(0f) }
    var sliderValueSPEED by remember { mutableStateOf(0f) }
    var painterSeleccionado by remember { mutableStateOf<Painter?>(null) }
    var descripcion by remember { mutableStateOf("") }

    val listaPokemons = ListaDePokemons()
    val listaDeNombres: List<String> = listaPokemons.map { it.nombrePokemon }


    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(8.dp)
    ) {
        Text(
            text = "Introduce el nombre del nuevo pokemon:",
            modifier = Modifier.fillMaxWidth()
        )
        ExposedDropdownMenuBox(
            expanded = expandirNombre,
            onExpandedChange = { expandirNombre = !expandirNombre },
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TextField(
                value = nombrePokemon,
                onValueChange = { },
                readOnly = true,
                modifier = Modifier
                    .fillMaxWidth()
                    .menuAnchor(),
                label = { Text("Selecciona un pokemon") },
                trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandirNombre) }
            )
            DropdownMenu(
                expanded = expandirNombre,
                onDismissRequest = { expandirNombre = false },
                modifier = Modifier.fillMaxWidth()
            ) {
                listaDeNombres.forEach { nombre ->
                    DropdownMenuItem(
                        modifier = Modifier.fillMaxWidth(),
                        text = { Text(text = nombre) },
                        onClick = {
                            nombrePokemon = nombre
                            tipoPokemon =
                                listaPokemons.find { it.nombrePokemon == nombre }?.tipoPrincipal.orEmpty()
                            numeroDePokedex =
                                listaPokemons.find { it.nombrePokemon == nombre }?.numeroPokedex.orEmpty()
                            painterSeleccionado =
                                listaPokemons.find { it.nombrePokemon == nombre }?.fotoPokemon
                            descripcion =
                                listaPokemons.find { it.nombrePokemon == nombre }?.descripcion.toString()

                            expandirNombre = false
                        }
                    )
                }
            }
        }
        Text(
            text = "Tipo del pokemon",
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = tipoPokemon,
            onValueChange = { },
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Número de la pokedex",
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = numeroDePokedex,
            onValueChange = { },
            readOnly = true,
            modifier = Modifier
                .fillMaxWidth()
        )
        Row {
            Text(text = "PS (Puntos de Salud) : ")
            Text(text = sliderValuePS.toInt().toString())
        }
        Slider(value = sliderValuePS,
            valueRange = 0f..300f,
            onValueChange = { nuevoValor ->
                sliderValuePS = nuevoValor
            })
        Row {
            Text(text = "ATK (Puntos de Ataque) : ")
            Text(text = sliderValueATK.toInt().toString())
        }
        Slider(value = sliderValueATK,
            valueRange = 0f..300f,
            onValueChange = { nuevoValor ->
                sliderValueATK = nuevoValor
            })
        Row {
            Text(text = "DEF (Puntos de Defensa) : ")
            Text(text = sliderValueDEF.toInt().toString())
        }
        Slider(value = sliderValueDEF,
            valueRange = 0f..300f,
            onValueChange = { nuevoValor ->
                sliderValueDEF = nuevoValor
            })
        Row {
            Text(text = "Speed (Puntos de Velocidad) : ")
            Text(text = sliderValueSPEED.toInt().toString())
        }
        Slider(value = sliderValueSPEED,
            valueRange = 0f..300f,
            onValueChange = { nuevoValor ->
                sliderValueSPEED = nuevoValor
            })

        Button(onClick = { navController.navigate(Rutas.PantallaPrincipal.ruta) }) {
            Text(text = "AÑADIR")
        }
    }

    val pokemon = Pokemon(
        nombrePokemon,
        numeroDePokedex,
        tipoPokemon,
        sliderValuePS.toInt().toString(),
        sliderValueATK.toInt().toString(),
        sliderValueDEF.toInt().toString(),
        sliderValueSPEED.toInt().toString(),
        painterSeleccionado,
        descripcion
    )
    val bundle = Bundle()
    bundle.putParcelable("pokemon",pokemon)

    /*BackHandler {

    }*/

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHome() {
    //PantallaNuevoPokemon(navController = )
}