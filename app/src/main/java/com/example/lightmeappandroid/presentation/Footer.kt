package com.example.lightmeappandroid.presentation


import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.unit.dp
import com.example.lightmeappandroid.ui.theme.black
import kotlin.math.sin

@Composable
fun Footer(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val path = Path()
            path.moveTo(0f, size.height)
            path.lineTo(size.width, size.height)
            path.lineTo(size.width, size.height * 0.3f)
            for (i in size.width.toInt() downTo 0 step 16) {
                val x = i.toFloat()
                val y = (size.height * 0.3f) + (40 * sin(x / 200))
                path.lineTo(x, y)
            }
            path.lineTo(0f, size.height * 0.3f)
            path.close()
            drawPath(
                path = path,
                color = black,
            )
        }
        content()
    }
}
