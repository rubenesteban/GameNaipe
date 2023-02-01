package app.deserted.OurWord.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import app.deserted.OurWord.data.OrderUiState
import kotlinx.coroutines.delay


@ExperimentalFoundationApi
@Composable
fun GameAsk(
    modifier: Modifier = Modifier,
    orderUiState: OrderUiState,
    viewModel: OrderViewModel = viewModel(),
    onNextButtonClicked: () -> Unit = {},
    initialValue: Float = 1f,
    totalTime: Long,


    ) {

    val context = LocalContext.current
    // scope
    val scope = rememberCoroutineScope()
    // datastore Email
    val dataStore = StoreUserEmail(context)
    // get saved email
    val savedEmail = dataStore.getEmail.collectAsState(initial = "")

    var email by remember { mutableStateOf("") }

    var value by remember {
        mutableStateOf(initialValue)
    }
    var currentTime by remember {
        mutableStateOf(totalTime)
    }
    var isTimerRunning by remember {
        mutableStateOf(true)
    }
    LaunchedEffect(key1 = currentTime, key2 = isTimerRunning) {
        if(currentTime > 0 && isTimerRunning) {
            delay(100L)
            currentTime -= 100L
            value = currentTime / totalTime.toFloat()
        }
    }

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
            Box(
                modifier = Modifier
                    .width(151.dp)
                    .height(70.dp)
                    .padding(start = 8.dp),
            ){
                Text(
                    text = (currentTime / 1000L).toString(),
                    fontSize = 44.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
            }

        }
        TabRowDefaults.Divider(thickness = 1.dp, modifier = modifier.padding(bottom = 8.dp))
        Row(modifier = modifier
            .padding(16.dp),
        ){

            WellnesWrapList(
                list = viewModel.wrap,
                onCloseTask = { wrap -> viewModel.remove(wrap,orderUiState.quantity)},
                onAddTask = { wrap -> viewModel.PalabrasAsk(wrap.key) },
                onAlfinTask = {  viewModel.dulf(orderUiState.alfin)})
            WellnesWrapList(
                list = viewModel.modmar(),
                onCloseTask = { wrap -> viewModel.remove(wrap,orderUiState.quantity)},
                onAddTask = {wrap -> viewModel.PalabrasAsk(wrap.key) },
                onAlfinTask = {  viewModel.dulf(orderUiState.alfin)})

        }


    }
}

