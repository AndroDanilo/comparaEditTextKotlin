package com.curso.android.app.practica.ejerciciocomparaedittexv200

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun compara01(){
        val com01 = 1
        val com02 = 2
        val res = "resultado"
        if (com01==com02 ){
            print("Son iguales")
        }
        else {print("Son Distintas")}
    }

    @Test
    fun comparaEditText01(){
        val com01 = 1
        val com02 = 2
        val res = "resultado"
        if (com01==com02 ){
            print("Son iguales")
        }
        else {print("Son Distintas")}
    }




    @Test
    fun compara02(){
        val com01 = 1
        val com02 = 2
        val res = "resultado"
        if (com01==com02 ){
            val res = "Son Iguales"
        }
        else {val res="Son distintas"}
    }

    @Test
    fun compara00() {
        println(1 == 1)
    }

    @Test
    fun condicional00()
    { val color ="AZUL"
        if(color=="AZUL")
        {println("SI ES AZUL")
        }
        else{println("NO ES AZUL")
        }
    }
    @Test
    fun condicional01()
    { val color ="AZUL"
        if(color=="AZUL")
        {println("SI ES AZUL")
        }
        else if (color =="VERDE")
        { println("SI ES VERDE")
        }
        else {println("NO ES AZUL NI VERDE")}
    }

    @Test
    fun condicionWhen(){
        val color ="AZUL"
        when(color){
            "AZUL" -> println("ES AZUL")
            "VERDE" -> println("ES VERDE")
            "AMARILLO" -> println("ES AMARILLO")
            "CELESTE","VIOLETA","NARANJA"->println("ES CELESTE O VIOLETA O NARANJA")
            else -> println("NO ES AZUL NI VERDE NI AMARILLO NI CELESTE NI VIOLETA NI NARANJA")
        }
    }

    @Test
    fun condicionIn() {
        val x = 3
        when (x) {
            2, 3, 5, 7 -> println("x es un numero primo entre 1 a 10")
            in 1..0 -> println("x esta entre el 1 al 10.")
            else -> println("x no esta entre 1 a 10")
        }
    }

}