package com.olegel.testcircularlayout.views;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.util.Log;

import com.olegel.testcircularlayout.models.UserModel;

/**
 * Created by Oleg on 21.11.2017.
 */

public class TestViewModel extends ViewModel {
  public static final String TAG = TestViewModel.class.getSimpleName();
  private MutableLiveData<UserModel> myModel;

  public void setUserModel(MutableLiveData<UserModel> model) {
    if (myModel == null) {
      this.myModel = model;
      Log.d(TAG, "setUserModel:create " + model);
    }
    Log.d(TAG, "setUserModel: call creator");
  }

  public LiveData<UserModel> getUserModel() {
    Log.d(TAG, "getUserModel:getModel " + myModel);
    return myModel;
  }
  public void changeModel(MutableLiveData<UserModel> model){
    this.myModel = model;
  }
}
