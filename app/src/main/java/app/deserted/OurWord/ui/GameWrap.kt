package app.deserted.OurWord.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@ExperimentalFoundationApi
@Composable
fun WellnesWrapList(
    list: List<Ask>,
    onCloseTask:(Ask) -> Unit,
    onAddTask: (Ask) -> Unit,
    onAlfinTask: () -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = Modifier) {
        items(items = list, key = { wrap -> wrap.key })
        { wrap ->
            WellnessWrapItem(wrap.drawable,
                onClose = { onCloseTask(wrap) },
                onGuess = { onAlfinTask() },
                onAdd = { onAddTask(wrap)})
        }
    }
}

@Composable
fun WellnessWrapItem(
    drawable:Int,
    onClose: () -> Unit,
    onAdd: () -> Unit,
    onGuess: () -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = Modifier
            .width(151.dp)
            .height(234.dp)
            .padding(8.dp)
            .clickable {
                onClose()
                onAdd()
                onGuess()
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
                    .size(333.dp)
                    .clip(CircleShape)
            )
        }
    }
}