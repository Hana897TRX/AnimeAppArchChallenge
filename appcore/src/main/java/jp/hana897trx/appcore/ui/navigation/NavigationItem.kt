package jp.hana897trx.appcore.ui.navigation

import android.os.Bundle

interface NavigationItem {
    val path: String
    val args: Bundle?
}