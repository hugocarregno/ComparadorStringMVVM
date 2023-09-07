package com.example.proyectofinal.view

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.proyectofinal.model.Comparador
import kotlinx.coroutines.launch

class MainActivityViewModel : ViewModel() {
    val comparador: LiveData<Comparador> get() = comparador
    //private val resultado = MutableLiveData<Boolean>()

    fun getResultado(): Boolean {
        return comparador.value.respuesta
    }

    fun compararStrings(cad1: String, cad2: String) {
        val iguales = cad1 == cad2
        comparador.value.respuesta = iguales
    }
}