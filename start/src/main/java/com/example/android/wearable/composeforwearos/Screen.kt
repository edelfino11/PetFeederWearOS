package com.example.android.wearable.composeforwearos

sealed class Screen(val route: String) {
    object HomePetScreen: Screen("home_pet_screen")
    object PetDetailScreen: Screen("pet_detail_screen")
}