package com.example.template

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    lateinit var score: TextView
    lateinit var scoreText: TextView
    lateinit var intentButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        score = findViewById(R.id.result_score)
        scoreText = findViewById(R.id.result_motivation)
        intentButton = findViewById(R.id.again)

        val intent: Intent = getIntent()
        val result: Int = intent.getIntExtra("RESULT", 0)
        // нужно вставить свою логику для показа результата

        intentButton.setOnClickListener{ view ->
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}