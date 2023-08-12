package com.curso.android.app.practica.ejerciciocomparaedittexv200.view


import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.curso.android.app.practica.ejerciciocomparaedittexv200.R
import com.curso.android.app.practica.ejerciciocomparaedittexv200.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

      // binding necesario para tomar las actividades del main
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val mediaPlayer = MediaPlayer.create(this, R.raw.cascanueces_1)
        mediaPlayer.start()

        // traemos en el create las prestaciones del binding
        // necesarias para tomar datos del main
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        mainViewModel.resultado.observe(this) {
        binding.result.text = "${it.data}"
            //observa los cambios del "resultado" definido en el viewmodel
        }

        binding.compararlo.setOnClickListener {
          mainViewModel.comparaEditView(findViewById(R.id.campo01),findViewById(R.id.campo02))
            //envia a la funcion publica los valores de c1 y c2 de los editText
        }




    }

}
