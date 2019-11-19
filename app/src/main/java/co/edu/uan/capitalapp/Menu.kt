package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun clickButton(view: View){
        val intent = Intent(this, co.edu.uan.capitalapp.AgendaDeGastos::class.java)
        startActivity(intent)
    }

    fun clickTips(view: View){
        val intent = Intent(this, co.edu.uan.capitalapp.Tips::class.java)
        startActivity(intent)
    }

}