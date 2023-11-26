package com.example.aplicacionfantasy.pantallaDatos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.aplicacionfantasy.clases.ListaDePokemons
import com.example.aplicacionfantasy.clases.Pokemon

@Composable
fun PantallaDatos(nombre: String) {

    val pokemones: List<Pokemon> = ListaDePokemons()
    val pokemon: Pokemon = pokemones.find { it.nombrePokemon.equals(nombre, ignoreCase = true) }!!

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {

        Text(
            text = "${pokemon.nombrePokemon} #${pokemon.numeroPokedex}",
            modifier = Modifier.padding(7.dp),
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = pokemon.fotoPokemon, contentDescription = "",
            modifier = Modifier
                .padding(7.dp)
                .size(450.dp)
        )
        Row (modifier = Modifier.padding(8.dp)){
            Column {
                Text(text = "Tipo: ${pokemon.tipoPrincipal}",
                    modifier = Modifier.padding(7.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = "PS: ${pokemon.cantidadPs}",
                    modifier = Modifier.padding(7.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = "ATK: ${pokemon.ataque}",
                    modifier = Modifier.padding(7.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = "DEF: ${pokemon.defensa}",
                    modifier = Modifier.padding(7.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
                Text(text = "SPEED: ${pokemon.velocidad}",
                    modifier = Modifier.padding(7.dp),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold)
            }
        }
        Text(text = pokemon.descripcion,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewHome() {
    //PantallaDatos(null)
}
