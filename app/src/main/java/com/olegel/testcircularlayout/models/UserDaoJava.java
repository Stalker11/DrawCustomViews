package com.olegel.testcircularlayout.models;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by Oleg on 10.12.2017.
 */
@Dao
public interface UserDaoJava {
  @Query("SELECT * FROM Employee")
  public List<UserModel> getUsers();
}
