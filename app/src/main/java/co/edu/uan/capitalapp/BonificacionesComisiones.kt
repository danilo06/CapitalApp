package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class BonificacionesComisiones : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bonificaciones_comisiones)
    }

    fun chageToPrestamos(view: View) {
        val intent = Intent(this, PrestamoEmbargoFondo::class.java)
        startActivity(intent)
    }

}