package com.olegel.testcircularlayout

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.olegel.testcircularlayout.models.UserModel
import com.olegel.testcircularlayout.views.TestViewModel

/**
 * Created by Oleg on 26.11.2017.
 */
abstract class BaseActivity:AppCompatActivity() {
    private val TAG = BaseActivity::class.java.simpleName
    override fun onStart() {
        super.onStart()
        val model = ViewModelProviders.of(this).get(TestViewModel::class.java)
        val myModel = MutableLiveData<UserModel>()
        val user = UserModel()
        user.name = "First"
        user.lastName = "Second"
        user.age = 22
        myModel.postValue(user)
        model.setUserModel(myModel)
        model.userModel.observe(this, ChangeChecker())
    }
    private inner class ChangeChecker : Observer<UserModel> {
        override fun onChanged(t: UserModel?) {
            Log.d(TAG, "onStart: " + t?.getLastName())
            Log.d(TAG, "onStart: " + t?.getName())
            Log.d(TAG, "onStart: " + t?.getAge())
        }

    }
}