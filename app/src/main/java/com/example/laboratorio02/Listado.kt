package com.example.laboratorio02

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Listado : AppCompatActivity() {
    //Creacion de variables
    private var MOSTRAR: ListView?=null
    private var Nombre: TextView?=null

    private val Lenguajes = arrayOf("Kotlin","Java","C++","C#","php","VB.net")
    private val posicion = arrayOf("1","6","3","2","4","5")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MOSTRAR=findViewById(R.id.MOSTRAR)
        Nombre=findViewById(R.id.Nombre)

        //crear un adaptador para que logre mostrar la vista
        var adaptador: ArrayAdapter<String> = ArrayAdapter <String>(this,R.layout.files,Lenguajes)
        MOSTRAR?.adapter=adaptador

        MOSTRAR?.onItemClickListener = object : AdapterView.OnItemClickListener{

            override fun onItemClick(
                parent: AdapterView<*>?,
                viwe: View?,
                position: Int,
                id: Long
            ) {
                Nombre?.text="La persona se llama ${MOSTRAR?.getItemAtPosition(position)}"
            }

        }

    }
}