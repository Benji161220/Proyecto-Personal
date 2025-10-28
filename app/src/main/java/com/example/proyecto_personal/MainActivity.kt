package com.example.proyecto_personal

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.proyecto_personal.ui.theme.ProyectoPersonalTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProyectoPersonalTheme {
                ProyectoApp()
            }
        }
    }
    @Preview
    @Composable
    fun ProyectoApp(){
        var currentStep by remember { mutableStateOf(1) }
        var squeezesLeft by remember { mutableStateOf(200)}
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            when (currentStep) {
                1-> {
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("Haz clic en la galleta para romperla")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta1),
                            contentDescription = "galleta",
                            modifier = Modifier.wrapContentSize()
                                .clickable {
                                    squeezesLeft--
                                    if (squeezesLeft <= 190) {
                                        currentStep = 2
                                    }
                                }
                        )
                    }
                }
                2->{
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("Ya empieza a quebrarse")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta2),
                            contentDescription = "galleta2",
                            modifier = Modifier.wrapContentSize()
                                .clickable {
                                    squeezesLeft--
                                    if (squeezesLeft <= 170) {
                                        currentStep = 3
                                    }
                                }
                            )
                    }
                }
                3->{
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("¡Cada vez se está quebrando más!")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta3),
                            contentDescription = "galleta3",
                            modifier = Modifier.wrapContentSize()
                                .clickable {
                                    squeezesLeft--
                                    if (squeezesLeft <= 140) {
                                        currentStep = 4
                                    }
                                }
                            )
                    }
                }
                4->{
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("¡Vamos ya queda poco!")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta4),
                            contentDescription = "galleta4",
                            modifier = Modifier.wrapContentSize()
                                .clickable {
                                    squeezesLeft--
                                    if (squeezesLeft <= 90) {
                                        currentStep = 5
                                    }
                                }
                            )
                    }
                }
                5->{
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("¡Ya esta a punto de quebrarse!")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta5),
                            contentDescription = "galleta5",
                            modifier = Modifier.wrapContentSize()
                                .clickable {
                                    squeezesLeft--
                                    if (squeezesLeft <= 0) {
                                        currentStep = 6
                                    }
                                }
                            )
                    }
                }
                6->{
                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ){
                        Text("¡Enhorabuena, has destruido la galleta!")
                        Spacer(modifier = Modifier.height(32.dp))
                        Image(
                            painter = painterResource(R.drawable.galleta6),
                            contentDescription = "galleta6",

                            )
                    }
                }
            }
        }
    }
}