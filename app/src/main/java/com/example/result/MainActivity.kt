package com.example.result

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        randb.setOnClickListener{
            val intent1 = Intent(this, RnB::class.java)
            startActivity(intent1)

        }

        rock.setOnClickListener{
            val intent2 = Intent(this, Rock::class.java)
            startActivity(intent2)

        }

        pop.setOnClickListener {
            val intent3 = Intent(this, Pop::class.java)
            startActivity(intent3)

        }
    }
}
