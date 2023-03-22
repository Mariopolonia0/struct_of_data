package com.example.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.key.Key.Companion.Window
import androidx.compose.ui.unit.dp
import androidx.compose.ui.*

@Composable
fun App() {
    Inicio()

}



@Composable
fun Inicio() {
    var text by remember { mutableStateOf("Hello, World!") }
    Column {

        Text("hola")
        Button(
            onClick = {
            }
        ){
            Text("hola")
        }
    }
}


