package com.mohammed.alameen.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_article_viewer.*

class ArticleViewer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_article_viewer)

        val url = intent.getStringExtra("URL")

        webView.loadUrl(url)
    }
}
