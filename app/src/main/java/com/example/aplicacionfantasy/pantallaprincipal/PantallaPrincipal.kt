@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.aplicacionfantasy.pantallaprincipal


import android.annotation.SuppressLint
import android.os.Bundle
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aplicacionfantasy.R
import com.example.aplicacionfantasy.clases.ListaDePokemons
import com.example.aplicacionfantasy.clases.Pokemon
import com.example.aplicacionfantasy.ruta.Rutas


@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PantallaPrincipal(navController: NavHostController, nombrePokemon: Bundle?) {

    val contexto = LocalContext.current
    var elDialogoEstaAbierto by remember { mutableStateOf(false) }
    var isButtonEnabled by remember { mutableStateOf(true) }
    var query by remember { mutableStateOf("") }
    var active by remember { mutableStateOf(false) }
    val pokemones : List<Pokemon> = ListaDePokemons()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween) {
        Text(text = "BIENVENIDOS AL POKEMON FANTASY LEAGUE",
            modifier = Modifier.padding(10.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold)

        SearchBar   (
            query = query,
            onQueryChange = { query = it },
            onSearch = { active = false },
            active = active,
            onActiveChange = { active = it },
            placeholder = { Text(text = "Buscar") },
            leadingIcon = {
                IconButton(
                    onClick = { },
                    modifier = Modifier.padding(4.dp)
                ) { Icon(painterResource(id = R.drawable.pokeball),
                        contentDescription = null,
                        modifier = Modifier.padding(3.dp)) } },
            trailingIcon = {
                IconButton(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(4.dp)
                ) { Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.padding(3.dp))}},
                        modifier = Modifier.fillMaxWidth())
        {
            val pokemonesFiltrados = pokemones.filter { it.tipoPrincipal.contains(query, ignoreCase = true) }
            LazyColumn(modifier = Modifier
                .fillMaxWidth()
                .weight(1f)) {
                items(pokemonesFiltrados) { pokemon -> ListaDePokemons(pokemon) }
            }
        }
        val pokemonesFiltrados = pokemones.filter { it.tipoPrincipal.contains(query, ignoreCase = true) }
        LazyColumn(modifier = Modifier
            .fillMaxWidth()
            .weight(1f))
        {
            items(pokemonesFiltrados) { pokemon -> ElementoListaCard(pokemon, navController) }
        }

        Row (modifier = Modifier.fillMaxWidth()){
            ExtendedFloatingActionButton(
                onClick = { navController.navigate(Rutas.PantallaNuevoPokemon.ruta) },
                modifier = Modifier
                    .padding(8.dp)
                    .weight(2f),)
            {
                Text(
                    text = "ADD",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp),
                )
                Icon(
                    imageVector = Icons.Default.AddCircle,
                    contentDescription = null,
                    tint = Color.Blue,
                    modifier = Modifier.padding(8.dp)
                )
            }
            ExtendedFloatingActionButton(onClick = {  },
                modifier = Modifier
                    .padding(8.dp)
                    .weight(2f))
            {
                Text(
                    text = "DELETE",
                    fontSize = 18.sp,
                    fontFamily = FontFamily.Default,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(8.dp),
                )
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    tint = Color.Blue,
                    modifier = Modifier.padding(8.dp)
                )
            }
        }
    }
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHome() {
    // PantallaPrincipal(navController = null)
}