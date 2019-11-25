package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.nomina_salario.*

class NominaSalario : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nomina_salario)
    }

    fun siguienteSalario(view: View) {
        validaContenido(editTextSalarioEmpleado1)
        validaContenido(editTextSalarioEmpleado2)
        validaContenido(editTextSalarioEmpleado3)
        validaContenido(editTextSalarioEmpleado4)
        validaContenido(editTextSalarioEmpleado5)

        val b : Bundle = Bundle()

        b.putDouble("SalarioEmpleado1", editTextSalarioEmpleado1.text.toString().toDouble())
        b.putDouble("SalarioEmpleado2", editTextSalarioEmpleado2.text.toString().toDouble())
        b.putDouble("SalarioEmpleado3", editTextSalarioEmpleado3.text.toString().toDouble())
        b.putDouble("SalarioEmpleado4", editTextSalarioEmpleado4.text.toString().toDouble())
        b.putDouble("SalarioEmpleado5", editTextSalarioEmpleado5.text.toString().toDouble())
        b.putBoolean("AuxilioTransporteEmpleado1",radioButtonAuxilioTransporteEmpleado1.isChecked)
        b.putBoolean("AuxilioTransporteEmpleado2",radioButtonAuxilioTransporteEmpleado2.isChecked)
        b.putBoolean("AuxilioTransporteEmpleado3",radioButtonAuxilioTransporteEmpleado3.isChecked)
        b.putBoolean("AuxilioTransporteEmpleado4",radioButtonAuxilioTransporteEmpleado4.isChecked)
        b.putBoolean("AuxilioTransporteEmpleado5",radioButtonAuxilioTransporteEmpleado5.isChecked)

        val intent = Intent(this, NominaHoraExtra::class.java)
        intent.putExtras(b)
        startActivity(intent)

    }

    private fun validaContenido(param1: EditText) {
        if (param1.text.toString().isNullOrEmpty())
            param1.setText("0")
    }
}