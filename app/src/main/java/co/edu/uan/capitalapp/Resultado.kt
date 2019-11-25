package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.resultado.*

class Resultado : AppCompatActivity() {

    var AuxilioTransporteFijo: Double = 97032.0
    var AporteSaludPensionEmpleado1: Double = 0.0
    var AporteSaludPensionEmpleado2: Double = 0.0
    var AporteSaludPensionEmpleado3: Double = 0.0
    var AporteSaludPensionEmpleado4: Double = 0.0
    var AporteSaludPensionEmpleado5: Double = 0.0

    var AporteEmbargoEmpleado1 = 0.0
    var AporteEmbargoEmpleado2 = 0.0
    var AporteEmbargoEmpleado3 = 0.0
    var AporteEmbargoEmpleado4 = 0.0
    var AporteEmbargoEmpleado5 = 0.0

    var AporteFondoEmpleado1:Double = 0.0
    var AporteFondoEmpleado2:Double = 0.0
    var AporteFondoEmpleado3:Double = 0.0
    var AporteFondoEmpleado4:Double = 0.0
    var AporteFondoEmpleado5:Double = 0.0


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

    var AuxilioEmpleado1: Double = 0.0
    var AuxilioEmpleado2: Double = 0.0
    var AuxilioEmpleado3: Double = 0.0
    var AuxilioEmpleado4: Double = 0.0
    var AuxilioEmpleado5: Double = 0.0

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
        setContentView(R.layout.resultado)
        var bundle = intent.extras
        salarioEmpleado1 = bundle!!.getDouble("SalarioEmpleado1")
        salarioEmpleado2 = bundle!!.getDouble("SalarioEmpleado2")
        salarioEmpleado3 = bundle!!.getDouble("SalarioEmpleado3")
        salarioEmpleado4 = bundle!!.getDouble("SalarioEmpleado4")
        salarioEmpleado5 = bundle!!.getDouble("SalarioEmpleado5")
        AuxilioTransporteEmpleado1 = bundle!!.getBoolean("AuxilioTransporteEmpleado1")
        AuxilioTransporteEmpleado2 = bundle!!.getBoolean("AuxilioTransporteEmpleado2")
        AuxilioTransporteEmpleado3 = bundle!!.getBoolean("AuxilioTransporteEmpleado3")
        AuxilioTransporteEmpleado4 = bundle!!.getBoolean("AuxilioTransporteEmpleado4")
        AuxilioTransporteEmpleado5 = bundle!!.getBoolean("AuxilioTransporteEmpleado5")
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
        PrestamoEmpleado1 = bundle!!.getDouble("PrestamoEmpleado1")
        PrestamoEmpleado2 = bundle!!.getDouble("PrestamoEmpleado2")
        PrestamoEmpleado3 = bundle!!.getDouble("PrestamoEmpleado3")
        PrestamoEmpleado4 = bundle!!.getDouble("PrestamoEmpleado4")
        PrestamoEmpleado5 = bundle!!.getDouble("PrestamoEmpleado5")
        EmbargosEmpleado1 = bundle!!.getBoolean("EmbargosEmpleado1")
        EmbargosEmpleado2 = bundle!!.getBoolean("EmbargosEmpleado2")
        EmbargosEmpleado3 = bundle!!.getBoolean("EmbargosEmpleado3")
        EmbargosEmpleado4 = bundle!!.getBoolean("EmbargosEmpleado4")
        EmbargosEmpleado5 = bundle!!.getBoolean("EmbargosEmpleado5")
        FondoEmpleado1 = bundle!!.getBoolean("FondoEmpleado1")
        FondoEmpleado2 = bundle!!.getBoolean("FondoEmpleado2")
        FondoEmpleado3 = bundle!!.getBoolean("FondoEmpleado3")
        FondoEmpleado4 = bundle!!.getBoolean("FondoEmpleado4")
        FondoEmpleado5 = bundle!!.getBoolean("FondoEmpleado5")
        operar()
    }

    fun operar() {
        var totales: Double = 0.0
        editTextResultadoHorasExtraEmpleado1.setText(" $ " + HoraExtraEmpleado1)
        editTextResultadoHorasExtraEmpleado2.setText(" $ " + HoraExtraEmpleado2)
        editTextResultadoHorasExtraEmpleado3.setText(" $ " + HoraExtraEmpleado3)
        editTextResultadoHorasExtraEmpleado4.setText(" $ " + HoraExtraEmpleado4)
        editTextResultadoHorasExtraEmpleado5.setText(" $ " + HoraExtraEmpleado5)
        editTextResultadoHorasExtraEmpleado5.setText(" $ " + HoraExtraEmpleado5)
        totales =
            HoraExtraEmpleado1 + HoraExtraEmpleado2 + HoraExtraEmpleado3 + HoraExtraEmpleado4 + HoraExtraEmpleado5
        editTextResultadoHorasExtraTotal.setText("$" + totales)

        if (AuxilioTransporteEmpleado1) {
            this.AuxilioEmpleado1 = this.AuxilioTransporteFijo
        }
        if (AuxilioTransporteEmpleado2) {
            this.AuxilioEmpleado2 = this.AuxilioTransporteFijo
        }
        if (AuxilioTransporteEmpleado3) {
            this.AuxilioEmpleado3 = this.AuxilioTransporteFijo
        }
        if (AuxilioTransporteEmpleado4) {
            this.AuxilioEmpleado4 = this.AuxilioTransporteFijo
        }
        if (AuxilioTransporteEmpleado5) {
            this.AuxilioEmpleado5 = this.AuxilioTransporteFijo
        }


        var TotalDevengadoEmpleado1 =
            salarioEmpleado1 + AuxilioEmpleado1 + HoraExtraEmpleado1 + BonificacionEmpleado1 + ComisionEmpleado1
        var TotalDevengadoEmpleado2 =
            salarioEmpleado2 + AuxilioEmpleado2 + HoraExtraEmpleado2 + BonificacionEmpleado2 + ComisionEmpleado2
        var TotalDevengadoEmpleado3 =
            salarioEmpleado3 + AuxilioEmpleado3 + HoraExtraEmpleado3 + BonificacionEmpleado3 + ComisionEmpleado3
        var TotalDevengadoEmpleado4 =
            salarioEmpleado4 + AuxilioEmpleado4 + HoraExtraEmpleado4 + BonificacionEmpleado4 + ComisionEmpleado4
        var TotalDevengadoEmpleado5 =
            salarioEmpleado5 + AuxilioEmpleado5 + HoraExtraEmpleado5 + BonificacionEmpleado5 + ComisionEmpleado5

        editTextResultadoDevengadosEmpleado45.setText(" $" + TotalDevengadoEmpleado1.toString())
        editTextResultadoDevengadosEmpleado2.setText(" $" + TotalDevengadoEmpleado2.toString())
        editTextResultadoDevengadosEmpleado3.setText(" $" + TotalDevengadoEmpleado3.toString())
        editTextResultadoDevengadosEmpleado4.setText(" $" + TotalDevengadoEmpleado4.toString())
        editTextResultadoDevengadosEmpleado5.setText(" $" + TotalDevengadoEmpleado5.toString())

        totales =
            TotalDevengadoEmpleado1 + TotalDevengadoEmpleado2 + TotalDevengadoEmpleado3 + TotalDevengadoEmpleado4 + TotalDevengadoEmpleado5
        editTextResultadoDevengadosEmpleadoTotal.setText(" $ " + totales)



        AporteSaludPensionEmpleado1 = (ComisionEmpleado1+salarioEmpleado1+HoraExtraEmpleado1)*0.08
        AporteSaludPensionEmpleado2 = (ComisionEmpleado2+salarioEmpleado2+HoraExtraEmpleado2)*0.08
        AporteSaludPensionEmpleado3 = (ComisionEmpleado3+salarioEmpleado3+HoraExtraEmpleado3)*0.08
        AporteSaludPensionEmpleado4 = (ComisionEmpleado4+salarioEmpleado4+HoraExtraEmpleado4)*0.08
        AporteSaludPensionEmpleado5 = (ComisionEmpleado5+salarioEmpleado5+HoraExtraEmpleado5)*0.08

        if (EmbargosEmpleado1){
            AporteEmbargoEmpleado1=(salarioEmpleado1- 828116)/5
            if (AporteEmbargoEmpleado1<0){
                AporteEmbargoEmpleado1=0.0
            }
        }
        if (EmbargosEmpleado2){
            AporteEmbargoEmpleado2=(salarioEmpleado2- 828116)/5
            if (AporteEmbargoEmpleado2<0){
                AporteEmbargoEmpleado2=0.0
            }
        }
        if (EmbargosEmpleado3){
            AporteEmbargoEmpleado3=(salarioEmpleado3- 828116)/5
            if (AporteEmbargoEmpleado3<0){
                AporteEmbargoEmpleado3=0.0
            }
        }
        if (EmbargosEmpleado4){
            AporteEmbargoEmpleado4=(salarioEmpleado4- 828116)/5
            if (AporteEmbargoEmpleado4<0){
                AporteEmbargoEmpleado4=0.0
            }
        }
        if (EmbargosEmpleado5){
            AporteEmbargoEmpleado5=(salarioEmpleado5- 828116)/5
            Toast.makeText(this, "valor:  "+AporteEmbargoEmpleado5, Toast.LENGTH_LONG).show()
            if (AporteEmbargoEmpleado5<0){
                AporteEmbargoEmpleado5=0.0
            }
        }

        if(FondoEmpleado1){
            AporteFondoEmpleado1=(ComisionEmpleado1+salarioEmpleado1+HoraExtraEmpleado1)*0.1
        }
        if(FondoEmpleado2){
            AporteFondoEmpleado2=(ComisionEmpleado2+salarioEmpleado2+HoraExtraEmpleado2)*0.1
        }
        if(FondoEmpleado3){
            AporteFondoEmpleado3=(ComisionEmpleado3+salarioEmpleado3+HoraExtraEmpleado3)*0.1
        }
        if(FondoEmpleado4){
            AporteFondoEmpleado4=(ComisionEmpleado4+salarioEmpleado4+HoraExtraEmpleado4)*0.1
        }
        if(FondoEmpleado5){
            AporteFondoEmpleado5=(ComisionEmpleado5+salarioEmpleado5+HoraExtraEmpleado5)*0.1

        }

        var TotalDescuentosDeduccionesEmpleado1= AporteSaludPensionEmpleado1+ PrestamoEmpleado1 + AporteEmbargoEmpleado1 + AporteFondoEmpleado1
        var TotalDescuentosDeduccionesEmpleado2= AporteSaludPensionEmpleado2+ PrestamoEmpleado2 + AporteEmbargoEmpleado2 + AporteFondoEmpleado2
        var TotalDescuentosDeduccionesEmpleado3= AporteSaludPensionEmpleado3+ PrestamoEmpleado3 + AporteEmbargoEmpleado3 + AporteFondoEmpleado3
        var TotalDescuentosDeduccionesEmpleado4= AporteSaludPensionEmpleado4+ PrestamoEmpleado4 + AporteEmbargoEmpleado4 + AporteFondoEmpleado4
        var TotalDescuentosDeduccionesEmpleado5= AporteSaludPensionEmpleado5+ PrestamoEmpleado5 + AporteEmbargoEmpleado5 + AporteFondoEmpleado5
        totales= TotalDescuentosDeduccionesEmpleado1+TotalDescuentosDeduccionesEmpleado2+TotalDescuentosDeduccionesEmpleado3+TotalDescuentosDeduccionesEmpleado4+TotalDescuentosDeduccionesEmpleado5

        editTextResultadoDescuentosYDeduccionesEmpleado1.setText(" $ "+TotalDescuentosDeduccionesEmpleado1)
        editTextResultadoDescuentosYDeduccionesEmpleado2.setText(" $ "+TotalDescuentosDeduccionesEmpleado2)
        editTextResultadoDescuentosYDeduccionesEmpleado3.setText(" $ "+TotalDescuentosDeduccionesEmpleado3)
        editTextResultadoDescuentosYDeduccionesEmpleado4.setText(" $ "+TotalDescuentosDeduccionesEmpleado4)
        editTextResultadoDescuentosYDeduccionesEmpleado5.setText(" $ "+TotalDescuentosDeduccionesEmpleado5)
        editTextResultadoDescuentosYDeduccionesTotal.setText(" $ "+totales)

        var NetoPagarEmpleado1 = TotalDevengadoEmpleado1-TotalDescuentosDeduccionesEmpleado1
        var NetoPagarEmpleado2 = TotalDevengadoEmpleado2-TotalDescuentosDeduccionesEmpleado2
        var NetoPagarEmpleado3 = TotalDevengadoEmpleado3-TotalDescuentosDeduccionesEmpleado3
        var NetoPagarEmpleado4 = TotalDevengadoEmpleado4-TotalDescuentosDeduccionesEmpleado4
        var NetoPagarEmpleado5 = TotalDevengadoEmpleado5-TotalDescuentosDeduccionesEmpleado5
        totales=NetoPagarEmpleado1+NetoPagarEmpleado2+NetoPagarEmpleado3+NetoPagarEmpleado4+NetoPagarEmpleado5
        editTextResultadoNetoPagarEmpleado1.setText(" $ "+NetoPagarEmpleado1)
        editTextResultadoNetoPagarEmpleado2.setText(" $ "+NetoPagarEmpleado2)
        editTextResultadoNetoPagarEmpleado3.setText(" $ "+NetoPagarEmpleado3)
        editTextResultadoNetoPagarEmpleado4.setText(" $ "+NetoPagarEmpleado4)
        editTextResultadoNetoPagarEmpleado5.setText(" $ "+NetoPagarEmpleado5)
        editTextResultadoNetoPagarTotal.setText(" $ "+totales)


    }


    fun regresar(view: View) {

        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}