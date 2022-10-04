package com.example.laboratorio02

import android.content.ContentValues
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var edit_Nombre: EditText
    lateinit var edit_Edad: EditText
    lateinit var edit_departamento: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_Nombre = findViewById(R.id.edit_Nombre)
        edit_Edad = findViewById(R.id.edit_Edad)
        edit_departamento = findViewById(R.id.edit_departamento)
    }
    fun registrar()
    {
        val Reg = arrayListOf<String>()
        val nombre =edit_Nombre?.text.toString()
        Reg.add(nombre)
        println(Reg)


        val Reg1 = arrayListOf<String>()
        val edad = edit_Edad?.text.toString().toInt()
        Reg1.add(edad.toString())
        println(Reg1)

        val Reg2 = arrayListOf<String>()
        val departamento = edit_departamento.toString()
        Reg2.add(departamento)
        println(Reg2)




    }
}