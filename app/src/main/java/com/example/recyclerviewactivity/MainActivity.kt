package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var ed1: EditText
    private lateinit var ed2: EditText
    private lateinit var ed3: EditText
    private lateinit var ed4: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ed1= findViewById(R.id.ed1)
        ed2= findViewById(R.id.ed2)
        ed3= findViewById(R.id.ed3)
        ed4= findViewById(R.id.ed4)

    }

    fun showData(view: View) {
        if (ed1.text.isNotBlank()&&
            ed2.text.isNotBlank()&&
            ed3.text.isNotBlank()&&
            ed4.text.isNotBlank()){
            Data.name= ed1.text.toString()
            Data.location= ed2.text.toString()
            Data.info1= ed3.text.toString()
            Data.info2= ed4.text.toString()
            startActivity(Intent(this,ViewRV::class.java))
        }
        else
            Toast.makeText(this,"Please Enter Valid Values",Toast.LENGTH_SHORT).show()
    }
}