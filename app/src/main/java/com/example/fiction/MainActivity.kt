package com.example.fiction

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.toolbar))


        /**findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
        .setAction("Action", null).show()
        }*/
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId
        /*if (id == R.id.action_settings) {
            val newFragment: DialogFragment = AboutUsFragment()
            newFragment.show(supportFragmentManager, DialogFragment::class.java.getSimpleName())
            return true
        }*/
        return when (item.itemId) {
            R.id.favourite -> {

                Toast.makeText(this, "T'as raison, moi aussi je l'adore celui-là !", Toast.LENGTH_LONG).show();
                true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Est-ce que t'as VRAIMENT besoin des settings?", Toast.LENGTH_LONG).show();
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}