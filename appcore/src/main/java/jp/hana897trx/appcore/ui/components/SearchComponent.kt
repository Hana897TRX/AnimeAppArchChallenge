package jp.hana897trx.appcore.ui.components

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import jp.hana897trx.appcore.R
import jp.hana897trx.appcore.ui.theme.Values

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchComponent(
    value: String,
    setValue: (String) -> Unit,
    placeHolder: String,
) {
    OutlinedTextField(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(Values.ROUNDED_CORNERS),
        value = value,
        onValueChange = setValue,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = String(),
                tint = Colors.TextField.iconColor,
            )
        },
        placeholder = {
            Text(
                text = placeHolder,
                color = Colors.TextField.hintColor
            )
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            cursorColor = Colors.TextField.cursorColor,
            unfocusedBorderColor = Colors.TextField.strokeColor,
            focusedBorderColor = Colors.TextField.strokeColor,
            containerColor = Colors.TextField.backgroundColor,
            textColor = Colors.TextField.textColor
        ),
    )
}

@Composable
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
fun SearchComponentPreview() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Black)
        ) {
            val (value, setValue) = remember {
                mutableStateOf(String())
            }
            SearchComponent(
                value = value,
                setValue = setValue,
                placeHolder = "Search something"
            )
        }
    }
}
