package com.mohammed.alameen.webview

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val links: MutableList<String> = mutableListOf("https://www.google.com","https://www.yourdailygerman.com")

        readMore.setOnClickListener {
            val intent = Intent(this, ArticleViewer::class.java)
            intent.putExtra("URL", links[0])
            startActivity(intent)
        }
    }
}
