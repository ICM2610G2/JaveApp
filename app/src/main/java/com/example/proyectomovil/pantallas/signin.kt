package com.example.proyectomovil.pantallas

import com.example.proyectomovil.R
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.windowInsetsBottomHeight
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.proyectomovil.ui.theme.barraArriba
import com.example.proyectomovil.ui.theme.fondo

@Composable
fun Signin(modifier: Modifier = Modifier,
           controladorNavegacion: NavController
) {

    var nombre by remember { mutableStateOf(value = "") }
    var contraseña by remember { mutableStateOf(value = "") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(fondo)
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Spacer(modifier = Modifier.height(40.dp))

        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "imagen logo",
            modifier = Modifier.size(180.dp)
        )

        Spacer(modifier = Modifier.height(40.dp))

        TextField( value = nombre,
            placeholder = { Text("Introduce tu nombre") },
            onValueChange = { nombre = it },
            shape = RoundedCornerShape(size = 10.dp),
            leadingIcon = {
                Icon( imageVector = Icons.Default.Person,
                    contentDescription = "icono persona",
                    modifier = modifier.size(30.dp)
                )
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField( value = contraseña,
            placeholder = { Text("Introduce tu contraseña") },
            onValueChange = { contraseña = it },
            shape = RoundedCornerShape(size = 10.dp),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Icono candado",
                    modifier = modifier.size(30.dp)
                )
            }
        )

        Spacer(modifier = Modifier.height(80.dp))

        Image(
            painter = painterResource(id = R.drawable.huella),
            contentDescription = "imagen huella",
            modifier = Modifier.size(80.dp)
        )

        Spacer(modifier = Modifier.height(80.dp))

        Button(
            onClick = {
                controladorNavegacion.navigate(route = pantallas.Home.name)
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = barraArriba,
                contentColor = Color.Black
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Iniciar Sesion")
        }

        Spacer(modifier = Modifier.height(130.dp))

        Text(text = "Olvidaste tu contrasena")
    }
}

@Composable
@Preview (showBackground = true)
fun prevsignin() {
    Signin(controladorNavegacion = rememberNavController())

}
