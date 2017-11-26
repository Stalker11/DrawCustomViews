package com.olegel.testcircularlayout;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.olegel.testcircularlayout.views.TestViewModel;

/**
 * Created by Oleg on 26.11.2017.
 */

public class ThirdActivity extends BaseActivity {
  public static final String TAG = ThirdActivity.class.getSimpleName();
  @Override
  protected void onCreate(@Nullable Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    TestViewModel model = ViewModelProviders.of(this).get(TestViewModel.class);
    Log.d(TAG, "onCreate: "+model.getUserModel());
    model.getUserModel().observe(this, usersFinder ->{
      Log.d(TAG, "onCreate: "+usersFinder.getLastName());
    });
  }
}
