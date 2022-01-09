package com.vinsol.commonui.starterUI

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.vinsol.commonui.R
import com.vinsol.navigation.NavigationFlow
import com.vinsol.navigation.Navigator
import com.vinsol.navigation.ToFlowNavigatable


class MainActivity : AppCompatActivity(), ToFlowNavigatable {
    private val navigator: Navigator by lazy {
        Navigator().apply {
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
            navController = navHostFragment.navController
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

//        val navController = findNavController(R.id.nav_host_fragment)
//
//        navigator.navController = navController

        navView.setupWithNavController(navigator.navController)
    }

    override fun navigateToFlow(flow: NavigationFlow) {
        navigator.navigateToFlow(flow)
    }
}
