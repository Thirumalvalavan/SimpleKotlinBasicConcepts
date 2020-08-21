package com.example.simplebasic.concepts

import android.util.Log

object SingletonClass {

//    var single = SingletonClass()

    init {
        Log.d("##Singleton class", "1")
    }
    var variableName = "I am Var"

    fun printVarName() {
        Log.d("## printVarName", variableName)
    }

    private fun privateFunction() {
        Log.d("## privateFunction", variableName)
    }

}