package com.example.task17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import com.example.task17.databinding.ActivityMainBinding
import com.example.task17.ui.CustomView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val centerX: Float = 393.75f
    private val centerY: Float = 393.75f

    private var cx: Float = centerX
    private var cy: Float = centerY

    private var sx: Float = centerX
    private var sy: Float = centerY

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.btnCircle.setOnClickListener {
            binding.customView.drawCircle(centerX, centerY)
        }

        binding.xCircle.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (cx >= centerX)
                    cx = centerX
                cx += p1
                binding.customView.drawCircle(cx, cy)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }
        })

        binding.yCircle.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (cy >= centerY)
                    cy = centerY
                cy += p1
                binding.customView.drawCircle(cx, cy)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }
        })

        binding.btnSquare.setOnClickListener {
            binding.customView.drawSquare(centerX, centerY)
        }

        binding.xSquare.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (sx >= centerX)
                    sx = centerX
                sx += p1
                binding.customView.drawSquare(sx, sy)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }
        })

        binding.ySquare.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                if (sy >= centerY)
                    sy = centerY
                sy += p1
                binding.customView.drawSquare(sx, sy)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
                if (p0 != null) {
                    println(p0.progress)
                }
            }
        })

        binding.btnClear.setOnClickListener {
            binding.customView.clear()
        }

        setContentView(binding.root)
    }
}