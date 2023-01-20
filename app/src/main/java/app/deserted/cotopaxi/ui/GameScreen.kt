package app.deserted.cotopaxi.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
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

    //val gameUiState by viewModel.punto.collectAsState()
    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore Email
    // val dataStore = StoreUserEmail(context)
    // get saved email
    // val savedEmail = dataStore.getEmail.collectAsState(initial = "")

    // var email = gameUiState.usedCards

    //var UserGuess = gameUiState.currentCards

    Column( modifier = modifier
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(
            modifier = modifier
                .width(151.dp)
                .height(70.dp)
                .padding(start = 8.dp),
            onClick = onNextButtonClicked
        ) {
            Text(text = "Hulk", fontSize = 18.sp)
        }
        Row(modifier = modifier
            .padding(16.dp),
        ){

            // MasTaskList(list = email)
            //MasTaskList(list = UserGuess)


            WellnesTaskList(list = viewModel.tasks,
                onCloseTask = {tasks -> viewModel.remove(tasks)},
                onAddTask = {tasks -> viewModel.gilf(tasks)})

        }

    }
}

