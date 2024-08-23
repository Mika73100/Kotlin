package com.example.monresto.ui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.monresto.model.Article

@Composable
fun DetailView(article: Article, btnTitle: String, onClick: () -> Unit){
    Column(
        modifier = Modifier
            .padding(12.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = article.name, style = MaterialTheme.typography.titleSmall)
        Image(painter = painterResource(id = article.image), contentDescription = null)
        Button(onClick =  onClick ) {
                Text(text = btnTitle)
        }
    }
}