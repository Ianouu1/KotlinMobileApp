package com.example.mykotlinapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mykotlinapp.ui.theme.MyKotlinAppTheme
import kotlin.time.times

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val aire_disque = findViewById<Button>(R.id.button1)
        val surface_disque = findViewById<Button>(R.id.button2)
        val volume_boule = findViewById<Button>(R.id.button3)
        val resultview = findViewById<TextView>(R.id.textView2)
        val rayonfromview = findViewById<EditText>(R.id.editTextNumber)

        aire_disque.setOnClickListener(View.OnClickListener {
            val rayon = rayonfromview.text.toString().toDoubleOrNull()
            if (rayon != null) {
                val result = Math.PI * rayon * rayon
                resultview.text = "Resultat : %.2f".format(result) + "cm2"
            }
        })

        surface_disque.setOnClickListener(View.OnClickListener {
            val rayon = rayonfromview.text.toString().toDoubleOrNull()
            if (rayon != null) {
                val result = 2*Math.PI * rayon
                resultview.text = "Resultat : %.2f".format(result) + "cm2"
            }
        })

        volume_boule.setOnClickListener(View.OnClickListener {
            val rayon = rayonfromview.text.toString().toDoubleOrNull()
            if (rayon != null) {
                val result = (4/3.0)*Math.PI * Math.pow(rayon, 3.0)
                resultview.text = "Resultat : %.2f".format(result) + "cm2"
            }
        })
    }

    override fun onStart() {
        super.onStart()
    }
    override fun onResume() {
        super.onResume()
        Log.i("resume","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("pause","onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("stop","onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("restart","onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("destroy", "onDestroy")
    }
}