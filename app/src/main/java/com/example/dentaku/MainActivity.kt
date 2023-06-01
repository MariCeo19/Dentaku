package com.example.dentaku

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dentaku.ui.theme.DentakuTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DentakuTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     Calculatrice()
                }
            }
        }
    }
}

@Preview
@Composable
fun Calculatrice(){

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.LightGray )

    {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = "Calculador de Gastos com Passagem por Mês",
                fontSize = 30.sp,
                fontWeight = FontWeight.Light,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(40.dp)
            )
            TextField(
                value =  ,
                onValueChange =


            TextField(
                  value =  ,
                  onValueChange =
                )
        }


    }

}

@Composable
fun QtdPassagem(
    passagemAtual:Int
):Double{
    var ValorIda by remember { mutableStateOf("") }
    var ValorVolta by remember { mutableStateOf("") }

    Text(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        textAlign = TextAlign.Left,
        text = "Viagem $passagemAtual",
        fontSize = 15.dp
     )

    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        TextField(
            value = ValorIda ,
            onValueChange = {ValorIda = it},
            label = { Text(text = "Valor de Ida")}
 )

    }

}