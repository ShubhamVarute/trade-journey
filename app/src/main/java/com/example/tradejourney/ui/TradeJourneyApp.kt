package com.example.tradejourney.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.tradejourney.ui.components.TradeJourneyBottomAppBar
import com.example.tradejourney.ui.components.TradeJourneyTopAppBar
import com.example.tradejourney.ui.navigation.TradeJourneyNavHost

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TradeJourneyApp() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TradeJourneyTopAppBar(currentRoute) },
        bottomBar = { TradeJourneyBottomAppBar(currentRoute, navController) }
    ) { innerPadding ->
        TradeJourneyNavHost(
            navController = navController,
            modifier = Modifier.padding(innerPadding)
        )
    }
}