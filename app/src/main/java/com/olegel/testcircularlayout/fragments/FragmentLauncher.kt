package com.olegel.testcircularlayout.fragments

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import com.olegel.testcircularlayout.R

/**
 * Created by Oleg on 26.11.2017.
 */
class FragmentLauncher(manager: FragmentManager) {
    private val manager = manager as FragmentManager
    private val TAG = FragmentLauncher::class.java.simpleName

    private fun launch(fragment: Fragment, tag: String?, addToBackStack: Boolean) {
        val transaction = manager.beginTransaction()

        transaction.replace(R.id.fragment_container, fragment)
        //transaction.commitAllowingStateLoss()
        if (addToBackStack) {
            transaction.addToBackStack(tag)
        }
        transaction?.commit()
    }
    fun startFirstFragment(){
        launch(FirstFragment(),"tag",false)
    }
    fun startSecondFragment(){
        launch(SecondFragment(),"tag",false)
    }
    fun startThirdFragment(){
        launch(ThirdFragment(),"tag",false)
    }
}