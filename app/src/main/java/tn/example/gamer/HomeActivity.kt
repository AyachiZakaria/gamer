package tn.example.gamer

import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.google.android.material.bottomnavigation.BottomNavigationView
import tn.example.gamer.databinding.HomeActivityBinding

class HomeActivity: AppCompatActivity() {
    private  lateinit var fragmentManager: FragmentManager
    private lateinit var binding: HomeActivityBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = HomeActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val toolbar = findViewById<Toolbar>(R.id.app_bar)
        setSupportActionBar(toolbar)
        val navView: BottomNavigationView = binding.bottomNavigation
        binding.bt1.setOnClickListener{
            goToFragment(NewsFragment())
        }


        binding.bt2.setOnClickListener{
            goToFragment(StoreFragment())
        }

    }
    private  fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true;
    }
}