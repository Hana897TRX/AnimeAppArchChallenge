package jp.hana897trx.appcore.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun BlackPreview(
    content: @Composable () -> Unit,
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Black)
    ) {
        content()
    }
}