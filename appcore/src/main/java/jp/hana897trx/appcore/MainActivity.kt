package jp.hana897trx.appcore

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.rememberNavController
import jp.hana897trx.appcore.ui.navigation.utils.navigation
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