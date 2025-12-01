package com.example.practiceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.practiceapp.ui.theme.PracticeappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PracticeappTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.secondary){
                    Practice()
                }
            }
        }
    }
}


@Composable
fun Practice() {
    Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Practice",
            modifier = Modifier
                .padding(top = 40.dp)
                .fillMaxWidth()
                .background(color = Color.Cyan),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineLarge,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        Image(
            painter = painterResource(R.drawable.book),
            contentDescription = "Book PNG",
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .fillMaxWidth()
                .size(150.dp),
            alignment = Alignment.Center,
        )
        Text(
            text = "This is a Book App",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium,
        )

        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Red).border(width = 1.dp, color = Color.Cyan),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.border(width = 1.dp, color = Color.Cyan).fillMaxWidth(),
                    text = "Different Composable",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
                Text(
                    modifier = Modifier,
                    text = "This is the Composable for 1st Composable",
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
            Column(
                modifier = Modifier
                    .weight(1f)
                    .background(Color.Gray).border(width = 1.dp, color = Color.Magenta),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    modifier = Modifier.border(width = 1.dp, color = Color.Magenta).fillMaxWidth(),
                    text = "Different Composable",
                    textAlign = TextAlign.Center,
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
                Text(
                    modifier = Modifier,
                    text = "This is the Composable for 2nd Composable",
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }
        Text(
            modifier = Modifier,
            text = "This is the New Text in Column",
            style = MaterialTheme.typography.headlineSmall
        )
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.bookappbackgroun),
                contentDescription = "Book App Random",
                modifier = Modifier
                    .weight(1f)
                    .size(100.dp),
                contentScale = ContentScale.Fit,
                alignment = Alignment.Center,
            )

            Image(
                painter = painterResource(R.drawable.android_happy_1),
                contentDescription = "Android Happy",
                modifier = Modifier
                    .weight(1f)
                    .size(100.dp),
                alignment = Alignment.Center,
            )
        }

        Text(
            text = "This the Final Image Text",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.headlineMedium
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PracticePreview() {
    PracticeappTheme {
        Practice()
    }
}
