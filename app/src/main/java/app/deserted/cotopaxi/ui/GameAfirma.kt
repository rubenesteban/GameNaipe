package app.deserted.cotopaxi.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@ExperimentalFoundationApi
@Composable
fun WellnesTaskList(
    list: List<Affirmation>,
    onCloseTask: (Affirmation) -> Unit,
    onAlfinTask: (Affirmation) -> Unit,
    onAddTask: (Affirmation) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyRow(modifier = Modifier) {
        items(items = list, key = { tasks -> tasks.key })
        { tasks ->
            WellnessQouItem(tasks.drawable, tasks.key,
                onClose = { onCloseTask(tasks) },
                onAlfin = { onAlfinTask(tasks) },
                onAdd = { onAddTask(tasks)})
        }
    }
}



@Composable
fun WellnessQouItem(
    drawable:Int,
    taskName :String,
    onClose: () -> Unit,
    onAdd: () -> Unit,
    onAlfin: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .width(333.dp)
            .height(509.dp)
            .padding(8.dp)
            .clickable {
                onClose()
                onAlfin()
                onAdd()


            },
        elevation = 10.dp)
        {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

                Image(painter = painterResource(drawable),
                    contentDescription = null,
                    modifier = Modifier
                        .size(299.dp)
                        .padding(16.dp)
                        .clip(CircleShape)
                )

            Text(text = taskName, fontSize = 18.sp)

        }
    }
}