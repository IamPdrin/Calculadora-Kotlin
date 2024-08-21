package com.example.calculadoraohm.controller

class Calcula() {
    fun corrente(r: Double,v: Double): Double {
        val i = v / r
        return i
    }

    fun resistencia(v: Double, i: Double): Double {
        val r = v / i
        return r
    }

    fun tensao(r: Double, i: Double): Double {
        val v = r * i
        return v
    }
}