package com.peacecodes.canvas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val canvaView = CanvaView(this)
        canvaView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        canvaView.contentDescription = getString(R.string.content_description)
        setContentView(canvaView)
    }
}