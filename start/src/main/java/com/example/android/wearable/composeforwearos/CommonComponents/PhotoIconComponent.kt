package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ButtonDefaults
import com.example.android.wearable.composeforwearos.R

@Composable
fun PhotoIconWearOS(){
    Box(
        modifier = Modifier
            .size(ButtonDefaults.LargeButtonSize)
            .wrapContentSize(align = Alignment.Center)
            .clip(CircleShape),
    ){
        Image(
            painter = painterResource(R.drawable.momoimage),
            contentDescription = "Your pet Image",
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .graphicsLayer(
                    scaleX = 2f,
                    scaleY = 2f
                )
        )
    }
}