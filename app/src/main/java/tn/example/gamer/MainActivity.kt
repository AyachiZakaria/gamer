package tn.example.gamer

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import org.w3c.dom.Text
import tn.example.gamer.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var string:String
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnlogin = findViewById<Button>(R.id.button2)
        val email = findViewById<EditText>(R.id.editTextNumber4)
        btnlogin.setOnClickListener{
            if(email.text.toString().trim().length==0){
                val alertDialogBuilder = AlertDialog.Builder(this)
                alertDialogBuilder.setTitle("empty!")
                val alertDialog = alertDialogBuilder.create()
                alertDialog?.show()

            }
            val alertDialogBuilder = AlertDialog.Builder(this)
            alertDialogBuilder.setTitle("Welcome!")
            val alertDialog = alertDialogBuilder.create()
            alertDialog?.show()
        }



    }
}