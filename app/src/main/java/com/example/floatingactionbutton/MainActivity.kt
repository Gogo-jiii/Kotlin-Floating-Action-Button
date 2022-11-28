package com.example.floatingactionbutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fabDefault.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Default Fab",
                Toast.LENGTH_SHORT
            ).show()
        }

        fabMini.setOnClickListener {
            Toast.makeText(
                this@MainActivity,
                "Mini Fab",
                Toast.LENGTH_SHORT
            ).show()
        }

        fabExtended.shrink()
        fabExtended.setOnClickListener {
            Toast.makeText(this@MainActivity, "Extended Fab",
                Toast.LENGTH_SHORT).show()
            if (fabExtended.isExtended) {
                fabExtended.shrink()
            } else {
                fabExtended.extend()
            }
        }
    }
}