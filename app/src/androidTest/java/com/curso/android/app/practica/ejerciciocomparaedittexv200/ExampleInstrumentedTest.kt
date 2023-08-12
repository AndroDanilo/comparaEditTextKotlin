package com.curso.android.app.practica.ejerciciocomparaedittexv200

import android.widget.EditText
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.curso.android.app.practica.ejerciciocomparaedittexv200.model.Comparar
import kotlinx.coroutines.launch

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals(
            "com.curso.android.app.practica.ejerciciocomparaedittexv200",
            appContext.packageName
        )

    }
    @Test
    fun comparaEditView() {

        val c1="23"
        val c2= "23"

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
@Test
    private fun updateResultado(es:String) {
        print(es)
    }

}