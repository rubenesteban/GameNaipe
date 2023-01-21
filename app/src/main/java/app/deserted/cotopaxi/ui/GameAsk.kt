package app.deserted.cotopaxi.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalFoundationApi
@Composable
fun GameAsk(
    modifier: Modifier = Modifier,
    viewModel: OrderViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    onNextButtonClicked:() -> Unit ={}
) {

    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore Email
    val dataStore = StoreUserEmail(context)
    // get saved email
    val savedEmail = dataStore.getEmail.collectAsState(initial = "")

    var email by remember { mutableStateOf("") }

    Column( modifier = modifier
        .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)) {

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
        TabRowDefaults.Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(modifier = modifier
            .padding(16.dp),
        ){


            WellnesWrapList(
                list = viewModel.wrap,
                onCloseTask = { wrap -> viewModel.remove(wrap)},
                onAddTask = { wrap -> viewModel.gulf(wrap)})
            WellnesWrapList(
                list = viewModel.wrap.shuffled(),
                onCloseTask = { wrap -> viewModel.remove(wrap)},
                onAddTask = { wrap -> viewModel.gulf(wrap)})

        }

    }
}

