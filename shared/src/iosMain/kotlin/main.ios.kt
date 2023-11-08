import androidx.compose.runtime.ExperimentalComposeApi
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

actual fun getPlatformName(): String = "iOS"

@OptIn(ExperimentalComposeApi::class)
fun MainViewController(): UIViewController {
    androidx.compose.ui.window.forceMainThreadRendering = true
    return ComposeUIViewController { App() }
}