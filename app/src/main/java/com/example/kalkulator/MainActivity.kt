package com.example.kalkulator

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button as ComposeButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kalkulator.ui.theme.KalkulatorTheme

// Pastikan Activity ini ada dalam package yang sama
import com.example.kalkulator.mvc.MvcCalculatorActivity
import com.example.kalkulator.mvvm.MvvmCalculatorActivity

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            KalkulatorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(modifier = Modifier.padding(innerPadding)) {
                        Greeting(name = "Android")

                        // Tombol untuk membuka MvcCalculatorActivity
                        ComposeButton(
                            onClick = {
                                val intent = Intent(this@MainActivity, MvcCalculatorActivity::class.java)
                                startActivity(intent)
                            },
                            modifier = Modifier.padding(top = 16.dp)
                        ) {
                            Text(text = "Go to MVC Calculator")
                        }

                        // Tombol untuk membuka MvvmCalculatorActivity
                        ComposeButton(
                            onClick = {
                                val intent = Intent(this@MainActivity, MvvmCalculatorActivity::class.java)
                                startActivity(intent)
                            },
                            modifier = Modifier.padding(top = 16.dp)
                        ) {
                            Text(text = "Go to MVVM Calculator")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "CACAD $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KalkulatorTheme {
        Greeting("Android")
    }
}