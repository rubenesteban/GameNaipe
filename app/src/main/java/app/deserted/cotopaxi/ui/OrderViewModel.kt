package app.deserted.cotopaxi.ui

import android.util.Log
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import app.deserted.cotopaxi.data.OrderUiState
import app.deserted.cotopaxi.ui.OrderViewModel.garci.oclose
import app.deserted.cotopaxi.ui.OrderViewModel.julian.libre
import com.example.cupcake.R
import kotlinx.coroutines.async
import kotlinx.coroutines.flow.*
//import kotlinx.coroutines.flow.internal.NopCollector.emit
import kotlinx.coroutines.launch
//import kotlinx.coroutines.flow.internal.NopCollector.emit
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import kotlin.system.measureTimeMillis

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
    val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    //--------------------------
    private val _tasks = libre.toMutableStateList()
    val tasks: List<Affirmation>
        get() = _tasks

    //_________________________________________________
    private var Work: MutableSet<String> = mutableSetOf<String>("")
    private var Oficio: MutableSet<String> = mutableSetOf<String>("")
    private var Trabajo: MutableSet<String> = mutableSetOf<String>("")
    private var k: Int = 0
    private var j: Int = 0
    private val Guess: Any by lazy { util }
    private val kuess: Any by lazy { mil }
    private val Fuess: Any by lazy { sos }

    lateinit var pora: String
    lateinit var erGuss: String
    lateinit var oro: String

    private var userIndixe: MutableSet<String> = mutableSetOf()

    ///------------------------------
    private var userdPalabras: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var userPalabras by mutableStateOf("")
        private set

    private var Palabras: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var EnPalabras by mutableStateOf("")
        private set

    //---------------------------
    private var userdWords: MutableSet<String> = mutableSetOf()

    private var usePalabras: MutableSet<String> = mutableSetOf()
    private var verPalabras: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var userGues by mutableStateOf("")
        private set

    //lateinit var pura: List<String>
    var UserGuess: List<String> = listOf()
    var UserTutu: MutableSet<String> = mutableSetOf<String>("")
    var Usertutus: List<String> = listOf()
    var UserYuyu: MutableSet<String> = mutableSetOf<String>("")

    var UserJuess: MutableSet<String> = mutableSetOf<String>("")
        private set
    var itil: List<String> = listOf()
    var carro by mutableStateOf("")
        private set

    //_-----------------------------------------------
    private val _wrap = oclose.toMutableStateList()
    val wrap: List<Ask>
        get() = _wrap

    val parw: List<Ask> = listOf()

    //_________________________________________________
    private var traelc: MutableSet<String> = mutableSetOf<String>("")

    //var i : Int = 0
    private val TAG: String = "Reebook"
    //private val TAG: String = "Reeboojjjk"
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
        val k = 0

    }


    /**
     * Set the [desiredFlavor] of cupcakes for this order's state.
     * Only 1 flavor can be selected for the whole order.
     */
    object garci {
        var oclose = loadAsk().shuffled()
        val l = 0

    }

    fun hola(){
        pora = "hello"
        oro = "world"
        erGuss = "-:)"
    }



    fun modmar(): List<Ask> {
        val parw = wrap.reversed()
        return parw
    }


    fun setFlavor(desiredFlavor: String) {
        _uiState.update { currentState ->
            currentState.copy(flavor = desiredFlavor)
        }
    }

    fun setNaipe(item: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(alfin = item)
        }
        //Elefe(item)
    }

    fun obtenNaipe(item: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(torre = item)
        }
        Ramo(item)
    }

    fun GoCards(item: Affirmation, user: Int) {

    }

    fun setCards(item: Affirmation, user: Int): List<String> {
        if (k <= user) {
            Oficio.add(item.key)
            k += 1
        } else {
            val she = listade(Oficio)
            setNaipe(she)
            // val Guss = turke(she)
            // return Guss
        }
        return UserGuess
    }


    fun obtenCards(item: String, user: Int): List<String> {
        if (si <= user) {
            UserTutu.add(item)
            var tirma = Guess.toString()

            si += 1
        }

        return UserGuess
    }

    fun grillo(a: List<String>): MutableSet<String> {
        val el = a as MutableSet<String>
        return el
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

    fun Datey(UseGuess: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                alfin = UseGuess
            )
        }
        luuk(UseGuess)
    }

    fun Ditey(UseGuess: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                torre = UseGuess
            )
        }
        //kaak(UseGuess)
    }


    fun eureca(
        alfin: List<String> = _uiState.value.alfin,
        torre: List<String> = _uiState.value.torre,
    ): Double {
        val gol = alfin - torre
        val aro = gol.size.toDouble()
        return aro

    }

    var f = k
    var r = k
    var si = k
    var e = k
    var w = k
    var m = k
    var te = k

    init {
        reset()
        modmar()
        hola()
        f = 0
        r = 0
        si = 0
        e = 0
        w = 0
        m = 0
        te = 0
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
        var calculatedPrice = quantity * eureca(_uiState.value.alfin, _uiState.value.torre)
        // If the user selected the first option (today) for pickup, add the surcharge
        if (pickupOptions()[0] == pickupDate) {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        val formattedPrice = NumberFormat.getCurrencyInstance().format(calculatedPrice)
        return formattedPrice
    }


    fun remove(item: Affirmation, User: Int) {
        if (f <= User) {
            _tasks.remove(item)
            f += 1
            green(f)
        }
        //Emonti()
    }


    fun tera(a: MutableSet<String>, b: MutableSet<String>): Int {
        val car = listade(a)
        val bote = listade(b)
        val yate = car - bote
        val elfo = yate.size
        return elfo
    }

    fun reset() {
        Work.clear()
        Trabajo.clear()
        Oficio.clear()
        UserJuess.clear()
        UserTutu.clear()

    }


    fun remove(item: Ask, User: Int) {
        if (r <= User) {
            _wrap.remove(item)
            r += 1
        }
       // click5("rabit")
        checkPalabrasUsadas()
    }

    fun hulkk(s: Int) {
         Log.d(TAG, " Este es el numero de palabas----->>> es: $s!")
    }



    fun green(s: Int) {
        //  Log.d(TAG, " Este es shin en dook------>>> es: $s!")
    }


    fun griin(s: Int) {
        // Log.d(TAG, " griin en el valor de  resta----->>> es: $s!")
    }


    suspend fun foit(s: Int) {
        Log.d(TAG, " S. foit en numeros de desacietos ----->>> es: $s!")
    }


    suspend fun fuit(s: Int) {
        Log.d(TAG, " S. fuit en lo combin ----->>> es: $s!")
    }

    fun nuevo(): String {
        val tuday = "hola"
       // gray(tuday)
        return tuday
    }

    fun Hirmen(){

       // Log.d(TAG, " Gran en Gess ----->>> es: $Guess!")
       // Log.d(TAG, " Gran en kuess ----->>> es: $Kuess!")
       // Log.d(TAG, " Gran en Fuess ----->>> es: $Fuess!")
    }

    fun bueno(d:Int){
        Log.d(TAG, " Bueno en Palabras ----->>> es: $Palabras!")
        Log.d(TAG, " Bueno en userdWords ----->>> es: $userdWords!")
        Log.d(TAG, " Bueno en userIndixe ----->>> es: $userIndixe!")
        Log.d(TAG, " Bueno en userdPalabras ---->>> es: $userdPalabras!")
    }

    fun gray(s: String) {
        Log.d(TAG, " Este es shin en dook------>>> es: $s!")
        //var tinrin = MielUserGuess()
        Log.d(TAG, " it Emonti--------------------------Guess in Ocean: $Guess!")
        //val grin = checkUserGuess()
       // Log.d(TAG, " it Emonti--------------------------CheckUserGuess: $grin!")
        Log.d(TAG, " it Emonti--------------------------Kuess in Ocean: $kuess!")
        Log.d(TAG, " it Emonti--------------------------Fuess in Ocean: $Fuess!")

    }

    fun griy(s: String) {
        Log.d(TAG, " Este es Enpalabras----->>> es: $s!")
    }

    fun grey(s: Int) {
        Log.d(TAG, " Este es el tamani de palabras----->>> es: $s!")
    }

    fun click(s: String) {
        Log.d(TAG, " Click este es el valor pura en Affirmation->>> es: $s!")
    }

    fun click1(s: String) {
        checkUserGuess()
      //  Log.d(TAG, " Click este es el valor pura en Ask--->>> es: $s!")
    }


    fun click2(s: String) {
        Log.d(TAG, " Click este es el valor pura en fuera el scope--->>> es: $s!")
    }


    fun click3(l: Long) {
        Log.d(TAG, " Los tiempos son ----------------------->>> es: $l!")
    }

    fun click4(l: Int) {
        Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
    }


    fun click5(l: Int) {
        //checkScore()

        Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $l!")
    }

    fun porany(s: String) {
       // Log.d(TAG, "Porany es el valor de words----->>> es: $s!")
    }


    fun Ramo(ra: List<String>): List<String> {
        val lia = ra
       // Log.d(TAG, " it ----------------Este es ballena in Ocean: $lia!")
        return ra

    }

    fun PalabrasUsa(guessdWord:String, util:Int): MutableSet<String> {
        if(w<=util){
            userGues = guessdWord
            pora = guessdWord
            oro = guessdWord
            //click1(pora)
            //click1(oro)
          var hulk = Pick(userGues)
          w += 1
        }
        return userdWords
    }


     fun Pick(userGues: String): MutableSet<String> {
        userdWords.add(userGues)
        val ness = shapk(userdWords)
        val hull = ness.size
        grey(hull)
        Datey(ness)
        //val por = flowOf(userdWords)
        return userdWords
    }

    fun AskUsa(guessdWord: String, t:Int) {
        if (w <= t) {
            userPalabras = guessdWord
            var hulk = Pickat(userPalabras)
            te+=1
        }

            //var helk = Pick(userPalabras)
    }

    fun Pickat(userGues: String): MutableSet<String> {
        userdPalabras.add(userGues)
        val pi = userdPalabras
        val e = pi.size

        //griiny(e)
        return userdPalabras
    }

    fun PalabrasUsadas(userGues: String): Flow<String> {
        pora = userGues

        Palabras.add(pora)
        val uno = flow<String> {emit(pora)}
        return uno
    }



        fun checkUserGuess(){
        viewModelScope.launch {
           var der =  before(pora).collect{pora -> Palabras.add(pora)}
           // Log.d(TAG, "CheckUserGuess --------------------------Palabras: $Palabras!")
        }
    }



    suspend fun before(s:String): Flow<String> = flow {
        emit(pora)
    }

    fun PalabrasAsk(userGues: String): Flow<String> {
        oro = userGues

        userIndixe.add(oro)
        val other = flow<String> {emit(oro)  }

        return other
    }


    suspend fun fibonacci(s:String): Flow<String> = flow {
                emit(oro)
    }

    fun checkPalabras(){
        viewModelScope.launch {
            var der =  fibonacci(oro).collect{oro -> userIndixe.add(oro)}
          //  Log.d(TAG, "CheckPalabras --------------------------UserIndixe: $userIndixe!")

        }
    }

    fun checkPalabrasUsadas(){
        viewModelScope.launch {
            var i=0
            val tiempo = measureTimeMillis {
                val job1 = async { checkPalabras() }
                //Log.d(TAG, "CheckPalabras --------------------------UserIndixe: $job1!")
               // Log.d(TAG, "CheckPalabras --------------------------UserIndixe: $pora!")
                var  she = usePalabras.add(pora)
                Log.d(TAG, "CheckPalabrasUsadas --------------------------She: $she!")
                val job2 = async { checkUserGuess() }
               // Log.d(TAG, "CheckUserGuess --------------------------UserIndixe: $job2!")
                var  he = verPalabras.add(oro)
                //pora = erGuss
               // oro = erGuss
                Log.d(TAG, "CheckPalabrasUsadas -------------------------->>He: $he!")
                var ten = verPalabras.add(erGuss)


                val we = listade(usePalabras)
                val they = listade(verPalabras)
                val elefant = we - they
                //var Our = verPalabras.size
                val Our = elefant.size

                click5(Our)
                job1.join()
                job2.join()
               // checkScore()
                 Log.d(TAG, "it --------------------------UserIn------------->>: $Our!")
                var P = mar(Our)
                var Q = setFlavor(P)
                var Y = "tiempo"
                setDate(Y)
                // Log.d(TAG, "CheckUserGuess --------------------------UserIndixe: $job3!")
            }

            Log.d(TAG, "Tiempo transcurido:-------------------------->>>>: $tiempo!")
            click3(tiempo)

        }


    }

        fun mar (i:Int): String {
            var can = i.toString()
            return can
        }

    fun checkScore(){
        viewModelScope.launch {
            var der =  fibonacci(oro).collect{oro -> userIndixe.add(oro)}
            Log.d(TAG, "checkScore --------------------------UserIndixe: $userIndixe!")
            var creo =  before(pora).collect{pora -> Palabras.add(pora)}
            Log.d(TAG, "CheckScore --------------------------Palabras: $Palabras!")
            userdWords = (userIndixe - Palabras) as MutableSet<String>
            val elef = listade(userdWords)
            val entiy = elef.size
            //click4(entiy)

            Log.d(TAG, "Nuevas Palabras --------------------------UserdWords: $userdWords!")
        }
    }


    fun CheckLibras(){
        viewModelScope.launch {
            val tiempo = measureTimeMillis {
                val job1 = async { checkPalabras() }
                Log.d(TAG, "CheckPalabras --------------------------UserIndixe: $job1!")
                val job2 = async { checkUserGuess() }
                Log.d(TAG, "CheckUserGuess --------------------------UserIndixe: $job2!")
                val job3 = async { checkScore() }

                job1.join()
                job2.join()
                job3.join()
                // checkScore()

                // Log.d(TAG, "CheckUserGuess --------------------------UserIndixe: $job3!")
            }
            Log.d(TAG, "Checklibras --------------------------UserIndixe: $userIndixe!")
        }
    }

    suspend fun Scorein(){
        checkScore()
    }
    var util = userdWords
    var mil = "hello"
    var sos = "electro()"

   // var sur = electro()

    fun shapk(ra: MutableSet<String>): List<String> {
        val lia = ra
        val fruit = listade(lia)
        Log.d(TAG, " shapk --------------------------Shapk in Ocean: $lia!")
        return fruit
    }


    fun ocasio(f: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                alfin =f
            )
        }

    }




    fun luuk(ra: List<String>): List<String> {
        val himalaya = ra
         Log.d(TAG, " it -------------------------- himalaya: $himalaya!")
        return ra
    }


    fun liik(ra: List<String>): List<String> {
        val himalaya = ra
       // Log.d(TAG, " it -------------------------- Ruco Pichimcha: $himalaya!")
        return ra
    }

    fun gulf(item: List<String>) {
        val toque = item
        checkPalabrasUsadas()
        liik(item)
        // katey(item)
        // Ditey(item)
    }


    ////---Wrap--------
    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }

    fun listar(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }


    fun mask(a: List<String>, b: List<String>, c: Int): Int {
        var m = 0
        for (i in 0..c) {
            if (a[i] == b[i]) {
                m += 1
            }
        }
        return m
    }

    fun score(a: List<String>, b: List<String>): Int {
        val two = a - b
        val tree = two.size
        return tree
    }

    /**
     * Returns a list of date options starting with the current date and the following 3 dates.
     */


    private fun pickupOptions(): List<String> {
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
