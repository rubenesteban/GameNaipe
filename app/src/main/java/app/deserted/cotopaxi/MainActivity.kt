package app.deserted.cotopaxi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import app.deserted.cotopaxi.CupcakeApp
import app.deserted.cotopaxi.ui.theme.CupcakeTheme

/**
 * Activity for cupcake order flow.
 */
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
