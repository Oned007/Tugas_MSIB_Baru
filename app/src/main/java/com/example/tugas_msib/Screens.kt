package com.example.tugas_msib

sealed class Screens (val screen: String){
    data object Home:Screens(screen = "Home")
    data object Search:Screens(screen = "Search")
    data object Profile:Screens(screen = "Profile")

}