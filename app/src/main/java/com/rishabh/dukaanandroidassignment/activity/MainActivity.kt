package com.rishabh.dukaanandroidassignment.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import com.rishabh.dukaanandroidassignment.R
import com.rishabh.dukaanandroidassignment.fragment.DashboardMainFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Setting up the fragment
        if (DashboardMainFragment.CLASS_NAME == null) return
        val fm = supportFragmentManager
        val tr = fm.beginTransaction()
        tr.replace(R.id.flFragmentContainerDashboard, DashboardMainFragment.newInstance())
        tr.commit()
    }
}
