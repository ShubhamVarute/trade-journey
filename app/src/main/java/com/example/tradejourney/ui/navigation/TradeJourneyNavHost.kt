package com.example.tradejourney.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.tradejourney.ui.addtrade.AddTradeScreen
import com.example.tradejourney.ui.performance.PerformanceScreen
import com.example.tradejourney.ui.trades.TradesListScreen

@Composable
fun TradeJourneyNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Performance.route,
        modifier = modifier
    ) {
        composable(Screen.AddTrade.route) {
            AddTradeScreen()
        }
        composable(Screen.Performance.route) {
            PerformanceScreen()
        }
        composable(Screen.TradesList.route) {
            TradesListScreen()
        }
    }
}
