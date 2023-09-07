package com.example.proyectofinal.view

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectofinal.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainActivityViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mainViewModel.comparador.observe(this){
            //binding.edtCadena1.text = "${it.cad1}"
            //binding.edtCadena2.text = "${it.cad2}"
            binding.btnComparar.callOnClick()
        }

        binding.btnComparar.setOnClickListener {
            mainViewModel.compararStrings(this.binding.edtCadena1.text.toString() , this.binding.edtCadena2.text.toString())
        }
    }
}



