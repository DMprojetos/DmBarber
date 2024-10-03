package com.example.barber

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity
import com.example.barber.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)

        // Habilitar JavaScript (se necessário)
        webView.settings.javaScriptEnabled = true

        // Para carregar o conteúdo dentro do WebView sem abrir o navegador externo
        webView.webViewClient = WebViewClient()

        // Carregar uma URL
        webView.loadUrl("https://barber.dmprojetos.com/agendamento.html") // Coloque a URL do site HTML aqui
    }
}
