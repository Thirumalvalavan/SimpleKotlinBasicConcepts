package com.example.simplebasic.concepts

import android.util.Log

class SingletonClassOldMethod {

    companion object {
        val instance: SingletonClassOldMethod by lazy { SingletonClassOldMethod() }
    }

    fun printText() {
        Log.d("## SingletonClassOld", "printText")
    }

    private fun privateMethod() {
        Log.d("## SingletonClassOld", "privateMethod")
    }




}