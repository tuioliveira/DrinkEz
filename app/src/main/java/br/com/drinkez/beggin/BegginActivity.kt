package br.com.drinkez.beggin

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import br.comfiap.primeiroaplicativo.databinding.ActivityBegginBinding

class BegginActivity : ComponentActivity() {
    private lateinit var binding: ActivityBegginBinding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        // Iniciando o view binding
        binding = ActivityBegginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() {
        binding.glass.setOnClickListener {
            Toast.makeText(
                this,
                "glass",
                Toast.LENGTH_SHORT,
            ).show()
        }

    }
}