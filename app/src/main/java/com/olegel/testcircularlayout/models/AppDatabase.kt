package com.olegel.testcircularlayout.models

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase

/**
 * Created by Oleg on 09.12.2017.
 */
//@Database(entities = {Gamer.class}, version = 1 ) throw error Name expected
abstract class AppDatabase:RoomDatabase() {
    //abstract fun userDao(): UserDao
}