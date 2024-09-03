package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.wear.compose.material.AppCard
import androidx.wear.compose.material.Text
import com.example.android.wearable.composeforwearos.R

@Composable
fun CardWearOS(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
    appName: String,
    time: String,
    title: String,
    content: String,
    onClick : () -> Unit,
) {

    AppCard(
        appName = { Text(appName) },
        appImage = {
            Box(
                modifier = iconModifier
                    .clip(CircleShape),
            ){
                Image(
                    painter = painterResource(R.drawable.momoimage),
                    contentDescription = "Your pet Image",
                    contentScale = ContentScale.FillWidth,
                    modifier = iconModifier
                        .graphicsLayer(
                            scaleX = 2f,
                            scaleY = 2f
                        )
                )
            }
        },
        time = { Text(time) },
        title = { Text(title) },
        onClick = { onClick() },
        modifier = modifier
    ){
        Column( modifier = Modifier.fillMaxWidth()){
            Text(content)
        }
    }
}