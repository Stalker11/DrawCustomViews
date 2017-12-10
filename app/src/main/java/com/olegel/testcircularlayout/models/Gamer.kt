package com.olegel.testcircularlayout.models

import android.arch.persistence.room.Entity

/**
 * Created by Oleg on 10.12.2017.
 */
@Entity(tableName = "Gamer")
data class Gamer(val name: String) {
}