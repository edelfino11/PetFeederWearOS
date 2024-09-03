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
package com.example.android.wearable.composeforwearos.theme

import androidx.compose.ui.graphics.Color
import androidx.wear.compose.material.Colors
import androidx.wear.compose.material.MaterialTheme

val LightBlue = Color(0xFF769CDF)
val DarkerBlue = Color(0xFF2442B5)
val LightGreen = Color(0xFF87C95D)
val DarkGreen = Color(0xFF2B9E7B)
val RedError = Color(0xFFFF5449)

val WearAppColorPalette: Colors = Colors(
    primary = LightBlue,
    primaryVariant = DarkerBlue,
    secondary = LightGreen,
    secondaryVariant = DarkGreen,
    error = RedError,
    onPrimary = Color.Black,
    onSecondary = Color.Black,
    onError = Color.Black,
)
