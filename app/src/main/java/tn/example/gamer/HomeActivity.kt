package tn.example.gamer

import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import tn.example.gamer.databinding.HomeActivityBinding

class HomeActivity: AppCompatActivity() {
    private  lateinit var fragmentManager: FragmentManager
    private lateinit var binding: HomeActivityBinding



    private  fun goToFragment(fragment: Fragment){
        fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.fragmentContainer,fragment).commit()
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.custom_menu, menu)
        return true;
    }
}