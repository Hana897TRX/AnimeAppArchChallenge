package jp.hana897trx.appcore.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jp.hana897trx.appcore.R

@Composable()
fun FeaturedContentCard(){
    Card(modifier = Modifier
        .fillMaxWidth()
        .aspectRatio(1.8F),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = Color.White)
    ){
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = R.drawable.kiminonawa),
                contentDescription = "Kimi no nawa",
                contentScale = ContentScale.Crop
            )
            Text(
                modifier = Modifier
                    .padding(12.dp)
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color.Black.copy(0.6F))
                    .padding(8.dp, 6.dp),
                text = "Kimi No Na wa: Your Name",
                color = Color.White
            )
            Text(
                modifier = Modifier
                    .padding(12.dp)
                    .align(Alignment.TopEnd)
                    .defaultMinSize(minWidth = 80.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(Color.Black.copy(0.6F))
                    .padding(6.dp, 4.dp),
                text = "Movie",
                color = Color.White,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
@Preview(showBackground = true, backgroundColor = 0xffcc99ff)
fun FeaturedContentCardPreview(){

    Box( modifier = Modifier.padding(16.dp)
    ){
        FeaturedContentCard()
    }
}