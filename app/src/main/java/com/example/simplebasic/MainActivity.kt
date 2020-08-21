package com.example.simplebasic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.simplebasic.concepts.SingletonClass
import com.example.simplebasic.concepts.SingletonClassOldMethod

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.d("## MainActivity", SingletonClass.variableName)
        SingletonClass.printVarName()

        // Below line we unable to access.
        // SingletonClass.privateFunction()

        // Old model
        SingletonClassOldMethod.instance.printText()


    }

}