import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import repository.LocalAppActionStore
import ui.common.LocalAlertDialogController
import ui.common.LocalProgressController
import ui.common.LocalToastController
import ui.model.Screen
import ui.screen.MainScreen
import ui.string.*
import ui.style.AppTheme

@Composable
fun App() {
    val toastController = LocalToastController.current
    val alertDialogController = LocalAlertDialogController.current
    val progressController = LocalProgressController.current
    AppTheme(isSystemInDarkTheme()) {
        Navigator(MainScreen) { navigator ->
            MainScaffold(navigator)
        }
        alertDialogController.Compose()
        toastController.Compose()
        progressController.Compose()
    }
}

@Composable
private fun MainScaffold(navigator: Navigator) {
    val appActionStore = LocalAppActionStore.current
    LaunchedEffect(navigator.lastItem) {
        appActionStore.onScreenChange(navigator.lastItem as Screen)
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    val currentTitle = (navigator.lastItem as Screen).getTitle()
                    Text(text = currentTitle)
                },
                navigationIcon = if (navigator.size > 1) {
                    @Composable {
                        IconButton(onClick = { navigator.pop() }) {
                            Icon(
                                imageVector = Icons.Default.ArrowBack,
                                contentDescription = string(Strings.CommonBack),
                            )
                        }
                    }
                } else {
                    null
                },
                actions = {
                    (navigator.lastItem as Screen).Actions()
                },
            )
        },
        content = {
            SlideTransition(navigator) { screen ->
                Surface { screen.Content() }
            }
        },
    )
}
