package com.annhienktuit.mywallet.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import com.annhienktuit.mywallet.R
import com.annhienktuit.mywallet.adapter.ReportPagerAdapter
import com.google.android.material.tabs.TabLayout

class ReportFragment : Fragment() {

    private lateinit var myView: View
    private lateinit var myPager: ViewPager
    private lateinit var myTab: TabLayout

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        myView = inflater.inflate(R.layout.fragment_report, container, false)

        myPager = myView.findViewById(R.id.viewPager)
        myTab = myView.findViewById(R.id.tabLayout)

        var adapter = ReportPagerAdapter(childFragmentManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
        myPager.adapter = adapter

        myTab.setupWithViewPager(myPager)

        return myView
    }

}

