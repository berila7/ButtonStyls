package com.example.buttonstyle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.widget.SwitchCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val themeSwitch = findViewById<SwitchCompat>(R.id.switch1)

        themeSwitch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                ThemeSwitcher.switchTo(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                ThemeSwitcher.switchTo(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}
