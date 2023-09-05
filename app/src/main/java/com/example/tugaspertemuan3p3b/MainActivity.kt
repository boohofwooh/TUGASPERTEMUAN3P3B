package com.example.tugaspertemuan3p3b

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.tugaspertemuan3p3b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    var angka1 = 0
    var angka2 = 0
    var edt1opr = ""
    fun buttonNumber(view: View) {
        with(binding) {
            when ((view as Button).text.toString()) {
                "+" -> {
                    angka1 = edt1.text.toString().toInt()
                    edt1opr = edt1.text.toString() + "+"
                    edt1.text = edt1opr
                }

                "-" -> {
                    angka1 = edt1.text.toString().toInt()
                    edt1opr = edt1.text.toString() + "-"
                    edt1.text = edt1opr
                }

                "*" -> {
                    angka1 = edt1.text.toString().toInt()
                    edt1opr = edt1.text.toString() + "*"
                    edt1.text = edt1opr
                }

                "/" -> {
                    angka1 = edt1.text.toString().toInt()
                    edt1opr = edt1.text.toString() + "/"
                    edt1.text = edt1opr
                }

                "C" -> {
                    edt1.text = ""
                    edt1opr = ""
                }

                "=" -> {
                    var teks = edt1.text.toString()
                    var angkaSementara = teks.replace(edt1opr.toString(), "").trim()
                    angka2 = angkaSementara.toInt()

                    if("+" in edt1opr){
                        edt1.text = (angka1 + angka2).toString()
                    } else if ("-" in edt1opr){
                        edt1.text = (angka1 - angka2).toString()
                    } else if ("*" in edt1opr){
                        edt1.text = (angka1 * angka2).toString()
                    } else if ("/" in edt1opr){
                        edt1.text = (angka1.toDouble() / angka2.toDouble()).toString()
                    }
                }

                "D" -> {
                    edt1.text = edt1.text.dropLast(1)
                }

                else -> {
                     edt1.text = edt1.text.toString() + (view as Button).text.toString()
                }
            }
        }
    }
}