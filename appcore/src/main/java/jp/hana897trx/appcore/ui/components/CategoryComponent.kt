package jp.hana897trx.appcore.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.hana897trx.appcore.R
import jp.hana897trx.appcore.ui.theme.Blur
import jp.hana897trx.appcore.ui.theme.values.Colors
import jp.hana897trx.appcore.ui.theme.values.Values

private val categorySize = 128.dp

@Composable
fun CategoryComponent(
    iconResource: Int,
    text: String,
    onClick: () -> Unit,
) {
    Column(
        modifier = Modifier
            .size(categorySize)
            .clickable { onClick() }
            .clip(RoundedCornerShape(Values.ROUNDED_CORNERS))
            .border(
                width = 1.dp, color = Colors.Box.borderColor,
                shape = RoundedCornerShape(
                    Values.ROUNDED_CORNERS,
                ),
            )
            .background(color = Blur),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Icon(
            modifier = Modifier.size(64.dp),
            painter = painterResource(id = iconResource),
            contentDescription = String(),
            tint = Colors.Box.iconColor,
        )
        Text(
            text = text,
            fontFamily = MaterialTheme.typography.bodyMedium.fontFamily,
            color = Colors.Box.textColor,
        )
    }
}

@Composable
@Preview
fun CategoryComponentPreview() {
    BlackPreview {
        CategoryComponent(
            iconResource = R.drawable.ic_ticketstar,
            text = "Movie",
            onClick = {}
        )
    }
}