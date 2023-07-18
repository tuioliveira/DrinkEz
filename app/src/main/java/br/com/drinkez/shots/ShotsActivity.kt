package br.com.drinkez.shots

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.comfiap.primeiroaplicativo.databinding.ActivityShotsBinding

class ShotsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShotsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        // jager bomb
        binding = ActivityShotsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}