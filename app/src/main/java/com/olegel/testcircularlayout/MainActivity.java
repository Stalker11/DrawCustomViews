package com.olegel.testcircularlayout;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.olegel.testcircularlayout.models.UserModel;
import com.olegel.testcircularlayout.views.TestViewModel;

public class MainActivity extends AppCompatActivity {
  public static final String TAG = MainActivity.class.getSimpleName();
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.test_image);
    TestViewModel model = ViewModelProviders.of(this).get(TestViewModel.class);
    MutableLiveData<UserModel> myModel = new MutableLiveData<UserModel>();
    UserModel user = new UserModel();
    user.setName("First");
    user.setLastName("Second");
    user.setAge(22);
    myModel.postValue(user);
    model.setUserModel(myModel);
    model.getUserModel().observe(this, users ->{
      Log.d(TAG, "onCreate: "+users.getLastName());
    });
  }
}
