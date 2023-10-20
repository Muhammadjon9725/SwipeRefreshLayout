package com.example.swiperefreshlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.example.swiperefreshlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.swipwRefresh.setOnRefreshListener {
            Toast.makeText(this, "Refresh listener", Toast.LENGTH_SHORT).show()
            binding.tv.text = "Salom"
            binding.swipwRefresh.isRefreshing = false
        }
    }

}