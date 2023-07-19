package br.com.drinkez.beggin

import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.drinkez.drinkk.DrinkkActivity
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
            val intent = Intent(this, DrinkkActivity::class.java)
            startActivity(intent)
        }
        val nickainleyFont = Typeface.createFromAsset(assets, "Nickainley-Normal.otf")
        binding.logotype.typeface = nickainleyFont
    }
}