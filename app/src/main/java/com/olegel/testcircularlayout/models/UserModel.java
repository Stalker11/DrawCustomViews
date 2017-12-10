package com.olegel.testcircularlayout.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Oleg on 21.11.2017.
 */
@Entity
public class UserModel {
  @PrimaryKey(autoGenerate = true)
  private int age;
  @ColumnInfo(name = "firstName")
  private String name;
  @ColumnInfo(name = "lastName")
  private String lastName;

  public UserModel() {
  }
public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}
