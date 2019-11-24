package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class PrestamoEmbargoFondo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prestamo_embargo_fondo)
    }

    fun siguienteSalario44(view: View) {
        val intent = Intent(this, NominaHoraExtra::class.java)
        startActivity(intent)
    }
}