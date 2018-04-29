package com.example.hyde.andronityproject.helper

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter

class ViewPagerAdapter(manager: FragmentManager) : FragmentPagerAdapter(manager) {
    val mFragmentList = ArrayList<Fragment>()
    val mFragmentTitle = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return mFragmentList[position]
    }

    override fun getCount(): Int {
        return mFragmentList.size
    }

    fun addFragment(fragment: Fragment, judul: String) {
        mFragmentList.add(fragment)
        mFragmentTitle.add(judul)
    }

    override fun getPageTitle(position: Int): CharSequence {
        return mFragmentTitle.get(position)
    }

}