package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.login.*
import java.util.*

class Login : AppCompatActivity() {

    var user: String = ""
    var password: String=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        leerUser()
    }

    fun iniciarSesion(view: View){
        if(et_correo.text.toString().isNullOrEmpty() || et_contrasena.text.toString().isNullOrEmpty()){
            Toast.makeText(applicationContext,"Digite los datos requeridos", Toast.LENGTH_SHORT).show()
        }else{
            if(et_correo.text.toString().equals(user) || et_contrasena.text.toString().equals(password)){
                val intent = Intent(this, Menu::class.java)
                startActivity(intent)
            }else
            {
                Toast.makeText(applicationContext,"Verifique la informacion registrada", Toast.LENGTH_SHORT).show()
            }
        }
    }

    fun registrar(view: View){
        val intent = Intent(this, Registrar::class.java)
        startActivity(intent)
    }

    private fun leerUser()  {
        val inputStream = resources.openRawResource(R.raw.base_user)
        val scanner = Scanner(inputStream)
        scanner.nextLine()
        user = scanner.nextLine()
        password = scanner.nextLine()
        scanner.close()
    }
}