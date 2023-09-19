package jp.hana897trx.appcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import jp.hana897trx.appcore.ui.navigation.navigation
import jp.hana897trx.appcore.ui.theme.AnimeAppChallengeTheme
import jp.hana897trx.appcore.ui.theme.HarmonyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HarmonyTheme {
                Surface(contentColor = MaterialTheme.colorScheme.surface) {
                    val navController = rememberNavController()
                    navigation(navController = navController)
                }
            }
        }
    }
}