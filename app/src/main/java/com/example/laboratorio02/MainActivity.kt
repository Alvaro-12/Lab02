package com.example.laboratorio02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var Nombre: EditText
    lateinit var Edad: EditText
    lateinit var departamento: EditText
    lateinit var Lv_Lista: ListView
    lateinit var Lv_Datos: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Nombre = findViewById(R.id.edit_Nombre)
        Edad = findViewById(R.id.edit_Edad)
        departamento = findViewById(R.id.edit_departamento)
        Lv_Lista = findViewById(R.id.Lv_Lista)
        Lv_Datos = findViewById(R.id.Lv_Datos)

    }
    fun registrar(Vista: View)
    {
        //Nombre.add(edit_Nombre)
        val Reg = arrayListOf<String>()
        val nombre =Nombre?.text.toString()
        Reg.add(nombre)
        println(Reg)

        val Reg1 = arrayListOf<String>()
        val edad = Edad?.text.toString().toInt()
        Reg1.add(edad.toString())
        println(Reg1)

        val Reg2 = arrayListOf<String>()
        val departamento = departamento?.text.toString()
        Reg2.add(departamento)
        println(Reg2)


        var adaptador: ArrayAdapter<String> = ArrayAdapter <String>(this,R.layout.files,Reg)
        Lv_Lista?.adapter=adaptador

        Lv_Lista?.onItemClickListener=object : AdapterView.OnItemClickListener
        {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                Lv_Datos.setText("La Persona ${Reg.get(p2)} de edad ${Reg1.get(p2)} años, vive en el departamento ${Reg2.get(p2)}")

            }

        }
        }
}