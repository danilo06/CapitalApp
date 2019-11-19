package co.edu.uan.capitalapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class   Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun starLogin(view: View){
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }

    fun starFacebook(view: View){

        alert("Testing alerts") {
            title("Alert")
            yesButton { toast("Yess!!!") }
            noButton { }
        }.show()
    }
}