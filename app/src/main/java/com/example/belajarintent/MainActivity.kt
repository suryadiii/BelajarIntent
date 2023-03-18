package com.example.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btninten: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btninten = findViewById(R.id.btn_intent)
        val btnIntentDataActivity = findViewById<Button>(R.id.btn_pindah_data)
        val btnIntentObjekActivity = findViewById<Button>(R.id.btn_pindah_objek)

        btninten.setOnClickListener(this)
        btnIntentDataActivity.setOnClickListener(this)
        btnIntentObjekActivity.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_intent ->run {
                val intentBiasa = Intent(this@MainActivity, PindahActivity::class.java)
                startActivity(intentBiasa)
            }
            R.id.btn_pindah_data -> run {
                val intentData =  Intent(this@MainActivity, PindahDataActivity2::class.java)
                intentData.putExtra(PindahDataActivity2.EXTRA_TEXT, "Assalamualaikum")
                startActivity(intentData)
            }
            R.id.btn_pindah_objek -> run {
                val cars = Cars(
                    "BMW WAN",
                    2021,
                    "BM 2110.WAN"
                )
                val intentObjek = Intent(this@MainActivity,PindahObjekActivity::class.java)
                intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS,cars)
                startActivity(intentObjek)
            }
        }
    }
}