package com.curso.android.app.practica.ejerciciocomparaedittexv200.view
import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.curso.android.app.practica.ejerciciocomparaedittexv200.model.Comparar
import kotlinx.coroutines.launch


class MainViewModel: ViewModel() {
    // el observe del main espera un cambio de resultado que contiene valor de textview "verlo"
    // y verlo usa la variable "data" del modelo Comparar
    val resultado: LiveData<Comparar> get() = verlo
   private var verlo = MutableLiveData<Comparar>(Comparar(""))
    // var Comparar2 = Comparar2("")


     fun comparaEditView(c1:EditText,c2:EditText) {
        //Los paso a string para compararlos en el if
        val c1: String = c1.getText().toString().trim();
        val c2: String = c2.getText().toString().trim();
        //If else que verifica no estar vacios y si son iguales o no
          if(c1=="" && c2==""){
            updateResultado("ESCRIBE ALGO !!!!")
          }
          else if(c1==c2) {
           updateResultado("SON IGUALES !!!!")
          }
          else{
             updateResultado("SON DISTINTAS !!!!")
          }
    }

     private fun updateResultado(es:String) {
         //funcion privada que toma el valor de "es" y lo poner en textview "verlo"
        viewModelScope.launch {
            verlo.value = Comparar(es)
        }
    }
}
