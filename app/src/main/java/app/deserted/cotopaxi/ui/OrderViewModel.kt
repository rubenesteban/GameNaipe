package app.deserted.cotopaxi.ui

import android.util.DebugUtils
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import app.deserted.cotopaxi.data.OrderUiState
import app.deserted.cotopaxi.ui.OrderViewModel.garci.oclose
import app.deserted.cotopaxi.ui.OrderViewModel.julian.libre
import com.example.cupcake.R
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import kotlin.properties.Delegates

/** Price for a single cupcake */
private const val PRICE_PER_CUPCAKE = 2.00

/** Additional cost for same day pickup of an order */
private const val PRICE_FOR_SAME_DAY_PICKUP = 3.00

/**
 * [OrderViewModel] holds information about a cupcake order in terms of quantity, flavor, and
 * pickup date. It also knows how to calculate the total price based on these order details.
 */
class OrderViewModel : ViewModel() {

    /**
     * Cupcake state for this order
     */
    private val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()


    //--------------------------
    private val _tasks = libre.toMutableStateList()
    val tasks: List<Affirmation>
        get() = _tasks
    //_________________________________________________
    private var Work: MutableSet<String> = mutableSetOf<String>("")

    var pet = 0
    //_-----------------------------------------------
    private val _wrap = oclose.toMutableStateList()
    val wrap: List<Ask>
        get() = _wrap
    //_________________________________________________
    private var traelc: MutableSet<String> = mutableSetOf<String>("")

    //------------------------------------------------
    /**
     * Set the quantity [numberCupcakes] of cupcakes for this order's state and update the price
     */
    fun setQuantity(numberCupcakes: Int) {
        _uiState.update { currentState ->
            currentState.copy(
                quantity = numberCupcakes,
                price = calculatePrice(quantity = numberCupcakes)
            )
        }
    }


    object julian {
        var libre = loadAffirmations().shuffled()

    }
    /**
     * Set the [desiredFlavor] of cupcakes for this order's state.
     * Only 1 flavor can be selected for the whole order.
     */
    object garci {
        var oclose = loadAsk().shuffled()

    }


    fun setFlavor(desiredFlavor: String) {
        _uiState.update { currentState ->
            currentState.copy(flavor = desiredFlavor)
        }
    }

    /**
     * Set the [pickupDate] for this order's state and update the price
     */
    fun setDate(pickupDate: String) {
        _uiState.update { currentState ->
            currentState.copy(
                date = pickupDate,
                price = calculatePrice(pickupDate = pickupDate)
            )
        }
    }



    /**
     * Reset the order state
     */
    fun resetOrder() {
        _uiState.value = OrderUiState(pickupOptions = pickupOptions())
    }

    /**
     * Returns the calculated price based on the order details.
     */
    private fun calculatePrice(
        quantity: Int = _uiState.value.quantity,
        pickupDate: String = _uiState.value.date
    ): String {
        var calculatedPrice = quantity * PRICE_PER_CUPCAKE
        // If the user selected the first option (today) for pickup, add the surcharge
        if (pickupOptions()[0] == pickupDate) {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        val formattedPrice = NumberFormat.getCurrencyInstance().format(calculatedPrice)
        return formattedPrice
    }
    private val TAG: String = "UserPref"


    fun remove(item: Affirmation){
        var i: Int = 0
        val (u,t) = _uiState.value
        if (i <= u){
            _tasks.remove(item)
            i+=1
        }

    }

    /**
     * Returns a list of date options starting with the current date and the following 3 dates.
     */


    fun gilf(item: Affirmation): MutableSet<String> {
        val fu = item.key
        Log.d(TAG, " it - $fu" )
        Work.add(fu)
        Log.d(TAG, " it - tuuuu" )

        return Work
    }
    lateinit var utils: MutableSet<String>
    fun lista():MutableSet<String> {
        utils = Work
        Log.d(TAG, " it - $utils" )
        return utils
    }

    ////---Wrap--------

    fun remove(item: Ask) {
        var i: Int = 0
        var (u,t) = _uiState.value
        if (i <= u){
            _wrap.remove(item)
            i += 1
        }else{
            Log.d(TAG, " it - $i" )
        }



    }

    /**
     * Returns a list of date options starting with the current date and the following 3 dates.
     */
    lateinit var utilss: MutableSet<String>
    fun gulf(item: Ask): MutableSet<String> {
        val fu = item.key
        Log.d(TAG, " it - $fu" )
        traelc.add(fu)
        Log.d(TAG, " it - tuoooo" )

        return traelc
    }

    private fun pickupOptions
                (): List<String> {
        val dateOptions = mutableListOf<String>()
        val formatter = SimpleDateFormat("E MMM d", Locale.getDefault())
        val calendar = Calendar.getInstance()
        // add current date and the following 3 dates.
        repeat(4) {
            dateOptions.add(formatter.format(calendar.time))
            calendar.add(Calendar.DATE, 1)
        }
        return dateOptions
    }


}



data class Affirmation(val key : String, val drawable: Int)
private fun loadAffirmations(): List<Affirmation> {
    return listOf<Affirmation>(
        Affirmation("1",R.drawable.cupcake),
        Affirmation("12",R.drawable.cupcake),
        Affirmation("13",R.drawable.cupcake),
        Affirmation("14",R.drawable.cupcake),
        Affirmation("15",R.drawable.cupcake),
        Affirmation("16",R.drawable.cupcake),
        Affirmation("11",R.drawable.cupcake),
        Affirmation("122",R.drawable.cupcake),
        Affirmation("123",R.drawable.cupcake),
        Affirmation("142",R.drawable.cupcake),
        Affirmation("152",R.drawable.cupcake),
        Affirmation("162",R.drawable.cupcake),
        Affirmation("1222",R.drawable.cupcake),
        Affirmation("132",R.drawable.cupcake),
        Affirmation("133",R.drawable.cupcake),
        Affirmation("143",R.drawable.cupcake),
        Affirmation("153",R.drawable.cupcake),
        Affirmation("163",R.drawable.cupcake),
        Affirmation("173",R.drawable.cupcake)
       )
}

data class Ask(val key : String, val drawable: Int)
private fun loadAsk(): List<Ask> {
    return listOf<Ask>(
        Ask("1a",R.drawable.cupcake),
        Ask("1s2",R.drawable.cupcake),
        Ask("1d3",R.drawable.cupcake),
        Ask("14f",R.drawable.cupcake),
        Ask("15f",R.drawable.cupcake),
        Ask("16f",R.drawable.cupcake),
        Ask("12a",R.drawable.cupcake),
        Ask("1s2",R.drawable.cupcake),
        Ask("15d3",R.drawable.cupcake),
        Ask("145f",R.drawable.cupcake),
        Ask("155f",R.drawable.cupcake),
        Ask("156f",R.drawable.cupcake),
        Ask("1a9",R.drawable.cupcake),
        Ask("1s29",R.drawable.cupcake),
        Ask("1d39",R.drawable.cupcake),
        Ask("14f9",R.drawable.cupcake),
        Ask("15f9",R.drawable.cupcake),
        Ask("16f9",R.drawable.cupcake),
        Ask("1f79",R.drawable.cupcake)
    )
}
