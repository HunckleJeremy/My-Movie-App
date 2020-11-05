package com.example.saira_000.movie

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val images =
            listOf<Int>(R.drawable.aquaman750x400, R.drawable.thegodfather, R.drawable.joker,)
        viewpager1.adapter = ViewPagerAdapter(images)
        TabLayoutMediator(tabLayout1, viewpager1) { _, _ -> }.attach()


        val fragments = listOf<Fragment>(MovieFragment(), ShowsFragment(), DramaFragment())
        viewpager2.adapter = FragmentAdapter(childFragmentManager, lifecycle, fragments)
        TabLayoutMediator(tabLayout2, viewpager2) { tab, position ->

            when (position) {
                0 -> tab.text = "movies"
                1 -> tab.text = "Shows"
                2 -> tab.text = "Drama"
            }
        }.attach()

    }
}