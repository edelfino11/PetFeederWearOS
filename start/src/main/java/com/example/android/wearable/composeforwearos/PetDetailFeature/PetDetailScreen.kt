package com.example.android.wearable.composeforwearos.PetDetailFeature

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.wear.compose.foundation.lazy.ScalingLazyColumn
import androidx.wear.compose.foundation.lazy.ScalingLazyListState
import androidx.wear.compose.foundation.lazy.rememberScalingLazyListState
import androidx.wear.compose.material.MaterialTheme
import com.example.android.wearable.composeforwearos.CommonComponents.BoldTextWearOS
import com.example.android.wearable.composeforwearos.CommonComponents.PhotoIconWearOS
import com.example.android.wearable.composeforwearos.CommonComponents.TextChip
import com.example.android.wearable.composeforwearos.CommonComponents.TextWearOS
import com.google.android.horologist.compose.layout.ScreenScaffold
import kotlinx.coroutines.launch

data class ChipState(
    val text: String = "Placeholder",
    val chipContentColor: Color = Color.White,
    val chipColor: Color = Color.Blue,
    val fed: Boolean = false
)

sealed class PetDetailEvents {
    data object PetFedToggle: PetDetailEvents()
}

class PetDetailViewModel : ViewModel() {

    //placeholders
    private val _state = mutableStateOf<ChipState>(
        ChipState(
            text = "",
            chipContentColor = Color.Black,
            chipColor = Color.White,
            fed = false
        )
    )

    var state: State<ChipState> = _state

    fun setInitialState(contentColor: Color, chipColor: Color) {
        _state.value = ChipState(
            text = "Feed now",
            chipColor = chipColor,
            chipContentColor = contentColor,
            fed = true //so we don't show the same initial state twice
        )
    }

    fun onButtonToggle(event: PetDetailEvents, fedColor: Color, unfedColor: Color){
        when(event){
            is PetDetailEvents.PetFedToggle -> {
                // Toggle the `fed` state
                val newFedState = !_state.value.fed

                // Update the state with a new `ChipState` instance
                _state.value = _state.value.copy(
                    fed = newFedState,
                    text = if (newFedState) "Feed Now" else "Was Fed",
                    chipColor = if (newFedState) unfedColor else fedColor
                )
            }
        }
    }
}

@Composable
fun PetDetailScreen(
    navController: NavHostController,
    viewModel: PetDetailViewModel = viewModel()
){
    val listState = rememberScalingLazyListState()
    val unfedColor = MaterialTheme.colors.primary
    val fedColor = MaterialTheme.colors.secondary

    LaunchedEffect(Unit) {
        viewModel.setInitialState(
            contentColor = Color.White,
            chipColor = unfedColor
        )
    }

    val chipState = viewModel.state.value

    ScreenScaffold(
        scrollState = listState
    ) {

        // Modifiers used by our Wear composables.
        val contentModifier = Modifier.fillMaxWidth()
        ScalingLazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(
                top = 16.dp,
                start = 8.dp,
                end = 8.dp,
                bottom = 16.dp,
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp),
            state = listState
        ) {

            /* ******************* Part 1: Simple composables ******************* */
            item { PhotoIconWearOS() }
            item{ TextWearOS("Momo", contentModifier) }
            item{ BoldTextWearOS("Feed Time: 6:00PM", contentModifier) }
            item { TextChip(
                text = chipState.text,
                color = chipState.chipColor,
                contentColor = chipState.chipContentColor,
                onClick = {
                    viewModel.onButtonToggle(
                        event = PetDetailEvents.PetFedToggle,
                        unfedColor = unfedColor,
                        fedColor = fedColor)
                })
            }

        }


    }
}

