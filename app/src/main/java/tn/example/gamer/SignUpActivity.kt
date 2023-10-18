package tn.example.gamer

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)
        val nom = findViewById<EditText>(R.id.editTextText)
        val email = findViewById<EditText>(R.id.editTextText2)
        val password = findViewById<EditText>(R.id.editTextTextPassword)
        val passwordconfirm = findViewById<EditText>(R.id.editTextTextPassword2)
        button.setOnClickListener {
        }

    }
}