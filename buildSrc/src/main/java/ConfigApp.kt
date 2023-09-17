import org.gradle.api.JavaVersion

object ConfigApp {
    const val COMPILE_SDK = 34
    const val MIN_SDK = 24
    const val JVM_TARGET = "17"
    const val TARGET_SDK = 34
    val SOURCE_COMPAT = JavaVersion.VERSION_17
    val TARGET_COMPAT = JavaVersion.VERSION_17

    const val APP_ID = "jp.hana897trx.animeapp"
    const val APP_VERSION_CODE = 1
    const val APP_VERSION = "1.0.0"

    object Namespace {
        const val NAMESPACE_COMMON = "jp.hana897trx.common"
        const val NAMESPACE_DOMAIN = "jp.hana897trx.domain"
        const val NAMESPACE_DATA = "jp.hana897trx.data"
        const val NAMESPACE_APP = "jp.hana897trx.animeapp"
    }
}