package co.edu.uan.capitalapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class Menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun clickButton(view: View){
            val intent = Intent(this, co.edu.uan.capitalapp.AgendaDeGastos::class.java)
            startActivity(intent)
    }
}
