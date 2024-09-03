package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.wear.compose.material.Chip
import androidx.wear.compose.material.ChipBorder
import androidx.wear.compose.material.ChipDefaults
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text

@Composable
fun TextChip(
    text: String,
    color: Color,
    contentColor: Color,
    onClick : () -> Unit,
){
    Chip(
        onClick = { onClick() },
        colors = ChipDefaults.chipColors(
            backgroundColor = color,
            contentColor = contentColor
        ),
        border = ChipDefaults.chipBorder(
            borderStroke = null
        ),
        enabled = true,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp)
    ) {
        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
        ) {
            Text(
                text = text,
                color = contentColor,
                fontSize = 16.sp
            )
        }

    }
}