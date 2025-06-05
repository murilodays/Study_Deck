package com.example.study_deck

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class TelaCadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_cadastro)

        val btnFinalizarCadastro = findViewById<Button>(R.id.btnFinalizarCadastro)
        btnFinalizarCadastro.setOnClickListener {
            val intent = Intent(this, TelaPrincipalActivity::class.java)
            startActivity(intent)
        }
    }
}
