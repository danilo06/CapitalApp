package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.nomina_horas_extra.*

class NominaHoraExtra : AppCompatActivity() {
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



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nomina_horas_extra)
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
    }

    fun cambiarScena(view: View){
        proceso()

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

        val intent = Intent(this, BonificacionesComisiones::class.java)
        intent.putExtras(b)
        startActivity(intent)
    }

    fun proceso(){
        validaContenido(editTextHorasExtraDiurnaEmpleado1)
        validaContenido(editTextHorasExtraDiurnaEmpleado2)
        validaContenido(editTextHorasExtraDiurnaEmpleado3)
        validaContenido(editTextHorasExtraDiurnaEmpleado4)
        validaContenido(editTextHorasExtraDiurnaEmpleado5)

        validaContenido(editTextHorasExtraDiurnaFestivaEmpleado1)
        validaContenido(editTextHorasExtraDiurnaFestivaEmpleado2)
        validaContenido(editTextHorasExtraDiurnaFestivaEmpleado3)
        validaContenido(editTextHorasExtraDiurnaFestivaEmpleado4)
        validaContenido(editTextHorasExtraDiurnaFestivaEmpleado5)

        validaContenido(editTextHorasExtraNocturnaEmpleado1)
        validaContenido(editTextHorasExtraNocturnaEmpleado2)
        validaContenido(editTextHorasExtraNocturnaEmpleado3)
        validaContenido(editTextHorasExtraNocturnaEmpleado4)
        validaContenido(editTextHorasExtraNocturnaEmpleado5)

        validaContenido(editTextHorasExtraNocturnaFestivaEmpleado1)
        validaContenido(editTextHorasExtraNocturnaFestivaEmpleado2)
        validaContenido(editTextHorasExtraNocturnaFestivaEmpleado3)
        validaContenido(editTextHorasExtraNocturnaFestivaEmpleado4)
        validaContenido(editTextHorasExtraNocturnaFestivaEmpleado5)

        validaContenido(editTextHorasExtraFestivaEmpleado1)
        validaContenido(editTextHorasExtraFestivaEmpleado2)
        validaContenido(editTextHorasExtraFestivaEmpleado3)
        validaContenido(editTextHorasExtraFestivaEmpleado4)
        validaContenido(editTextHorasExtraFestivaEmpleado5)

        HoraExtraEmpleado1=calcula(salarioEmpleado1,
            editTextHorasExtraDiurnaEmpleado1.text.toString().toDouble(),
            editTextHorasExtraNocturnaEmpleado1.text.toString().toDouble(),
            editTextHorasExtraFestivaEmpleado1.text.toString().toDouble(),
            editTextHorasExtraDiurnaFestivaEmpleado1.text.toString().toDouble(),
            editTextHorasExtraNocturnaFestivaEmpleado1.text.toString().toDouble())
        HoraExtraEmpleado2=calcula(salarioEmpleado2,
            editTextHorasExtraDiurnaEmpleado2.text.toString().toDouble(),
            editTextHorasExtraNocturnaEmpleado2.text.toString().toDouble(),
            editTextHorasExtraFestivaEmpleado2.text.toString().toDouble(),
            editTextHorasExtraDiurnaFestivaEmpleado2.text.toString().toDouble(),
            editTextHorasExtraNocturnaFestivaEmpleado2.text.toString().toDouble())
        HoraExtraEmpleado3=calcula(salarioEmpleado3,
            editTextHorasExtraDiurnaEmpleado3.text.toString().toDouble(),
            editTextHorasExtraNocturnaEmpleado3.text.toString().toDouble(),
            editTextHorasExtraFestivaEmpleado3.text.toString().toDouble(),
            editTextHorasExtraDiurnaFestivaEmpleado3.text.toString().toDouble(),
            editTextHorasExtraNocturnaFestivaEmpleado3.text.toString().toDouble())
        HoraExtraEmpleado4=calcula(salarioEmpleado4,
            editTextHorasExtraDiurnaEmpleado4.text.toString().toDouble(),
            editTextHorasExtraNocturnaEmpleado4.text.toString().toDouble(),
            editTextHorasExtraFestivaEmpleado4.text.toString().toDouble(),
            editTextHorasExtraDiurnaFestivaEmpleado4.text.toString().toDouble(),
            editTextHorasExtraNocturnaFestivaEmpleado4.text.toString().toDouble())
        HoraExtraEmpleado5=calcula(salarioEmpleado5,
            editTextHorasExtraDiurnaEmpleado5.text.toString().toDouble(),
            editTextHorasExtraNocturnaEmpleado5.text.toString().toDouble(),
            editTextHorasExtraFestivaEmpleado5.text.toString().toDouble(),
            editTextHorasExtraDiurnaFestivaEmpleado5.text.toString().toDouble(),
            editTextHorasExtraNocturnaFestivaEmpleado5.text.toString().toDouble())
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
