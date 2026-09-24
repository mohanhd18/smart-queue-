package com.example.smartqueue

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.smartqueue.ui.Hello
import com.example.smartqueue.ui.theme.SmartqueueTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SmartqueueTheme() {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Hello(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}
