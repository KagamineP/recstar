import android.content.res.Configuration
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.platform.LocalConfiguration
import ui.model.AndroidContext
import ui.model.LocalScreenOrientation
import ui.model.ScreenOrientation

@Composable
fun MainView(context: AndroidContext) {
    val orientation = when (LocalConfiguration.current.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> ScreenOrientation.Landscape
        Configuration.ORIENTATION_PORTRAIT -> ScreenOrientation.Portrait
        else -> ScreenOrientation.Undefined
    }
    CompositionLocalProvider(LocalScreenOrientation provides orientation) {
        App(context)
    }
}
