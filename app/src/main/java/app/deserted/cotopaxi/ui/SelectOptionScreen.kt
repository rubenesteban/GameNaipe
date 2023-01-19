package app.deserted.cotopaxi.ui

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cupcake.R
import app.deserted.cotopaxi.ui.components.FormattedPriceLabel

/**
 * Composable that displays the list of items as [RadioButton] options,
 * [onSelectionChanged] lambda that notifies the parent composable when a new value is selected,
 * [onCancelButtonClicked] lambda that cancels the order when user clicks cancel and
 * [onNextButtonClicked] lambda that triggers the navigation to next screen
 */
@Composable
fun SelectOptionScreen(
    subtotal: String,
    options: List<String>,
    onSelectionChanged: (String) -> Unit = {},
    onCancelButtonClicked: () -> Unit = {},
    onNextButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
){
    var selectedValue by rememberSaveable { mutableStateOf("") }

    Column (modifier = modifier.padding(16.dp)){
        options.forEach { item ->
            Row (
                modifier = Modifier.selectable(
                    selected = selectedValue == item,
                    onClick = {
                        selectedValue = item
                        onSelectionChanged(item)
                    }
                ),
                verticalAlignment = Alignment.CenterVertically
            ){

                AlignYourBodyRow()
            }
        }


    }
}


@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
    ) {
        items(alignYourBodyData) { item ->
            AlignYourBodyElement(item.drawable, item.text)
        }
    }
}

@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
    ) {
        Card(
            modifier = Modifier
                .width(351.dp)
                .height(390.dp)
                .padding(8.dp)
                .clickable {

                },
            elevation = 10.dp
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(drawable),
                    contentDescription =null,
                    modifier = Modifier
                        .size(333.dp)
                        .clip(CircleShape)
                )

            }
        }
    }
}



private  val alignYourBodyData = listOf(
    R.drawable.cupcake to R.string.lesve,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesveq,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesve,
    R.drawable.cupcake to R.string.lesveq,
    R.drawable.cupcake to R.string.lesve,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesveq,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesve,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesveq,
    R.drawable.cupcake to R.string.lesve1,
    R.drawable.cupcake to R.string.lesve,
    R.drawable.cupcake to R.string.lesve1,
).map { DrawableStringPair(it.first, it.second)}

private data class DrawableStringPair(
    @DrawableRes val drawable: Int,
    @StringRes val text: Int
)

