package ipvc.estg.lab7controloscomuns

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun button1(view: View) {

        var editTextHello = findViewById<EditText>(R.id.editTextTextPersonName)
        Toast.makeText(this, editTextHello.text, Toast.LENGTH_SHORT).show()
        findViewById<TextView>(R.id.txt1).setText(editTextHello.text)
    }

    fun button2(view: View) {
        Toast.makeText(this, "Button 2", Toast.LENGTH_SHORT).show()
    }
}