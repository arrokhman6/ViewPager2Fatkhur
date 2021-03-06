package com.fatkhur.datamahasiswa

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter (fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    private val JUMLAH_MENU = 3

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> { return MyMahasiswaFragment()}
            1 -> { return GithubFragment()}
            2 -> { return ProfilFragment()}
            else -> { return GithubFragment()}
        }
    }
}