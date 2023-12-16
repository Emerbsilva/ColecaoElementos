package com.ebsindustrial.colecaodeelementos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ebsindustrial.colecaodeelementos.databinding.ActivityPagina2Binding
import com.ebsindustrial.colecaodeelementos.databinding.ActivityPagina3Binding

class Pagina3 : AppCompatActivity() {

    private lateinit var binding: ActivityPagina3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagina3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}