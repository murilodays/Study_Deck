package com.example.study_deck

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Redireciona imediatamente para a tela 1 (Boas-vindas)
        val intent = Intent(this, TelaBoasVindasActivity::class.java)
        startActivity(intent)
        finish()
    }
}
