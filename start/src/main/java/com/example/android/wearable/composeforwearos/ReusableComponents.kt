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

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.MaterialTheme
import androidx.wear.compose.material.Text
import androidx.wear.compose.ui.tooling.preview.WearPreviewDevices
import com.example.android.wearable.composeforwearos.CommonComponents.ButtonWearOs
import com.example.android.wearable.composeforwearos.CommonComponents.CardWearOS
import com.example.android.wearable.composeforwearos.CommonComponents.TextWearOS
import com.example.android.wearable.composeforwearos.theme.WearAppTheme

/* Contains individual Wear OS demo composables for the code lab. */

// TODO: Create a Chip Composable
@Composable
fun ChipExample(
    modifier: Modifier = Modifier,
    iconModifier: Modifier = Modifier,
) {
}

// TODO: Create a ToggleChip Composable
@Composable
fun ToggleChipExample(modifier: Modifier = Modifier) {
}


// Button Preview
@WearPreviewDevices
@Composable
fun ButtonExamplePreview() {
    WearAppTheme {
        ButtonWearOs(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
        )
    }
}

// Text Preview
@WearPreviewDevices
@Composable
fun TextExamplePreview() {
    WearAppTheme {
        TextWearOS(
            text = "blabla",
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        )
    }
}

// Card Preview
@WearPreviewDevices
@Composable
fun CardExamplePreview() {
    WearAppTheme {
        CardWearOS(
            Modifier,
            Modifier,
            "Pet Feeder",
            "30m",
            "Momo",
            "Feed Momo now!",
            {  } )
    }
}

// Chip Preview
@WearPreviewDevices
@Composable
fun ChipExamplePreview() {
    WearAppTheme {
        ChipExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
            iconModifier = Modifier.size(24.dp).wrapContentSize(align = Alignment.Center),
        )
    }
}

// Toggle Chip Preview
@WearPreviewDevices
@Composable
fun ToggleChipExamplePreview() {
    WearAppTheme {
        ToggleChipExample(
            modifier = Modifier.fillMaxWidth().padding(bottom = 8.dp),
        )
    }
}
