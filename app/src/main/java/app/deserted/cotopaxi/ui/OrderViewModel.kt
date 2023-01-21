package app.deserted.cotopaxi.ui

import android.util.DebugUtils
import android.util.Log
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
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

    private var k: Int = 0
    private var j: Int = 0

    //_-----------------------------------------------
    private val _wrap = oclose.toMutableStateList()
    val wrap: List<Ask>
        get() = _wrap
    //_________________________________________________
    private var traelc: MutableSet<String> = mutableSetOf<String>("")
    //var i : Int = 0
    private val TAG: String = "UserPref"
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
    fun unico(): Int{
       val i = 1
        k = i
        Log.d(TAG, " it - tuuuu" )
        return k
    }
    fun infimo(): Int{
        val i = 1
        j = i
        Log.d(TAG, " it - tuuuu" )
        return j
    }
    init {
        unico()
        infimo()
        our()
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

    fun our(){
        val(p)= _uiState.value
        Log.d(TAG, " it - $p" )
    }


    fun remove(item: Affirmation){
        val (u)= uiState.value
        Log.d(TAG, " it - $u" )
        if(k<= 19){
            _tasks.remove(item)
        }
        k+=1
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
        val (g)= _uiState.value
        Log.d(TAG, " it - $g" )
        if(j<= 16){
            _wrap.remove(item)
        }
        j+=1

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
    Affirmation("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
    Affirmation("appreciation", R.drawable.undraw_appreciation_yy29),
    Affirmation("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
    Affirmation("baby", R.drawable.undraw_baby_re_fr9r),
    Affirmation("barista", R.drawable.undraw_barista_re_fm8w),
    Affirmation("basketball", R.drawable.undraw_basketball_re_7701),
    Affirmation("beach_day", R.drawable.undraw_beach_day_cser),
    Affirmation("blooming", R.drawable.undraw_blooming_re_2kc4),
    Affirmation("buddies", R.drawable.undraw_buddies_2ae5),
    Affirmation("by_my_car", R.drawable.undraw_by_my_car_xhk6),
    Affirmation("cat", R.drawable.undraw_cat_s1wg),
    Affirmation("cooking_ceye", R.drawable.undraw_cooking_ceye),
    Affirmation("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
    Affirmation("doctors", R.drawable.undraw_doctors_p6aq),
    Affirmation("dog", R.drawable.undraw_dog_re_63j1),
    Affirmation("educator", R.drawable.undraw_educator_re_ju47),
    Affirmation("electricity", R.drawable.undraw_electricity_k2ft),
    Affirmation("elements", R.drawable.undraw_elements_re_25t9),
    Affirmation("engineering_team", R.drawable.undraw_engineering_team_a7n2),
    Affirmation("experience_design", R.drawable.undraw_experience_design_re_dmqq),
    Affirmation("family", R.drawable.undraw_family_vg76),
    Affirmation("female_avatar", R.drawable.undraw_female_avatar_efig),
    Affirmation("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
    Affirmation("flying_drone", R.drawable.undraw_flying_drone_u3r2),
    Affirmation("gifts", R.drawable.undraw_gifts_0ceh),
    Affirmation("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
    Affirmation("grand_slam", R.drawable.undraw_grand_slam_84ep),
    Affirmation("halloween", R.drawable.undraw_halloween_re_2kq1),
    Affirmation("happy_new_year", R.drawable.undraw_happy_new_year_di92),
    Affirmation("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
    Affirmation("home_run", R.drawable.undraw_home_run_oyhw),
    Affirmation("in_love", R.drawable.undraw_in_love_993n),
    Affirmation("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
    Affirmation("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
    Affirmation("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
    Affirmation("male_avatar", R.drawable.undraw_male_avatar_g98d),
    Affirmation("mindfulness", R.drawable.undraw_mindfulness_6xt3),
    Affirmation("passing", R.drawable.undraw_passing_by_0un9),
    Affirmation("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
    Affirmation("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
    Affirmation("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
    Affirmation("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
    Affirmation("reminder", R.drawable.undraw_reminder_re_fe15),
    Affirmation("running", R.drawable.undraw_running_wild_h6ao  ),
    Affirmation("scientist", R.drawable.undraw_scientist_klqc),
    Affirmation("snow_games", R.drawable.undraw_snow_games_tq9r),
    Affirmation("summer", R.drawable.undraw_summer_1wi4),
    Affirmation("team", R.drawable.undraw_team_up_re_84ok),
    Affirmation("traveling", R.drawable.undraw_traveling_qio0),
    Affirmation("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
    Affirmation("woman", R.drawable.undraw_woman_re_afr8)
    )
}

data class Ask(val key : String, val drawable: Int)
private fun loadAsk(): List<Ask> {
    return listOf<Ask>(
        Ask("appreciate", R.drawable.undraw_appreciate_it_re_yc8h),
        Ask("appreciation", R.drawable.undraw_appreciation_yy29),
        Ask("automobile_repair", R.drawable.undraw_automobile_repair_ywci),
        Ask("baby", R.drawable.undraw_baby_re_fr9r),
        Ask("barista", R.drawable.undraw_barista_re_fm8w),
        Ask("basketball", R.drawable.undraw_basketball_re_7701),
        Ask("beach_day", R.drawable.undraw_beach_day_cser),
        Ask("blooming", R.drawable.undraw_blooming_re_2kc4),
        Ask("buddies", R.drawable.undraw_buddies_2ae5),
        Ask("by_my_car", R.drawable.undraw_by_my_car_xhk6),
        Ask("cat", R.drawable.undraw_cat_s1wg),
        Ask("cooking_ceye", R.drawable.undraw_cooking_ceye),
        Ask("decorate_christmas_tree", R.drawable.undraw_decorate_christmas_tree_rmj0),
        Ask("doctors", R.drawable.undraw_doctors_p6aq),
        Ask("dog", R.drawable.undraw_dog_re_63j1),
        Ask("educator", R.drawable.undraw_educator_re_ju47),
        Ask("electricity", R.drawable.undraw_electricity_k2ft),
        Ask("elements", R.drawable.undraw_elements_re_25t9),
        Ask("engineering_team", R.drawable.undraw_engineering_team_a7n2),
        Ask("experience_design", R.drawable.undraw_experience_design_re_dmqq),
        Ask("family", R.drawable.undraw_family_vg76),
        Ask("female_avatar", R.drawable.undraw_female_avatar_efig),
        Ask("fingerprint_login", R.drawable.undraw_fingerprint_login_re_t71l),
        Ask("flying_drone", R.drawable.undraw_flying_drone_u3r2),
        Ask("gifts", R.drawable.undraw_gifts_0ceh),
        Ask("good_doggy", R.drawable.undraw_good_doggy_re_eet7),
        Ask("grand_slam", R.drawable.undraw_grand_slam_84ep),
        Ask("halloween", R.drawable.undraw_halloween_re_2kq1),
        Ask("happy_new_year", R.drawable.undraw_happy_new_year_di92),
        Ask("healthy_habit", R.drawable.undraw_healthy_habit_rdky),
        Ask("home_run", R.drawable.undraw_home_run_oyhw),
        Ask("in_love", R.drawable.undraw_in_love_993n),
        Ask("landscape_photographer", R.drawable.undraw_landscape_photographer_156c),
        Ask("love_is", R.drawable.undraw_love_is_in_the_air_4uud),
        Ask("make_it_rain", R.drawable.undraw_make_it_rain_re_w9pc),
        Ask("male_avatar", R.drawable.undraw_male_avatar_g98d),
        Ask("mindfulness", R.drawable.undraw_mindfulness_6xt3),
        Ask("passing", R.drawable.undraw_passing_by_0un9),
        Ask("pic_profile", R.drawable.undraw_pic_profile_re_7g2h),
        Ask("profile_pic", R.drawable.undraw_profile_pic_re_iwgo),
        Ask("pumpkin", R.drawable.undraw_pumpkin_re_bm46),
        Ask("ready_for_waves", R.drawable.undraw_ready_for_waves_vlke),
        Ask("reminder", R.drawable.undraw_reminder_re_fe15),
        Ask("running", R.drawable.undraw_running_wild_h6ao  ),
        Ask("scientist", R.drawable.undraw_scientist_klqc),
        Ask("snow_games", R.drawable.undraw_snow_games_tq9r),
        Ask("summer", R.drawable.undraw_summer_1wi4),
        Ask("team", R.drawable.undraw_team_up_re_84ok),
        Ask("traveling", R.drawable.undraw_traveling_qio0),
        Ask("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
        Ask("woman", R.drawable.undraw_woman_re_afr8)
    )
}
