package com.example.proyectomovil.pantallas

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.proyectomovil.componentes.BarraAbajo
import com.example.proyectomovil.componentes.TopBar
import com.example.proyectomovil.ui.theme.fondo
import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.proyectomovil.R

@Composable
fun Home(modifier : Modifier = Modifier, controladorNavegacion: NavController){
    Scaffold(
        topBar = { TopBar() },
        bottomBar ={ BarraAbajo(controladorNavegacion) }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(fondo)
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.introcompumovil), // imagen del curso
                        contentDescription = "Curso",
                        modifier = Modifier.fillMaxWidth()
                            .size(120.dp)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Usuario"
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(text = "Hola alguien ha visto esta materia?")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Default.Favorite, contentDescription = "Like")
                        Icon(Icons.Default.MailOutline, contentDescription = "Comentario")
                        Icon(Icons.Default.Send, contentDescription = "Enviar")
                        Icon(Icons.Default.AddCircle, contentDescription = "guardar")
                    }
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            Card(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(modifier = Modifier.padding(8.dp)) {
                    Image(
                        painter = painterResource(id = R.drawable.javeriana), // imagen edificio
                        contentDescription = "Universidad",
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            imageVector = Icons.Default.AccountCircle,
                            contentDescription = "Usuario"
                        )

                        Spacer(modifier = Modifier.width(8.dp))

                        Text(text = "Que linda la universidad")
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Icon(Icons.Default.Favorite, contentDescription = "Like")
                        Icon(Icons.Default.MailOutline, contentDescription = "Comentario")
                        Icon(Icons.Default.Send, contentDescription = "Enviar")
                        Icon(Icons.Default.AddCircle, contentDescription = "guardar")
                    }
                }
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun prevhome(){
    Home(controladorNavegacion = rememberNavController())
}