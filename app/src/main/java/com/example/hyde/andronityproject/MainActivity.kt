package com.example.hyde.andronityproject

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.hyde.andronityproject.helper.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent()

    }

    private fun setContent() {
        val vpa = ViewPagerAdapter(supportFragmentManager)
        vpa.addFragment(SigninFragmnet(), "SIGN IN")
        vpa.addFragment(SignupFragment(), "SIGN UP")
        pager.adapter = vpa
        tab.setupWithViewPager(pager)
    }
}
