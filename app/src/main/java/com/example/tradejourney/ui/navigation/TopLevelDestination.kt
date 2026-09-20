package com.example.tradejourney.ui.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.automirrored.outlined.List
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.AutoGraph
import androidx.compose.material.icons.outlined.AddCircleOutline
import androidx.compose.material.icons.outlined.AutoGraph
import androidx.compose.ui.graphics.vector.ImageVector

enum class TopLevelDestination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val label: String
) {
    ADD_TRADE(
        route = Screen.AddTrade.route,
        selectedIcon = Icons.Filled.AddCircle,
        unselectedIcon = Icons.Outlined.AddCircleOutline,
        label = "Add trade"
    ),
    PERFORMANCE(
        route = Screen.Performance.route,
        selectedIcon = Icons.Filled.AutoGraph,
        unselectedIcon = Icons.Outlined.AutoGraph,
        label = "Performance"
    ),
    TRADES(
        route = Screen.TradesList.route,
        selectedIcon = Icons.AutoMirrored.Filled.List,
        unselectedIcon = Icons.AutoMirrored.Outlined.List,
        label = "Trades"
    )
}
