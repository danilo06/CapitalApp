package co.edu.uan.capitalapp

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.tips.*
import java.util.*
import kotlin.collections.ArrayList

class Tips : AppCompatActivity() {
    var numberAttempts=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tips)
        drawCards()
    }

    private fun drawCards() {
        val cardList = readCardsFile()
        for(card in cardList) {
            addCard(card)
        }
    }

    private fun readCardsFile() : ArrayList<String> {
        // Open the cards file as a raw resource
        val inputStream = resources.openRawResource(R.raw.base_consejos)
        val scanner = Scanner(inputStream)
        // Read all the lines of the file
        val cardsList = ArrayList<String>()
        scanner.nextLine()
        while(scanner.hasNextLine()) {
            val line = scanner.nextLine()
            cardsList.add(line)
        }
        scanner.close()
        return cardsList
    }
    private fun addCard(card: String) {
        numberAttempts++;
        val ib = Button(this)

        val text = TextView(this)
        text.setText(card)
        text.setTextColor(Color.parseColor("#000000"))
        ib.setText("Consejo "+numberAttempts+"!")
        ib.setOnClickListener {
        }
        tipslist.addView(ib)
        tipslist.addView(text)

    }

    private fun getNumber(card: String) : String {
        val cols = card.split(",")
        return cols[1]
    }


}