package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text

@Composable
fun BoldTextWearOS(
    text: String,
    modifier: Modifier = Modifier
) {
    Text(
        textAlign = TextAlign.Center,
        color = Color.White,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 16.sp,
        softWrap = true,
        text = text,
        modifier = modifier
    )
}