package br.com.drinkez.drinkk

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.drinkez.caipirinhas.CaipirinhasActivity
import br.comfiap.primeiroaplicativo.databinding.ActivityBegginBinding
import br.comfiap.primeiroaplicativo.databinding.ActivityDrinkkBinding

class DrinkkActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDrinkkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        // Iniciando o view binding
        binding = ActivityDrinkkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.caipirinha.setOnClickListener {
            val intent = Intent(this, CaipirinhasActivity::class.java)
            startActivity(intent)
        }
        binding.shots.setOnClickListener {
            Toast.makeText(
                this,
                "shots",
                Toast.LENGTH_SHORT,
            ).show()
        }
        binding.famous.setOnClickListener {
            Toast.makeText(
                this,
                "populares",
                Toast.LENGTH_SHORT,
            ).show()
        }
        binding.a.setOnClickListener {
            Toast.makeText(
                this,
                "a",
                Toast.LENGTH_SHORT,
            ).show()
        }
        binding.b.setOnClickListener {
            Toast.makeText(
                this,
                "b",
                Toast.LENGTH_SHORT,
            ).show()
        }
        binding.c.setOnClickListener {
            Toast.makeText(
                this,
                "c",
                Toast.LENGTH_SHORT,
            ).show()
        }
    }

}