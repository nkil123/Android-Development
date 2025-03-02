package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme

//class is a bunch of code written
//Activity is something we see on screen -- while shifting from one screen to another we actually shif from one activity to another
//When we run our it starts at MainActivity
//ComponentActivity() tells how MainActivity should behave

class MainActivity : ComponentActivity() {
    //The below line says that on the run of MainActivity run this part of code first
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //a MyFirstAppTheme is composable, a composable is element that we see on screen
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme

                //Modifier is some setting,
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Changes in here need app again building to see the actual changes
                    //Modifier is not passed here meanig default is being used
                    Greeting("Android")
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

//Preview allows us to see before actually building app every Time
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Greeting("Android")
    }
}