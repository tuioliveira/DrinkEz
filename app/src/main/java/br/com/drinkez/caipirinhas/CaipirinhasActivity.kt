package br.com.drinkez.caipirinhas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.comfiap.primeiroaplicativo.databinding.ActivityCaipirinhasBinding

class CaipirinhasActivity : AppCompatActivity(){

    private lateinit var binding: ActivityCaipirinhasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun  init() {
        // caipirinha de limão
        binding = ActivityCaipirinhasBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}