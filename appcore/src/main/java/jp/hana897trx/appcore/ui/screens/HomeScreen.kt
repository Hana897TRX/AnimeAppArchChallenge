package jp.hana897trx.appcore.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.hana897trx.appcore.R
import jp.hana897trx.appcore.ui.components.CategoryComponent

@Composable
fun HomeScreen() {
    HomeScreenContent()
}

@Composable
private fun HomeScreenContent() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            CategoriesContent()
        }
    }
}

@Composable
private fun CategoriesContent() {
    Column {
        Text(
            text = "Categories",
            color = Color.White
        )
        LazyRow {
            items(10) {
                CategoryComponent(iconResource = R.drawable.ic_ticketstar, text = "Movie", onClick = {})
            }
        }
    }
}

@Preview
@Composable
fun HomeScreenContentPreview() {
    HomeScreenContent()
}

