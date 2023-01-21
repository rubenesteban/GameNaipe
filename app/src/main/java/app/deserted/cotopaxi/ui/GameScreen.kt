package app.deserted.cotopaxi.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TabRowDefaults.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.launch

/**
 * Composable that displays the list of items as [RadioButton] options,
 * [onSelectionChanged] lambda that notifies the parent composable when a new value is selected,
 * [onCancelButtonClicked] lambda that cancels the order when user clicks cancel and
 * [onNextButtonClicked] lambda that triggers the navigation to next screen
 */

@ExperimentalFoundationApi
@Composable
fun GameScreen(
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    onNextButtonClicked:() -> Unit ={}
) {
    // context
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore Email
    val dataStore = StoreUserEmail(context)
    // get saved email
    val savedEmail = dataStore.getEmail.collectAsState(initial = "")

    var email by remember { mutableStateOf("") }

    //var UserGuess = gameUiState.currentCards

    Column(
        modifier = modifier
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        Row(modifier = Modifier) {
            Button(
                modifier = modifier
                    .width(151.dp)
                    .height(70.dp)
                    .padding(start = 8.dp),
                onClick = onNextButtonClicked

            ) {
                Text(text = "Hulk", fontSize = 18.sp)
            }
            OutlinedTextField(
                modifier = Modifier
                    .width(151.dp)
                    .height(70.dp)
                    .padding(start = 8.dp),
                value = email,
                onValueChange = { email = it },
            )

        }
        Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(
            modifier = modifier
                .padding(16.dp),
        ) {
            WellnesTaskList(list = viewModel.tasks,
                onCloseTask = { tasks -> viewModel.remove(tasks) },
                onAddTask = { tasks -> viewModel.gilf(tasks) })
        }

    }
}


