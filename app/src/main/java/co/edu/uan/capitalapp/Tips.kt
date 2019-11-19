package co.edu.uan.capitalapp

import android.animation.Animator
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo
import kotlinx.android.synthetic.main.tips.*
import java.util.*
import kotlin.collections.ArrayList

class Tips : AppCompatActivity() {
    var numberAttempts=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tips)
        drawTips()
    }
    
    private fun drawTips() {
        val listaConsejos = leerListaConsejos()
        for(consejo in listaConsejos) {
            addConsejo(consejo)
        }
    }
    
    private fun leerListaConsejos() : ArrayList<String> {
        val inputStream = resources.openRawResource(R.raw.base_consejos)
        val scanner = Scanner(inputStream)
        val lista = ArrayList<String>()
        scanner.nextLine()
        while(scanner.hasNextLine()) {
            val line = scanner.nextLine()
            lista.add(line)
        }
        scanner.close()
        return lista
    }
    private fun addConsejo(consejo: String) {
        numberAttempts++;
        val ib = Button(this)
        val text = TextView(this)
        text.setText(consejo)
        text.setTextColor(Color.parseColor("#000000"))
        ib.setText("Consejo "+numberAttempts+"!")
        ib.setOnClickListener {
            YoYo.with(Techniques.FlipInX)
                .duration(1700)
                .withListener(object: Animator.AnimatorListener {
                    override fun onAnimationRepeat(p0: Animator?) {
                        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    }
                    override fun onAnimationEnd(animation: Animator?) {

                    }
                    override fun onAnimationCancel(animation: Animator?) {
                    }
                    override fun onAnimationStart(animation: Animator?) {
                    }
                })
                .playOn(text)
        }
        tipslist.addView(ib)
        tipslist.addView(text)

    }
}