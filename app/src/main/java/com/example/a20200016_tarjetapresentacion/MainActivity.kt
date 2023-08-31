package com.example.a20200016_tarjetapresentacion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20200016_tarjetapresentacion.ui.theme._20200016_TarjetaPresentacionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _20200016_TarjetaPresentacionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage()
                }
            }
        }
    }
}


@Composable
fun GreetingImage() {
        Column(
            Modifier
                .fillMaxSize()
                .background(Color(0xFFd2e9d5))
                .padding(bottom = 100.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            val image = painterResource(R.drawable.android_logo)

            Image(
                painter = image,
                contentDescription = null,
                Modifier
                    .background(Color(0xFF043343))
                    .size(125.dp, 125.dp)
            )
            Text(
                text = "Jennifer Doe",
                fontSize = 48.sp,

                )
            Text(
                text = "Android Developer Extraordinaire",
                color = Color(0xFF006a36),
                fontWeight = FontWeight.Bold
            )
        }

        Column(
            Modifier
                .fillMaxSize()
                .padding(78.dp,50.dp),
            verticalArrangement = Arrangement.Bottom,
        ) {
            Row(Modifier.padding(8.dp)){
                Icon(
                    painterResource(R.drawable.call_black_24dp),
                    contentDescription = null,
                    tint = Color(0xFF006a36)
                )
                Spacer(Modifier.width(20.dp))
                GreetingText(text = "+11 (123) 444 555 666")
            }

            Row(Modifier.padding(8.dp)){
                Icon(
                    painterResource(R.drawable.email_black_24dp),
                    contentDescription = null,
                    tint = Color(0xFF006a36)
                )
                Spacer(Modifier.width(20.dp))
                GreetingText(text = "@AndroidDev")
            }

            Row(Modifier.padding(8.dp)){
                Icon(
                    painterResource(R.drawable.share_black_24dp),
                    contentDescription = null,
                    tint = Color(0xFF006a36)
                )
                Spacer(Modifier.width(20.dp))
                GreetingText(text = "jen.doe@android.com")
            }

        }

    }

@Composable
fun GreetingText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier,
        textAlign = TextAlign.Justify
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    _20200016_TarjetaPresentacionTheme {
        GreetingImage()
    }
}