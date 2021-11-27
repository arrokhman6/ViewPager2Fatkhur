package com.fatkhur.datamahasiswa

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator

class MyActivity : AppCompatActivity() {
    val menuTeks = arrayOf("Mahasiswa","Github","Profil")
    val menuIcon = arrayOf(R.drawable.ic_house, R.drawable.ic_plus, R.drawable.ic_user)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = viewPagerAdapter( fragmentActivity: this)
        view_pager.setAdapter(adapter);
        TabLayoutMediator(tab_layout, view_pager , TabLayoutMediator.TabConfigurationStrategy() {
            tab, position ->
            tab.text = menuTeks[position]
            tab.icon = ResourcesCompat.getDrawable(resources, menuIcon[position], theme: null)
    }).attach()
}