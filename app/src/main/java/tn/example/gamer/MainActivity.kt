package tn.example.gamer

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.google.android.material.snackbar.Snackbar
import org.w3c.dom.Text
import tn.example.gamer.databinding.ActivityMainBinding
import kotlin.math.log
lateinit var button: Button
lateinit var editText: EditText
lateinit var string: String
lateinit var textView: TextView
class MainActivity : AppCompatActivity() {

private lateinit var binding: ActivityMainBinding
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val emailRegex = "^[A-Za-z0-9+_.-]+@esprit.tn+\$"
        val btnlogin = findViewById<Button>(R.  id.button2)
        val email = findViewById<EditText>(R.id.textInputEditText4)
        val password = findViewById<EditText>(R.id.textInputEditText2)
        val forgotpassword = findViewById<TextView>(R.id.textView3)
        val facebook = findViewById<ImageView>(R.id.imageView2)
        val google = findViewById<ImageView>(R.id.imageView3)
        forgotpassword.setOnClickListener{
            val myIntent = Intent(this@MainActivity, forgotpasswordactivity::class.java)
            startActivity(myIntent)
        }
        facebook.setOnClickListener {
            val snack = Snackbar.make(it,"Coming Soon",Snackbar.LENGTH_LONG)
            snack.show()
        }
        google.setOnClickListener {
            val snack = Snackbar.make(it,"Coming Soon",Snackbar.LENGTH_LONG)
            snack.show()
        }
        btnlogin.setOnClickListener {
            if(email.text.toString().length==0 || password.text.toString().length==0 || !(email.text.toString().matches(emailRegex.toRegex())))
            {
                val snack = Snackbar.make(it,"You have some errors in your input!",Snackbar.LENGTH_LONG)
                snack.show()
            }

        }



    }
}