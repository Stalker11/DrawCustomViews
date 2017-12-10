package com.olegel.testcircularlayout.models;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by Oleg on 10.12.2017.
 */
@Database(entities = {UserModel.class}, version = 1 )
public abstract class AppDatabaseJava extends RoomDatabase {
  abstract UserModel userModel();
}
