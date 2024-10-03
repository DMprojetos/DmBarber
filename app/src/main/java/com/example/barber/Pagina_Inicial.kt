package com.example.barber

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.platform.LocalContext

class Pagina_Inicial : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current

    BoxWithConstraints(
        modifier = Modifier.fillMaxSize()
    ) {
        // Imagem de fundo que ocupa toda a tela
        Image(
            painter = painterResource(id = R.drawable.fundobarber2),
            contentDescription = "Fundo",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop // Faz com que a imagem preencha o fundo
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            // Imagem do logotipo
            Image(
                painter = painterResource(id = R.drawable.logopng),
                contentDescription = "Logotipo",
                modifier = Modifier
                    .size(360.dp, 260.dp)
                    .padding(top = 80.dp)
            )

            // Texto
            Text(
                text = "Clique em uma das Barbearias",
                fontSize = 20.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(vertical = 16.dp)
                    .offset( y = 40.dp)
            )

            // Row para colocar as duas imagens lado a lado
            Row(
                modifier = Modifier.padding(horizontal = 16.dp), // Espaço horizontal nas laterais
                verticalAlignment = Alignment.CenterVertically // Alinha verticalmente as imagens
            ) {
                // Imagem do Baiano Corte
                Image(
                    painter = painterResource(id = R.drawable.baianoducorte),
                    contentDescription = "Baiano Corte",
                    modifier = Modifier
                        .size(140.dp)
                        .offset(x = (-20).dp, y = 110.dp) // Desloca a imagem Baiano Corte
                        .clickable {
                            context.startActivity(Intent(context, MainActivity::class.java))
                        }
                )

                // Imagem do Sua Barbearia
                Image(
                    painter = painterResource(id = R.drawable.suabarber),
                    contentDescription = "Sua Barbearia",
                    modifier = Modifier
                        .size(140.dp)
                        .offset(x = (20).dp, y = 110.dp) // Desloca a imagem Sua Barbearia
                        .clickable {
                            // Abrindo um link na web
                            val url = "https://wa.me/54992159272" // Substitua pela URL desejada
                            val intent = Intent(Intent.ACTION_VIEW).apply {
                                data = Uri.parse(url)
                            }
                            context.startActivity(intent)
                        }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainScreen()
}
