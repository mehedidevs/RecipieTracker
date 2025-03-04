package com.mehedi.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BismillahCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFF9F5EB)
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Arabic Bismillah Text
            Text(
                text = "بِسْمِ اللهِ الرَّحْمٰنِ الرَّحِيْمِ",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF4E6E81),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(8.dp))

            // English Translation
            Text(
                text = "In the name of Allah, the Most Gracious, the Most Merciful",
                fontSize = 16.sp,
                color = Color(0xFF2D4356),
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Decorative Line
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .height(2.dp)
                    .background(Color(0xFFE9B384))
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BismillahCardPreview() {
    MaterialTheme {
        BismillahCard()
    }
}