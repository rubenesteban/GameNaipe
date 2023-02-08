package app.deserted.OurWord

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.deserted.OurWord.CupcakeApp
import app.deserted.OurWord.ui.theme.CupcakeTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * Activity for cupcake order flow.
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CupcakeTheme {
                CupcakeApp()
            }
        }
    }
}
