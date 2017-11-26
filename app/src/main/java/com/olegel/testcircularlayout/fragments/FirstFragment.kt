package com.olegel.testcircularlayout.fragments

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.annotation.Nullable
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.olegel.testcircularlayout.NextActivity
import com.olegel.testcircularlayout.models.UserModel
import com.olegel.testcircularlayout.views.TestViewModel

/**
 * Created by Oleg on 26.11.2017.
 */
class FirstFragment : Fragment() {
    private lateinit var model: TestViewModel
    private val TAG = FirstFragment::class.java.simpleName
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        model = ViewModelProviders.of(activity as NextActivity).get(TestViewModel::class.java)
        model?.userModel?.observe(this, ChangeChecker())

        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private inner class ChangeChecker : Observer<UserModel> {
        override fun onChanged(t: UserModel?) {
            Log.d(TAG, "Change fr1 " + t?.lastName)
        }

    }
}

