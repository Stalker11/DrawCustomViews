package com.olegel.testcircularlayout

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import com.olegel.testcircularlayout.fragments.FragmentLauncher
import com.olegel.testcircularlayout.models.UserModel
import com.olegel.testcircularlayout.views.TestViewModel

/**
 * Created by Oleg on 25.11.2017.
 */
class NextActivity : BaseActivity() {
    private lateinit var model: TestViewModel
    private val TAG = NextActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        model = ViewModelProviders.of(this).get(TestViewModel::class.java)
      /*  val myModel = MutableLiveData<UserModel>()
        val user = UserModel()
        user.name = "NewUserName"
        user.lastName = "NewUserSecondName"
        user.age = 62
        myModel.postValue(user)
        model?.setUserModel(myModel)*/
        model?.userModel?.observe(this, ChangeChecker())
        findViewById<Button>(R.id.start_first_fragment).setOnClickListener {
            FragmentLauncher(supportFragmentManager).startFirstFragment() }
        findViewById<Button>(R.id.start_second_fragment).setOnClickListener {
            FragmentLauncher(supportFragmentManager).startSecondFragment() }
        findViewById<Button>(R.id.start_third_fragment).setOnClickListener {
            FragmentLauncher(supportFragmentManager).startThirdFragment() }
    }

    private inner class ChangeChecker : Observer<UserModel> {
        override fun onChanged(t: UserModel?) {
            Log.d(TAG, "Change NextAct " + t?.lastName)
            Log.d(TAG, "Change NextAct " + t?.name)
            Log.d(TAG, "Change NextAct " + t?.age)
        }

    }
}




