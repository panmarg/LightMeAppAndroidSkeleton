package com.example.lightmeappandroid.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.example.lightmeappandroid.ui.theme.panelGrey

@Composable
fun Panel(isRight: Boolean, modifier: Modifier, content: @Composable () -> Unit) {

    val paddingValues = if (isRight) {
        PaddingValues(start = 60.dp, end = 24.dp, top = 12.dp, bottom = 12.dp)
    } else {
        PaddingValues(start = 24.dp, end = 60.dp, top = 12.dp, bottom = 12.dp)
    }
    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        contentAlignment = if (isRight) Alignment.TopEnd else Alignment.TopStart
    ) {
        Box(
            modifier = Modifier
                .wrapContentHeight()
                .clip(
                    if (isRight) {
                        RoundedCornerShape(topStart = 70.dp, bottomStart = 70.dp)
                    } else {
                        RoundedCornerShape(topEnd = 70.dp, bottomEnd = 70.dp)
                    }
                )
                .background(panelGrey)
                .padding(paddingValues)
        ) {
            content()
        }
    }
}