package com.ebsindustrial.colecaodeelementos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ebsindustrial.colecaodeelementos.databinding.ActivityPagina2Binding

class Pagina2 : AppCompatActivity() {

    private lateinit var binding: ActivityPagina2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagina2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        recuperaGetExtra()

    }
    //
    fun recuperaGetExtra(){
        val user = intent.getSerializableExtra("user") as User

        Log.i("INFOTESTE", "recuperaGetExtra: ${user.name}")
        Log.i("INFOTESTE", "recuperaGetExtra: ${user.age}")
    }
}