package com.olegel.testcircularlayout;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.olegel.testcircularlayout.models.UserModel;
import com.olegel.testcircularlayout.views.CircularView;
import com.olegel.testcircularlayout.views.TestViewModel;

public class MainActivity extends BaseActivity {
  public static final String TAG = MainActivity.class.getSimpleName();
  private CircularView mView;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mView = findViewById(R.id.pie);
    mView.setOnClickListener((view -> startActivity(new Intent(this,NextActivity.class))));
     }

  @Override
  protected void onStart() {
    super.onStart();

  }
}
