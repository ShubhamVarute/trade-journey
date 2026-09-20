package com.example.tradejourney.ui.components

import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import com.example.tradejourney.ui.navigation.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TradeJourneyTopAppBar(currentRoute :String?) {
    CenterAlignedTopAppBar(
        title = {
            Text(
                text = when (currentRoute) {
                    Screen.AddTrade.route -> "Add Trade"
                    Screen.TradesList.route -> "Trades"
                    Screen.Performance.route -> "Performance"
                    else -> "TradeJourney"
                },
                style = MaterialTheme.typography.titleLarge
            )
        },
        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.surface
        )
    )
}