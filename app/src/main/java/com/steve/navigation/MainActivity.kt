package com.steve.navigation

import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import com.steve.navigation.base.BaseActivity
import com.steve.navigation.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        val hostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = hostFragment.navController
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
//            Log.i("QuyenLx", "controller: $controller, destination: $destination, arguments: $arguments")
            val currentBackStack = navController.currentBackStackEntry
            val previousBackStackEntry = navController.previousBackStackEntry
            val id = destination.id
            val navBackStackByDes = navController.getBackStackEntry(id)
            Log.i("QuyenLx", "currentBackStack = $currentBackStack")
            Log.i("QuyenLx", "previousBackStackEntry = $previousBackStackEntry")
            Log.i("QuyenLx", "previousBackStackEntry = $previousBackStackEntry")
            Log.i("QuyenLx", "id = $id, navBackStackByDes = $navBackStackByDes")
        }
    }
}