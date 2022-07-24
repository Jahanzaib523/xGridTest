package com.app.test_xgrid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.test_xgrid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val bindActivity : ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(bindActivity.root)
    }
}