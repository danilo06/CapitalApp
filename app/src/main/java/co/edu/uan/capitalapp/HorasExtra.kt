package co.edu.uan.capitalapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.horasextra.*

class HorasExtra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horasextra)
    }

    fun Run(view: View) {
        if (editTextSalarioBase.text.toString().isNullOrEmpty()) {
            Toast.makeText(
                applicationContext,
                "Salario sin llenar, por favor asignar",
                Toast.LENGTH_SHORT
            ).show()
        } else {
            validaContenido(editTextDiurna)
            validaContenido(editTextNocturna)
            validaContenido(editTextFestiva)
            validaContenido(editTextFestivaDiurna)
            validaContenido(editTextFestivaNocturna)
            editTextTotal.setText(
                "   $ " + calcula(
                    editTextSalarioBase.text.toString().toDouble(),
                    editTextDiurna.text.toString().toDouble(),
                    editTextNocturna.text.toString().toDouble(),
                    editTextFestiva.text.toString().toDouble(),
                    editTextFestivaDiurna.text.toString().toDouble(),
                    editTextFestivaNocturna.text.toString().toDouble()
                )
            )
        }
    }

    private fun validaContenido(param1: EditText) {
        if (param1.text.toString().isNullOrEmpty())
            param1.setText("0")
    }

    fun calcula(
        salario: Double,
        diurna: Double,
        nocturna: Double,
        festiva: Double,
        diurnaFestiva: Double,
        nocturnaFestiva: Double
    ): Double {
        val valorHora = salario / 240
        var total = 0.0
        total += (valorHora * 1.25) * diurna
        total += (valorHora * 1.75) * nocturna
        total += (valorHora * 1.75) * festiva
        total += (valorHora * 2) * diurnaFestiva
        total += (valorHora * 2.5) * nocturnaFestiva
        return total
    }

}