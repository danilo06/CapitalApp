package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class   Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clickButton(view: View){
        val intent = Intent(this, AgendaDeGastos::class.java)
        startActivity(intent)
    }

}