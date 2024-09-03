package com.example.android.wearable.composeforwearos.HomePetFeature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.ScalingLazyListState
import com.example.android.wearable.composeforwearos.ChipExample
import com.example.android.wearable.composeforwearos.CommonComponents.ButtonWearOs
import com.example.android.wearable.composeforwearos.CommonComponents.CardWearOS
import com.example.android.wearable.composeforwearos.CommonComponents.TextWearOS
import com.example.android.wearable.composeforwearos.Screen
import com.example.android.wearable.composeforwearos.ToggleChipExample
import com.google.android.horologist.compose.layout.ScreenScaffold

@Composable
fun HomeScreenPet(
    navController: NavHostController,
    scrollState: ScalingLazyListState
){
    ScreenScaffold(
        scrollState = scrollState,
    ) {

        // Modifiers used by our Wear composables.
        val contentModifier = Modifier.fillMaxWidth()
        val iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center)

        ScalingLazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(
                top = 16.dp,
                start = 8.dp,
                end = 8.dp,
                bottom = 16.dp,
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp),
            state = scrollState,
        ) {

            /* ******************* Part 1: Simple composables ******************* */
            item { ButtonWearOs(contentModifier, iconModifier) }
            item { TextWearOS("Pet Feeding Time", contentModifier) }
            item { CardWearOS(
                contentModifier,
                iconModifier,
                "Pet Feeder",
                "30m",
                "Momo",
                "Feed Momo now!",
                { navController.navigate(Screen.PetDetailScreen.route) } ) }

            /* ********************* Part 2: Wear unique composables ********************* */
            item { ChipExample(contentModifier, iconModifier) }
            item { ToggleChipExample(contentModifier) }
        }


    }
}