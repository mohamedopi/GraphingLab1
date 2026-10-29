package com.graphinglab.app

import android.app.Activity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import android.graphics.Color

class MainActivity : Activity() {
    @Suppress("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = Color.rgb(23, 61, 154)
        window.navigationBarColor = Color.rgb(19, 35, 61)
        val view = WebView(this)
        view.setBackgroundColor(Color.rgb(245, 248, 252))
        view.settings.javaScriptEnabled = true
        view.webChromeClient = WebChromeClient()
        view.webViewClient = WebViewClient()
        setContentView(view)
        view.loadUrl("file:///android_asset/index.html")
    }
}
