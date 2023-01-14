package edu.ucne.registrodepersonas

import androidx.compose.material.Icon
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.materialIcon
import androidx.compose.material.icons.rounded.AddCircle
import androidx.compose.material.icons.twotone.Add
import androidx.compose.material.icons.twotone.ArrowDropDown
import androidx.compose.material.icons.twotone.DateRange
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.ucne.registrodepersonas.ui.theme.RegistrodepersonasTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column() {
                RegistroPersonas()
            }
        }
    }
}


@Composable
fun RegistroPersonas() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        RegistroOrganizado()
    }
}

@Preview(showSystemUi = true)
@Composable
fun RegistroOrganizado() { // Dar espacios entre cada funcion
    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.padding(20.dp))
        Text(
            text = "Registro de Personas", fontSize = 30.sp)


        Spacer(modifier = Modifier.padding(18.dp))
        Nombres(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Telefono(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Celular(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Email(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Direccion(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        FechaNacimiento(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(5.dp))
        Ocupacion(Modifier.align(Alignment.CenterHorizontally))

        Spacer(modifier = Modifier.padding(9.dp))
        Boton(Modifier.align(Alignment.CenterHorizontally))
    }
}


@Composable
fun Nombres(modifier: Modifier) { // Nombres
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .fillMaxWidth()
            .height(60.dp)
            .padding(4.dp)
            .width(40.dp),
        placeholder = { Text(text = "Nombres", fontSize = 15.sp) },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Telefono(modifier: Modifier) { // Telefono
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "Telefono", fontSize = 15.sp) },
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Celular(modifier: Modifier) { // Celular
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "Celular", fontSize = 15.sp) },
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Email(modifier: Modifier) { // Email
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "Email", fontSize = 15.sp) },
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Direccion(modifier: Modifier) { // Direccion
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "Direccion", fontSize = 15.sp) },
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun FechaNacimiento(modifier: Modifier) { // FechaNacimiento
    TextField(
        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "FechaNacimiento", fontSize = 15.sp) },
        leadingIcon = {Icon(imageVector = Icons.TwoTone.DateRange, contentDescription = "Icono" )},
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,
        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}

@Composable
fun Ocupacion(modifier: Modifier) { // Ocupacion

    TextField(

        value = "", onValueChange = { },
        modifier = Modifier
            .border(
                BorderStroke(2.dp, androidx.compose.ui.graphics.Color.Gray),
                RoundedCornerShape(10)
            )
            .height(60.dp)
            .padding(4.dp)
            .fillMaxSize()
            .width(40.dp),
        placeholder = { Text(text = "Seleccionar ocupacion", fontSize = 15.sp) },
        leadingIcon = {Icon(imageVector = Icons.TwoTone.ArrowDropDown, contentDescription = "Icono" )},
        shape = RoundedCornerShape(10),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
        singleLine = true,
        maxLines = 1,

        colors = TextFieldDefaults.textFieldColors(
            textColor = androidx.compose.ui.graphics.Color.Transparent,
            backgroundColor = androidx.compose.ui.graphics.Color.Transparent,
            focusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent,
            unfocusedIndicatorColor = androidx.compose.ui.graphics.Color.Transparent
        )
    )
}



@Composable
fun Boton(modifier: Modifier) { // Boton guardar
    Button(
        onClick = { },
        modifier = Modifier
            .height(60.dp)
            .padding(5.dp).fillMaxSize()
            .width(150.dp),
        shape = RoundedCornerShape(40),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = Color(0xFF3A86B1),
            contentColor = Color(0xFFFFFFFF),
            disabledContentColor = androidx.compose.ui.graphics.Color.White,

        ),
    ) {
        Icon(imageVector = Icons.TwoTone.Add, contentDescription = "Icono" )
        Text(text = " Guardar", modifier = modifier, fontSize = 18.sp)
    }
}