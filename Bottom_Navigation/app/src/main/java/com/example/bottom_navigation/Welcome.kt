package com.example.bottom_navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.navigation.NavHostController
//import androidx.navigation.compose.rememberNavController

@Composable
fun MyBottomNavigation(navController: NavHostController){
    //val navController = rememberNavController()
    val destinationList = listOf( Login , Welcome)
    val selectedIndex = rememberSaveable{
        mutableStateOf(0)
    }
    BottomNavigation {
        destinationList.forEachIndexed { index, destinations ->
            BottomNavigationItem(
                label = { Text(text = destinations.title ) },
                icon = { Icon(imageVector = destinations.icon, contentDescription = destinations.title) },
                selected = index==selectedIndex.value ,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationList[index].route){
                        popUpTo(Login.route)
                        launchSingleTop = true
                    }
                })
        }
    }
}