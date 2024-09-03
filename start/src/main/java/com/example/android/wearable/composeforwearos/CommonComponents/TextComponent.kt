package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text

@Composable
fun TextWearOS(
    text: String,
    modifier: Modifier = Modifier) {
    Text(
        textAlign = TextAlign.Center,
        color = MaterialTheme.colors.primary,
        text = text,
        modifier = modifier
    )
}