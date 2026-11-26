package com.example.bloodconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.bloodconnect.ui.theme.BloodConnectTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            BloodConnectTheme
            Scaffold(
                modifier = Modifier.fillMaxSize(

                ) { innerPadding ->

                    BloodConnectWelcome(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
}
}

@Composable
fun BloodConnectWelcome(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            text = "BloodConnect"
        )

        Text(
            text = "Connecting blood donors with people who need blood."
        )

        Button(
            onClick = {
                // Navigation will be added later
            }
        ) {
            Text("Get Started")
        }
    }
}