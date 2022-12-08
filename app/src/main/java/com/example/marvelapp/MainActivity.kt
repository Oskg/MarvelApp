package com.example.marvelapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.marvelapp.navigation.MarvelAppNavHost
import com.example.marvelapp.ui.theme.MarvelAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelAppTheme {
                Scaffold(
                    topBar = {
                    TopAppBar(
                        title = {
                            Text(text = "Marvel App")
                        },
                        backgroundColor = Color.Blue,
                        contentColor = Color.White,
                        elevation = 12.dp
                    )
                    },
                content = {
                    Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colors.background
                    ){
                        MarvelAppNavHost()
                    }

                }
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
    MarvelAppTheme() {

    }
}
