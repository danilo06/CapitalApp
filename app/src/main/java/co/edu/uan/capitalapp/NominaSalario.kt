package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class NominaSalario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nomina_salario)
    }

    fun siguiente(){
        val intent = Intent(this, NominaHoraExtra::class.java)
        startActivity(intent)
    }

}