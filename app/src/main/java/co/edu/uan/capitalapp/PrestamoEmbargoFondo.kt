package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.prestamo_embargo_fondo.*

class PrestamoEmbargoFondo : AppCompatActivity() {

    //valores vista salario
    var salarioEmpleado1: Double = 0.0
    var salarioEmpleado2: Double = 0.0
    var salarioEmpleado3: Double = 0.0
    var salarioEmpleado4: Double = 0.0
    var salarioEmpleado5: Double = 0.0
    var AuxilioTransporteEmpleado1: Boolean = false
    var AuxilioTransporteEmpleado2: Boolean = false
    var AuxilioTransporteEmpleado3: Boolean = false
    var AuxilioTransporteEmpleado4: Boolean = false
    var AuxilioTransporteEmpleado5: Boolean = false
    //valores vista horas extra
    var HoraExtraEmpleado1: Double = 0.0
    var HoraExtraEmpleado2: Double = 0.0
    var HoraExtraEmpleado3: Double = 0.0
    var HoraExtraEmpleado4: Double = 0.0
    var HoraExtraEmpleado5: Double = 0.0
    //valores vista Bofinicacion Comision
    var BonificacionEmpleado1: Double = 0.0
    var BonificacionEmpleado2: Double = 0.0
    var BonificacionEmpleado3: Double = 0.0
    var BonificacionEmpleado4: Double = 0.0
    var BonificacionEmpleado5: Double = 0.0
    var ComisionEmpleado1: Double = 0.0
    var ComisionEmpleado2: Double = 0.0
    var ComisionEmpleado3: Double = 0.0
    var ComisionEmpleado4: Double = 0.0
    var ComisionEmpleado5: Double = 0.0
    //valida Prestamos, Embargos, Fondo
    var PrestamoEmpleado1: Double = 0.0
    var PrestamoEmpleado2: Double = 0.0
    var PrestamoEmpleado3: Double = 0.0
    var PrestamoEmpleado4: Double = 0.0
    var PrestamoEmpleado5: Double = 0.0

    var EmbargosEmpleado1: Boolean = false
    var EmbargosEmpleado2: Boolean = false
    var EmbargosEmpleado3: Boolean = false
    var EmbargosEmpleado4: Boolean = false
    var EmbargosEmpleado5: Boolean = false

    var FondoEmpleado1: Boolean = false
    var FondoEmpleado2: Boolean = false
    var FondoEmpleado3: Boolean = false
    var FondoEmpleado4: Boolean = false
    var FondoEmpleado5: Boolean = false


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.prestamo_embargo_fondo)
        var bundle =intent.extras
        salarioEmpleado1=bundle!!.getDouble("SalarioEmpleado1")
        salarioEmpleado2=bundle!!.getDouble("SalarioEmpleado2")
        salarioEmpleado3=bundle!!.getDouble("SalarioEmpleado3")
        salarioEmpleado4=bundle!!.getDouble("SalarioEmpleado4")
        salarioEmpleado5=bundle!!.getDouble("SalarioEmpleado5")
        AuxilioTransporteEmpleado1=bundle!!.getBoolean("AuxilioTransporteEmpleado1")
        AuxilioTransporteEmpleado2=bundle!!.getBoolean("AuxilioTransporteEmpleado2")
        AuxilioTransporteEmpleado3=bundle!!.getBoolean("AuxilioTransporteEmpleado3")
        AuxilioTransporteEmpleado4=bundle!!.getBoolean("AuxilioTransporteEmpleado4")
        AuxilioTransporteEmpleado5=bundle!!.getBoolean("AuxilioTransporteEmpleado5")
        HoraExtraEmpleado1 = bundle!!.getDouble("HoraExtraEmpleado1")
        HoraExtraEmpleado2 = bundle!!.getDouble("HoraExtraEmpleado2")
        HoraExtraEmpleado3 = bundle!!.getDouble("HoraExtraEmpleado3")
        HoraExtraEmpleado4 = bundle!!.getDouble("HoraExtraEmpleado4")
        HoraExtraEmpleado5 = bundle!!.getDouble("HoraExtraEmpleado5")
        BonificacionEmpleado1 = bundle!!.getDouble("BonificacionEmpleado1")
        BonificacionEmpleado2 = bundle!!.getDouble("BonificacionEmpleado2")
        BonificacionEmpleado3 = bundle!!.getDouble("BonificacionEmpleado3")
        BonificacionEmpleado4 = bundle!!.getDouble("BonificacionEmpleado4")
        BonificacionEmpleado5 = bundle!!.getDouble("BonificacionEmpleado5")
        ComisionEmpleado1 = bundle!!.getDouble("ComisionEmpleado1")
        ComisionEmpleado2 = bundle!!.getDouble("ComisionEmpleado2")
        ComisionEmpleado3 = bundle!!.getDouble("ComisionEmpleado3")
        ComisionEmpleado4 = bundle!!.getDouble("ComisionEmpleado4")
        ComisionEmpleado5 = bundle!!.getDouble("ComisionEmpleado5")

    }

    fun siguienteResultado(view: View) {

        procesoAplicacion()

        val b : Bundle = Bundle()
        //Valores de vista salario
        b.putDouble("SalarioEmpleado1", salarioEmpleado1)
        b.putDouble("SalarioEmpleado2", salarioEmpleado2)
        b.putDouble("SalarioEmpleado3", salarioEmpleado3)
        b.putDouble("SalarioEmpleado4", salarioEmpleado4)
        b.putDouble("SalarioEmpleado5", salarioEmpleado5)
        b.putBoolean("AuxilioTransporteEmpleado1",AuxilioTransporteEmpleado1)
        b.putBoolean("AuxilioTransporteEmpleado2",AuxilioTransporteEmpleado2)
        b.putBoolean("AuxilioTransporteEmpleado3",AuxilioTransporteEmpleado3)
        b.putBoolean("AuxilioTransporteEmpleado4",AuxilioTransporteEmpleado4)
        b.putBoolean("AuxilioTransporteEmpleado5",AuxilioTransporteEmpleado5)
        //valores de horas extra
        b.putDouble("HoraExtraEmpleado1",HoraExtraEmpleado1)
        b.putDouble("HoraExtraEmpleado2",HoraExtraEmpleado2)
        b.putDouble("HoraExtraEmpleado3",HoraExtraEmpleado3)
        b.putDouble("HoraExtraEmpleado4",HoraExtraEmpleado4)
        b.putDouble("HoraExtraEmpleado5",HoraExtraEmpleado5)
        //valores vista Bofinicacion Comision
        b.putDouble("BonificacionEmpleado1",BonificacionEmpleado1)
        b.putDouble("BonificacionEmpleado2",BonificacionEmpleado2)
        b.putDouble("BonificacionEmpleado3",BonificacionEmpleado3)
        b.putDouble("BonificacionEmpleado4",BonificacionEmpleado4)
        b.putDouble("BonificacionEmpleado5",BonificacionEmpleado5)
        b.putDouble("ComisionEmpleado1",ComisionEmpleado1)
        b.putDouble("ComisionEmpleado2",ComisionEmpleado2)
        b.putDouble("ComisionEmpleado3",ComisionEmpleado3)
        b.putDouble("ComisionEmpleado4",ComisionEmpleado4)
        b.putDouble("ComisionEmpleado5",ComisionEmpleado5)
        //valores vista prestamo embargos fondo
        b.putDouble("PrestamoEmpleado1",PrestamoEmpleado1)
        b.putDouble("PrestamoEmpleado2",PrestamoEmpleado2)
        b.putDouble("PrestamoEmpleado3",PrestamoEmpleado3)
        b.putDouble("PrestamoEmpleado4",PrestamoEmpleado4)
        b.putDouble("PrestamoEmpleado5",PrestamoEmpleado5)

        b.putBoolean("EmbargosEmpleado1",EmbargosEmpleado1)
        b.putBoolean("EmbargosEmpleado2",EmbargosEmpleado2)
        b.putBoolean("EmbargosEmpleado3",EmbargosEmpleado3)
        b.putBoolean("EmbargosEmpleado4",EmbargosEmpleado4)
        b.putBoolean("EmbargosEmpleado5",EmbargosEmpleado5)

        b.putBoolean("FondoEmpleado1",FondoEmpleado1)
        b.putBoolean("FondoEmpleado2",FondoEmpleado2)
        b.putBoolean("FondoEmpleado3",FondoEmpleado3)
        b.putBoolean("FondoEmpleado4",FondoEmpleado4)
        b.putBoolean("FondoEmpleado5",FondoEmpleado5)

        val intent = Intent(this, Resultado::class.java)
        intent.putExtras(b)
        startActivity(intent)
    }

    fun procesoAplicacion(){
        PrestamoEmpleado1 = validaContenido(editTextPrestamoEmpleado1)
        PrestamoEmpleado2 = validaContenido(editTextPrestamoEmpleado2)
        PrestamoEmpleado3 = validaContenido(editTextPrestamoEmpleado3)
        PrestamoEmpleado4 = validaContenido(editTextPrestamoEmpleado4)
        PrestamoEmpleado5 = validaContenido(editTextPrestamoEmpleado5)
        EmbargosEmpleado1 = radioButtonEmbargoEmpleado1.isChecked
        EmbargosEmpleado2 = radioButtonEmbargoEmpleado2.isChecked
        EmbargosEmpleado3 = radioButtonEmbargoEmpleado3.isChecked
        EmbargosEmpleado4 = radioButtonEmbargoEmpleado4.isChecked
        EmbargosEmpleado5 = radioButtonEmbargoEmpleado5.isChecked
        FondoEmpleado1 = radioButtonFondoEmpleado1.isChecked
        FondoEmpleado2 = radioButtonFondoEmpleado2.isChecked
        FondoEmpleado3 = radioButtonFondoEmpleado3.isChecked
        FondoEmpleado4 = radioButtonFondoEmpleado4.isChecked
        FondoEmpleado5 = radioButtonFondoEmpleado5.isChecked

    }

    private fun validaContenido(param1: EditText): Double {
        if (param1.text.toString().isNullOrEmpty()){
            param1.setText("0")
        }
        return param1.text.toString().toDouble()
    }
}