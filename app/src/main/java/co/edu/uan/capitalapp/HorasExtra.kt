package co.edu.uan.capitalapp

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.horasextra.*

class HorasExtra : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.horasextra)
    }

    fun calcular(view: View){
        if(editTextSalarioBase.text.toString().isNullOrEmpty() || editTextDiurna.text.toString().isNullOrEmpty() || editTextNocturna.text.toString().isNullOrEmpty() || editTextFestiva.text.toString().isNullOrEmpty()|| editTextFestivaDiurna.text.toString().isNullOrEmpty() || editTextFestivaNocturna.text.toString().isNullOrEmpty()){
            Toast.makeText(applicationContext,"Campos sin llenar, por favor termiar", Toast.LENGTH_SHORT).show()
        }else
        {
            val salario = editTextSalarioBase.text.toString().toDouble()
            val diurna = editTextDiurna.text.toString().toDouble()
            val nocturna = editTextNocturna.text.toString().toDouble()
            val festiva = editTextFestiva.text.toString().toDouble()
            val diurnafestiva = editTextFestivaDiurna.text.toString().toDouble()
            val nocturnafestiva = editTextFestivaNocturna.text.toString().toDouble()
            val valorHora = salario/240
            var total = 0.0
            total += (valorHora*1.25) * diurna
            total += (valorHora*1.75) * nocturna
            total += (valorHora*1.75) * festiva
            total += (valorHora*2) * diurnafestiva
            total += (valorHora*2.5) * nocturnafestiva
            editTextTotal.setText("   $ "+total.toString())
        }

    }
}