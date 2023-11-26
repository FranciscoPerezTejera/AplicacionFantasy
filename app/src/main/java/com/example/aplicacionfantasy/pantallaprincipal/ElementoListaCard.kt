@file:OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterial3Api::class)

package com.example.aplicacionfantasy.pantallaprincipal

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.aplicacionfantasy.clases.Pokemon
import com.example.aplicacionfantasy.ruta.Rutas

@Composable
fun ElementoListaCard(pokemon: Pokemon, navController: NavController) {
    
    Row {
        Card (
            modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
            onClick = { navController.navigate(Rutas.PantallaDatos.ruta + "/${pokemon.nombrePokemon}") }){
            Row (horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){
                Image(painter = pokemon.fotoPokemon,
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .padding(8.dp))
                Column (verticalArrangement = Arrangement.SpaceBetween, modifier = Modifier.weight(1f)){
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "${pokemon.nombrePokemon} #${pokemon.numeroPokedex}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                        Text(text = "Tipo: ${pokemon.tipoPrincipal}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                    }
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "PS: ${pokemon.cantidadPs}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                        Text(text = "ATK: ${pokemon.ataque}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                    }
                    Row (horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.fillMaxWidth()){
                        Text(text = "DEF: ${pokemon.defensa}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                        Text(text = "SPEED: ${pokemon.velocidad}",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold)
                    }
                }
                Column {
                    Checkbox(checked = false, onCheckedChange = {})
                }
            }
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewElementoLista() {
    //ElementoListaCard()
}