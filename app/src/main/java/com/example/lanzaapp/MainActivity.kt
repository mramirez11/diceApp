package com.example.lanzaapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    // Las variables var se pueden reasignar miles de veces
    lateinit var imgDice : ImageView
    lateinit var imgDice2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imgDice=findViewById(R.id.img_dice)
        imgDice2=findViewById(R.id.img_dice2)


        //Las variables val son constantes, no puedo volver a asignarlas
        //Variable rollBtn de tipo button y le hacemos la referencia al boton del xml
        val rollBtn : Button = findViewById(R.id.btn_dice)
        rollBtn.setOnClickListener{
            roll()
        }

    }
    fun roll(){
        val randomInt= Random().nextInt(6)+1
        val randomInt2= Random().nextInt(6)+1
        //imgDice.setText(Integer.toString(randomInt))
        val drawableResource= when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        val drawableResource2= when(randomInt2){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        imgDice.setImageResource(drawableResource)
        imgDice2.setImageResource(drawableResource2)
        Log.d("Lanzaap", "Click") //Mostrar por pantalla debug
    }
}
