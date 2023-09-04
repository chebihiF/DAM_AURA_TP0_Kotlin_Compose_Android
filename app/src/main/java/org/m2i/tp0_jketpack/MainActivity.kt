package org.m2i.tp0_jketpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.m2i.tp0_jketpack.ui.theme.TP0_JKetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TP0_JKetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface( // DIV
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        Greeting("Android")
                        ShowAge(20)
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun ShowAge(age: Int = 25){
    Text(text = age.toString())
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TP0_JKetpackTheme {
        Surface( // DIV
            modifier = Modifier.fillMaxSize(), // MAX(W,H)
            color = MaterialTheme.colorScheme.primary ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally)
            {
                Text(text = "$100", style = TextStyle(
                    color = Color.White,
                ))
                Spacer(modifier = Modifier.height(30.dp))
                Card(
                    modifier = Modifier
                        .padding(3.dp)
                        .size(100.dp)
                        .clickable {

                        },
                    shape = CircleShape, elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {
                    Box(
                        contentAlignment = Alignment.Center,
                        modifier = Modifier.fillMaxSize())
                    {
                        Text(text = "Tap", modifier = Modifier)
                    }
                }
            }

        }

    }
}