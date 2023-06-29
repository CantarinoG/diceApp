package com.guilhermecantarino.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.chip.ChipGroup

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textoDaTela: TextView = findViewById(R.id.txtValor)
        val botao: Button = findViewById(R.id.btnRoll)
        val imagemDoDado: ImageView = findViewById(R.id.imgDado)
        val chipGroup: ChipGroup = findViewById(R.id.chipGroup)

        var faceSorteada = 1

        chipGroup.setOnCheckedChangeListener{_, checkedId ->
            textoDaTela.text = resources.getString(R.string.valueNull)
            when(checkedId) {
                R.id.d4 -> imagemDoDado.setImageResource(R.drawable.d4_1)
                R.id.d6 -> imagemDoDado.setImageResource(R.drawable.d6_1)
                R.id.d8 -> imagemDoDado.setImageResource(R.drawable.d8_1)
                R.id.d10 -> imagemDoDado.setImageResource(R.drawable.d10_1)
                R.id.d12 -> imagemDoDado.setImageResource(R.drawable.d12_1)
                R.id.d20 -> imagemDoDado.setImageResource(R.drawable.d20_1)
            }
        }

        botao.setOnClickListener {
            when(chipGroup.checkedChipId) {
                R.id.d4 -> {
                    faceSorteada = (1..4).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d4_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d4_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d4_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d4_4)
                    }
                }
                R.id.d6 -> {
                    faceSorteada = (1..6).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d6_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d6_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d6_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d6_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d6_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d6_6)
                    }
                }
                R.id.d8 -> {
                    faceSorteada = (1..8).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d8_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d8_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d8_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d8_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d8_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d8_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d8_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d8_8)
                    }
                }
                R.id.d10 -> {
                    faceSorteada = (1..10).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d10_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d10_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d10_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d10_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d10_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d10_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d10_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d10_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d10_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d10_10)
                    }
                }
                R.id.d12 -> {
                    faceSorteada = (1..12).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d12_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d12_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d12_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d12_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d12_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d12_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d12_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d12_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d12_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d12_10)
                        11 -> imagemDoDado.setImageResource(R.drawable.d12_11)
                        12 -> imagemDoDado.setImageResource(R.drawable.d12_12)
                    }
                }
                R.id.d20 -> {
                    faceSorteada = (1..12).random()
                    textoDaTela.text = resources.getString(R.string.value, faceSorteada.toString())
                    when(faceSorteada){
                        1 -> imagemDoDado.setImageResource(R.drawable.d20_1)
                        2 -> imagemDoDado.setImageResource(R.drawable.d20_2)
                        3 -> imagemDoDado.setImageResource(R.drawable.d20_3)
                        4 -> imagemDoDado.setImageResource(R.drawable.d20_4)
                        5 -> imagemDoDado.setImageResource(R.drawable.d20_5)
                        6 -> imagemDoDado.setImageResource(R.drawable.d20_6)
                        7 -> imagemDoDado.setImageResource(R.drawable.d20_7)
                        8 -> imagemDoDado.setImageResource(R.drawable.d20_8)
                        9 -> imagemDoDado.setImageResource(R.drawable.d20_9)
                        10 -> imagemDoDado.setImageResource(R.drawable.d20_10)
                        11 -> imagemDoDado.setImageResource(R.drawable.d20_11)
                        12 -> imagemDoDado.setImageResource(R.drawable.d20_12)
                        13 -> imagemDoDado.setImageResource(R.drawable.d20_13)
                        14 -> imagemDoDado.setImageResource(R.drawable.d20_14)
                        15 -> imagemDoDado.setImageResource(R.drawable.d20_15)
                        16 -> imagemDoDado.setImageResource(R.drawable.d20_16)
                        17 -> imagemDoDado.setImageResource(R.drawable.d20_17)
                        18 -> imagemDoDado.setImageResource(R.drawable.d20_18)
                        19 -> imagemDoDado.setImageResource(R.drawable.d20_19)
                        20 -> imagemDoDado.setImageResource(R.drawable.d20_20)
                    }
                }
            }

        }

    }
}