package com.example.android.wearable.composeforwearos.CommonComponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.ButtonDefaults
import androidx.wear.compose.material.Icon

@Composable
fun ButtonWearOs(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
) {
    Row (
        horizontalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Button(
            modifier = Modifier.size(ButtonDefaults.LargeButtonSize),
            onClick = { }
        ){
            Icon(
                imageVector = Icons.Rounded.Pets,
                contentDescription = "Triggers our Pets action",
                modifier = iconModifier
            )
        }
    }
}