package com.example.lightmeappandroid.presentation

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.lightmeappandroid.R
import com.example.lightmeappandroid.ui.theme.black
import kotlin.math.sin

@Composable
fun Header(content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            val path = Path()
            path.moveTo(0f, 0f)
            path.lineTo(size.width, 0f)
            path.lineTo(size.width, size.height * 0.7f)
            for (i in size.width.toInt() downTo 0 step 16) {
                val x = i.toFloat()
                val y = (size.height * 0.7f) + (40 * sin(x / 200))
                path.lineTo(x, y)
            }
            path.lineTo(0f, size.height * 0.7f)
            path.close()
            drawPath(
                path = path,
                color = black,
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth(),
        ) {
            Image(
                painter = painterResource(id = R.drawable.icon_deloitte_logo),
                contentDescription = "Deloitte",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .padding(top = 24.dp, start = 16.dp)
                    .width(70.dp)
            )
            Spacer(modifier = Modifier.weight(0.4f))
            content()
            Spacer(modifier = Modifier.weight(0.6f))
            Image(
                painter = painterResource(id = R.drawable.icon_mobilers_logo),
                contentDescription = "Logo",
                contentScale = ContentScale.FillHeight,
                modifier = Modifier
                    .padding(top = 12.dp)
                    .height(70.dp)
            )
        }

    }
}
