package com.example.aplicacionfantasy.pantallaprincipal

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.aplicacionfantasy.clases.Pokemon
import com.example.aplicacionfantasy.R
@Composable
fun ListaDePokemons (pokemon: Pokemon) {

    var filaExpandida by remember { mutableStateOf(false) }

    Row (modifier = Modifier
        .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween){
        Image(painter =painterResource(id = R.drawable.pokebola), contentDescription = null,
            modifier = Modifier
                .size(40.dp)
                .padding(8.dp))
        Text(text = pokemon.nombrePokemon)
        Icon(imageVector = Icons.Default.Star, contentDescription = null)
    }

}