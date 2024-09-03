/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.wearable.composeforwearos

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.Scaffold
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.example.android.wearable.composeforwearos.HomePetFeature.HomeScreenPet
import com.example.android.wearable.composeforwearos.PetDetailFeature.PetDetailScreen
import com.example.android.wearable.composeforwearos.theme.WearAppTheme
import com.google.android.horologist.compose.layout.AppScaffold
import com.google.android.horologist.compose.layout.ScalingLazyColumn
import com.google.android.horologist.compose.layout.ScreenScaffold

/**
 * This code lab is meant to help existing Compose developers get up to speed quickly on
 * Compose for Wear OS.
 *
 * The code lab walks through a majority of the simple composables for Wear OS (both similar to
 * existing mobile composables and new composables).
 *
 * It also covers more advanced composables like [ScalingLazyColumn] (Wear OS's version of
 * [LazyColumn]) and the Wear OS version of [Scaffold].The codelab explains the advantage of using
 * Horologist [ScalingLazyColumn] and Horologist [AppScaffold] and [ScreenScaffold] to simplify
 * code development to align with Wear OS UX guidance.
 *
 * Check out [this link](https://android-developers.googleblog.com/2021/10/compose-for-wear-os-now-in-developer.html)
 * for more information on Compose for Wear OS.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WearApp()
        }
    }
}

@Composable
fun WearApp() {
    WearAppTheme {

        AppScaffold {

            val navController = rememberSwipeDismissableNavController()

            val listState = rememberScalingLazyListState()

            SwipeDismissableNavHost(
                navController = navController,
                startDestination = Screen.HomePetScreen.route
            ) {
                composable(route = Screen.HomePetScreen.route) {
                    HomeScreenPet(
                        navController = navController,
                        scrollState = listState
                    )
                }
                composable(route = Screen.PetDetailScreen.route){
                    PetDetailScreen(
                        navController = navController
                    )
                }
            }

        }

    }
}

@WearPreviewDevices
@Composable
fun WearAppPreview() {
    WearApp()
}
