package com.example.saira_000.movie

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentAdapter(fm: FragmentManager, lc: Lifecycle, val frag: List<Fragment> ): FragmentStateAdapter(fm, lc) {

    override fun getItemCount(): Int {
        return frag.size
    }

    override fun createFragment(position: Int): Fragment {
        return frag[position]
    }
}