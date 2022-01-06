package com.vinsol.navigation

sealed class NavigationFlow {
    object OnboardingFlow : NavigationFlow()
    class DashboardFlow(val msg: String) : NavigationFlow()
}