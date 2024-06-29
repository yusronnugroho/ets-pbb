package com.example.mymovie

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MovieGridScreen() {

    val movie = Movie("Baju", R.drawable.baju)

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = movie.title,
            style = MaterialTheme.typography.titleLarge.copy(fontSize = 24.sp, color = Color.Black),
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Image(
            painter = painterResource(id = movie.imageRes),
            contentDescription = movie.title,
            modifier = Modifier
                .height(300.dp)
                .fillMaxWidth()
                .padding(bottom = 16.dp)
        )
        Text(
            text = "Harga: Rp.60.000,00/ 1 potong atau RP.380.000,00/ 1 lusin",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Baju terbuat dari 60% katun dan 40% pollyester. Tersedia dalam 6 warna: putih, hitam, cokalt, krem, abu, dan biru",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(
            text = "Supplier: PT Intan Gramen Kratatau Kain",
            style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp, color = Color.Gray),
            modifier = Modifier.padding(bottom = 8.dp)
        )
        // Add more details as necessary
    }
}


@Composable
fun MovieCard(movie: Movie) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = movie.imageRes),
                contentDescription = null,
                modifier = Modifier
                    .height(200.dp)
                    .fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = movie.title, fontSize = 16.sp, color = Color.Black)
        }
    }
}
