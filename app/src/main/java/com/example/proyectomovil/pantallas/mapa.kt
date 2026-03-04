package com.example.proyectomovil.pantallas

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.proyectomovil.R
import com.example.proyectomovil.componentes.BarraAbajo
import com.example.proyectomovil.componentes.TopBar
import com.example.proyectomovil.ui.theme.barraArriba
import com.example.proyectomovil.ui.theme.fondo


@Composable
fun Mapa(modifier : Modifier = Modifier, controladorNavegacion: NavController){

    var busqueda by remember { mutableStateOf(value = "") }

    Scaffold(
        topBar = { TopBar() },
        bottomBar ={ BarraAbajo(controladorNavegacion) }

    ) { paddingValues ->

        Column(modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(color = fondo),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
        )
        {
            mapa()
            Spacer(modifier = Modifier.height(40.dp))

            TextField( value = busqueda,
                placeholder = { Text("A donde vas?") },
                onValueChange = { busqueda = it },
                shape = RoundedCornerShape(size = 10.dp),
                leadingIcon = {
                    Icon( imageVector = Icons.Default.Place,
                        contentDescription = "icono persona",
                        modifier = modifier.size(30.dp)
                    )
                }
            )

            Spacer(modifier = Modifier.height(70.dp))

            Row() {
                Icon(
                    Icons.Default.LocationOn,
                    contentDescription = "Icono del lugar",
                    modifier = Modifier
                        .size(20.dp)
                )
                Text(text = "Pontificia universidad javeriana",
                    fontWeight = FontWeight.Bold
                )

            }
            Spacer(modifier = Modifier.height(20.dp))

            Text(text = "TO")

            Spacer(modifier = Modifier.height(20.dp))

            Row() {

                Text(text = "Universidad Nacional",
                    fontWeight = FontWeight.Bold
                )
                Icon(
                    Icons.Default.LocationOn,
                    contentDescription = "Icono del lugar",
                    modifier = Modifier.size(20.dp)
                )
            }


            Spacer(modifier = Modifier.height(0.dp))

            ElevatedCard(
                modifier = Modifier
                    .padding(30.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.elevatedCardColors(
                    containerColor = barraArriba
                ),
                shape = RoundedCornerShape(20.dp)
            ){
                Row(
                    modifier = Modifier
                        .padding(all = 16.dp)
                ){
                Column(
                    modifier = Modifier
                        .padding(all = 16.dp)
                ) {

                    Text(
                        text = "Mejores Rutas",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Text("K23 portal el dorado")
                    Text("1 Portal el dorado")
                    }

                    Icon(Icons.Default.LocationOn,
                        contentDescription = "Icono del lugar",
                        modifier = Modifier.size(90.dp)
                        )
                }
            }
        }
    }
}

@Composable
fun mapa() {
    Image(
        painter = painterResource(id = R.drawable.mapa),
        contentDescription = "mapa imagen mientras",
        modifier = Modifier
            .fillMaxWidth()
            .height(180.dp)
            .size(250.dp)

    )
}

@Composable
@Preview(showBackground = true)
fun prevmapa(){
    Mapa(controladorNavegacion = rememberNavController())
}

