package com.example.bottom_navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations{
    val route : String
    val icon : ImageVector
    val title : String
}
object Login : Destinations{
    override val route: String = "Login"
    override val icon : ImageVector = Icons.Filled.Home
    override val title: String = "Login"
}
object Welcome : Destinations{
    override val route: String = "Welcome"
    override val icon : ImageVector = Icons.Filled.Settings
    override val title: String = "Welcome"
}