package com.example.greet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthdaygreeting.*

class BIRTHDAYGREETING : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA ="name_extra"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygreeting)

        val name =intent.getStringExtra("name_extra")

        birthdaygreeting.text ="HAPPY BIRTHDAY $name"
    }
}