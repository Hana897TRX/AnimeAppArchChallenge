package jp.hana897trx.appcore.ui.navigation.utils

import android.os.Bundle
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.NavDestination
import androidx.navigation.NavOptions
import androidx.navigation.Navigator
import jp.hana897trx.appcore.ui.navigation.NavigationItem

private fun NavController.navigateIn(
    route: String,
    args: Bundle?,
    navOptions: NavOptions? = null,
    navigatorExtras: Navigator.Extras? = null,
) {
    val routeLink = NavDeepLinkRequest
        .Builder
        .fromUri(NavDestination.createRoute(route).toUri())
        .build()

    val deepLink = graph.matchDeepLink(routeLink)
    if (deepLink != null) {
        val destination = deepLink.destination
        val id = destination.id
        navigate(id, args, navOptions, navigatorExtras)
    } else {
        navigate(route, navOptions, navigatorExtras)
    }
}

fun NavController.navigateToScreen(deepLink: NavigationItem) {
    navigateIn(
        deepLink.path,
        deepLink.args,
    )
}

