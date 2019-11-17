package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
    }

    fun iniciarSesion(view: View){
        //Agregar pasos de validacion sobre los archivos registrados
        //validar que los campos no se encuentran vacios
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }

    fun registrar(view: View){
        val intent = Intent(this, Registrar::class.java)
        startActivity(intent)
    }
}