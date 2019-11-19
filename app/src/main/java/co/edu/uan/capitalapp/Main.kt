package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class   Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun starLogin(view: View){
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun starFacebook(view: View){
        Toast.makeText(applicationContext,"Aun no ha sido implementado, muy pronto!", Toast.LENGTH_SHORT).show()
    }
}