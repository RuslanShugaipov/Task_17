package com.example.task17.ui

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageView
import kotlin.random.Random

class CustomView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatImageView(context, attrs, defStyleAttr) {

    private var path = Path()
    private val paint = Paint().apply {
        style = Paint.Style.FILL
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawPath(path, paint)
    }

    fun drawCircle(x: Float, y: Float) {
        paint.color = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        clear()
        path.addCircle(x, y, 200f, Path.Direction.CW)
        path.close()
        postInvalidate()
    }

    fun drawSquare(x: Float, y: Float) {
        paint.color = Color.rgb(Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        clear()
        path.addRect(
            x - 100f, y - 100f,
            x + 100f, y + 100f, Path.Direction.CW
        )
        path.close()
        postInvalidate()
    }

    fun clear() {
        path.reset()
        postInvalidate()
    }
}