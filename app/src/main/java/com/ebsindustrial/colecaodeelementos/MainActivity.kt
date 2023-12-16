package com.ebsindustrial.colecaodeelementos

import android.app.Instrumentation.ActivityResult
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.view.isVisible
import com.ebsindustrial.colecaodeelementos.databinding.ActivityMainBinding
import com.ebsindustrial.colecaodeelementos.databinding.ActivityPagina2Binding
import com.ebsindustrial.colecaodeelementos.databinding.ActivityPagina3Binding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var num = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        conhecendoTexto()
        conhecendoBotao()
        conhecendoSwitch()
        conhecendoCheckBox()
        conhecendoRadioButton()
        conhhecenndoImagem()
        conhecendoEditText()
        conhecendoToggleButton()
        conhecendoNavegar()
    }
    //
    fun conhecendoTexto(){
        val clicouNoTexto = "Voce clicou no texto"

        binding.texto1.setOnClickListener{
            binding.texto1.text = clicouNoTexto
        }
    }
    //
    fun conhecendoBotao(){
        binding.botao1.setOnClickListener {
            val clicouBotao1 = "Voce clicou no botao 1"
            binding.texto1.text = clicouBotao1
        }
        //
        binding.botao2.setOnClickListener {
            val clicouBotao2 = "Voce clicou no botao 2"
            binding.texto1.text = clicouBotao2
            Toast.makeText(this, "Clicou no botao 2 com icon", Toast.LENGTH_SHORT).show()
        }
    }
    //
    fun conhecendoSwitch(){
        binding.chave.setOnCheckedChangeListener { _,   isChecked ->
            binding.texto1.text = if (isChecked) {
                "Voce ligou a chave Switch"
            } else {
                "Voce desligou a chave Switch"
            }
        }
    }
    //
    fun conhecendoCheckBox(){
        binding.box1.setOnCheckedChangeListener { _, isChecked ->
            binding.texto1.text = if (isChecked) {
                "Box 1 selecionado"
            }else {
                "Box 1 sem seleção"
            }
        }
        //
        binding.box2.setOnCheckedChangeListener { _, isChecked ->
            binding.texto1.text = if (isChecked) {
                "Box 2 selecionado"
            }else {
                "Box 2 sem seleção"
            }
        }
        //
        binding.box3.setOnCheckedChangeListener { _, isChecked ->
            binding.texto1.text = if (isChecked) {
                "Box 3 selecionado"
            }else {
                "Box 3 sem seleção"
            }
        }
    }
    //
    fun conhecendoRadioButton(){
        binding.radioGrupo.setOnCheckedChangeListener { _, id ->
            binding.texto1.text = when (id) {
                R.id.radio1 -> {
                    "Radio Button 1 foi selecionado"
                }
                R.id.radio2 -> {
                    "Radio Button 2 foi selecionado"
                }
                else -> {
                    "Radio Button 3 foi selecionado"
                }
            }
        }
    }
    //
    fun conhhecenndoImagem(){
        binding.imagem.setOnClickListener {
            if (num == 1) {
                binding.imagem.setImageResource(R.drawable.loja2)
                num = 2
                Log.i("INFOTESTE", "$num")
            }else if (num == 2) {
                binding.imagem.setImageResource(R.drawable.loja3)
                num = 3
                Log.i("INFOTESTE", "$num")
            } else {
                binding.imagem.setImageResource(R.drawable.loja1)
                num = 1
                Log.i("INFOTESTE", "$num")
            }
        }
    }
    //
    fun conhecendoEditText(){
        binding.enviar.setOnClickListener {
            val texto = binding.inserirTexto2.text.toString()
            var soma = 10
            soma += texto.toInt() // converte texto para poder somar
            binding.texto1.text = soma.toString() // converte soma para poder imprimir
            Log.i("INFOTESTE", "$soma")
            binding.inserirTexto2.setText("") // limpa campo
        }
    }
    //
    fun conhecendoToggleButton(){
        binding.interruptor.setOnCheckedChangeListener { _, isChecked ->
            binding.texto1.text = if (isChecked){
                binding.barraProgresso.isVisible = true
                "Interruptor ligado"
            }else{
                binding.barraProgresso.isVisible = false
                "Interruptor desligado"
            }
        }
    }
    //
    fun conhecendoNavegar(){

        if (intent.hasExtra("user")){
            binding.btPag2.setOnClickListener {
                val intent = Intent(this, Pagina2::class.java)
                intent.putExtra("user", User("Emerson Barros", 50))
                startActivity(intent)
            }
        }
        //
        binding.btPag3.setOnClickListener {
            startActivity(Intent(this, Pagina3::class.java))
        }
    }
}
//
