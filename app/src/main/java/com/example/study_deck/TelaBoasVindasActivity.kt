package com.example.study_deck

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class TelaBoasVindasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_boas_vindas)

        val botaoProximo = findViewById<ImageButton>(R.id.arrow_button)
        botaoProximo.setOnClickListener {
            val intent = Intent(this, TelaEscolhaLoginCadastroActivity::class.java)
            startActivity(intent)
        }
    }
}
