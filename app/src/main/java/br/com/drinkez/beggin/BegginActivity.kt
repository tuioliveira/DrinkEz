package br.com.drinkez.beggin

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.comfiap.primeiroaplicativo.databinding.ActivityBegginBinding

class BegginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBegginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        // Iniciando o view binding
        binding = ActivityBegginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.glass.setOnClickListener {
            Toast.makeText(
                this,
                "glass",
                Toast.LENGTH_SHORT,
            ).show()
        }
    }
}