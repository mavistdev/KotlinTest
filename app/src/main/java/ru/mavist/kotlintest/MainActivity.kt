package ru.mavist.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userinput = findViewById<EditText>(R.id.editTextText)
        val confirmButton: Button =findViewById(R.id.button)

        confirmButton.setOnClickListener {
            var text = userinput.text.toString().trim()
            if(text == "toast"){
                Toast.makeText(this, "User toast event", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Неа", Toast.LENGTH_SHORT).show()
            }
        }
    }
}