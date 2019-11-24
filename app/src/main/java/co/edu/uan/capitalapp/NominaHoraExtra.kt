package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class NominaHoraExtra : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nomina_horas_extra)
    }

    fun cambiarScena(view: View){
        val intent = Intent(this, BonificacionesComisiones::class.java)
        startActivity(intent)
    }
}
