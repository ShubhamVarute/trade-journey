package com.example.tradejourney.ui.navigation

sealed class Screen(val route: String) {
    data object AddTrade : Screen("add_trade")
    data object Performance : Screen("performance")
    data object TradesList : Screen("trades_list")
}
