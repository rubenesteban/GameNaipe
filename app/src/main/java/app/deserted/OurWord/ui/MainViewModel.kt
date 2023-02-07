package app.deserted.OurWord.ui

import android.util.Log
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import app.deserted.OurWord.data.OrderUiState
import app.deserted.OurWord.data.PersonRepository
import app.deserted.OurWord.ui.MainViewModel.garci.oclose
import app.deserted.OurWord.ui.MainViewModel.julian.libre
import app.deserted.OurWord.ui.MainViewModel.pegatina.tigre
import app.deserted.OurWord.ui.MainViewModel.tina.leon


//import app.deserted.OurWord.ui.OrderViewModel.granito.grano
//import app.deserted.OurWord.ui.OrderViewModel.migle.maite
import com.example.cupcake.R
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
//import kotlinx.coroutines.flow.internal.NopCollector.emit
import kotlinx.coroutines.launch
//import kotlinx.coroutines.flow.internal.NopCollector.emit
import java.text.NumberFormat
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale
import javax.inject.Inject
import kotlin.properties.Delegates
import kotlin.system.measureTimeMillis

/** Price for a single cupcake */
private const val PRICE_PER_CUPCAKE = 2.00

/** Additional cost for same day pickup of an order */
private const val PRICE_FOR_SAME_DAY_PICKUP = 3.00

/**
 * [OrderViewModel] holds information about a cupcake order in terms of quantity, flavor, and
 * pickup date. It also knows how to calculate the total price based on these order details.
 */


@HiltViewModel
class MainViewModel @Inject constructor(
    personRepository: PersonRepository
): ViewModel() {

    val readAll = personRepository.readAll

    /**
     * Cupcake state for this order
     */


    val _uiState = MutableStateFlow(OrderUiState(pickupOptions = pickupOptions()))
    val uiState: StateFlow<OrderUiState> = _uiState.asStateFlow()

    val items = MutableSharedFlow<List<DataItem>>()
    private val _items = mutableListOf<DataItem>()

    //--------------------------
    private val _tasks = libre.toMutableStateList()
    val tasks: List<Affirmation>
        get() = _tasks

    //-----------------------------
    private var Work: MutableSet<String> = mutableSetOf<String>("")
    private var Oficio: MutableSet<String> = mutableSetOf<String>("")
    private var Trabajo: MutableSet<String> = mutableSetOf<String>("")
    private var k: Int = 0
    private var j: Int = 0
    private val Guess: Any by lazy { util }
    private val kuess: Any by lazy { mil }
    private val Fuess: Any by lazy { sos }

    lateinit var pora: String
    var pico by Delegates.notNull<Int>()
    lateinit var erGuss: String
    lateinit var oro: String
    lateinit var user: String
    var can by Delegates.notNull<Int>()
    var ten by Delegates.notNull<Int>()

    private var userIndixe: MutableSet<String> = mutableSetOf()

    private var userEnter: MutableSet<String> = mutableSetOf()


    ///------------------------------

    private var userdPalabras: MutableSet<String> = mutableSetOf()


    private var userdas: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var userPalabras by mutableStateOf("")
        private set

    private var Palabras: MutableSet<String> = mutableSetOf()

    // __________________________________________________
    var EnPalabras by mutableStateOf("")
        private set

    //---------------------------
    private var userdWords: MutableSet<String> = mutableSetOf()
    private var intercambio: MutableSet<String> = mutableSetOf()

    private var usePalabras: MutableSet<String> = mutableSetOf()
    private var verPalabras: MutableSet<String> = mutableSetOf()
    private var ToldPalabras: List<String> = listOf()
        private set

    // __________________________________________________
    var userGues by mutableStateOf("")
        private set
    lateinit var pera: List<String>
    lateinit var pura: List<String>
    lateinit var pina: List<String>

    var UserGuess: List<String> = listOf()
    var UserTutu: MutableSet<String> = mutableSetOf<String>("")
    var Usertutus: List<String> = listOf()
    var Usertotos: List<String> = listOf()

    var Usertitis: List<String> = listOf()
    var UserYuyu: MutableSet<String> = mutableSetOf<String>("")
    var UserMars: MutableSet<String> = mutableSetOf<String>("")
    var UserLuna: MutableSet<String> = mutableSetOf<String>("")
    var UserJuess: MutableSet<String> = mutableSetOf<String>("")
        private set

    var itil: List<String> = listOf()
    var carro by mutableStateOf("")
        private set


    //_-----------------------------------------------
    private val _wrap = oclose.toMutableStateList()
    val wrap: List<Ask>
        get() = _wrap
    //---------------------------------------------


    ///-------------------------------------------

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

    val ULuna: MutableSet<String> = mutableSetOf<String>("")

    var elefante = tigre.toMutableStateList()
    var camello = leon.toMutableStateList()
    var uno = elefante.size
    var cano = click4(uno)

    val tula = camello - elefante

    var bulion = click7(tula)


    suspend fun comer(): List<String> {
        var nigy = camello - elefante
        return nigy
    }


    object pegatina {
        lateinit var cart: String
        var UserLima: MutableSet<String> = mutableSetOf<String>("")

        val tigre = moyi()
        fun moyi(): MutableSet<String> {
            for (i in 1..49) {
                cart = loadAffirmations()[i].key
                UserLima.add(cart)

            }
            return UserLima

        }

    }

    object tina {
        lateinit var cart: String
        var UserLima: MutableSet<String> = mutableSetOf<String>("")

        val leon = moyi()
        fun moyi(): MutableSet<String> {
            for (i in 1..49) {
                cart = loadAffirmations()[i].key
                UserLima.add(cart)

            }
            return UserLima

        }

   

    }


    fun hola() {
        pora = "hello"
        oro = "world"
        erGuss = "-:)"
        user = "elo"
        //cart = "hijo"
        can = 11
        ten = 1
        pura = listOf("a", "b", "c")
        pera = listOf("a", "b", "c", "d")
        pico = 1
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
        elo(item)
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
        val u = _uiState.value.alfin
        click6(u)
        return
    }


    fun Ditey(UseGuess: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                torre = UseGuess
            )
        }
        liik(UseGuess)
    }


    fun Deti(u: List<String>): SnapshotStateList<String> {
        val min = u.toMutableStateList()
        return min
    }


    var f = k
    var r = k
    var si = k
    var e = k
    var w = k
    var m = k
    var te = k
    var h = k

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
        h = k
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
        var calculatedPrice = quantity * calculateScore(_uiState.value.quantity)
        // If the user selected the first option (today) for pickup, add the surcharge
        if (pickupOptions()[0] == pickupDate) {
            calculatedPrice += PRICE_FOR_SAME_DAY_PICKUP
        }
        val formattedPrice = NumberFormat.getCurrencyInstance().format(calculatedPrice)
        return formattedPrice
    }

    private fun calculateScore(w: Int): Double {
        val t = 19
        val ruc = (t * w).toDouble()
        return ruc
    }

    fun remove(item: Affirmation, User: Int) {
        if (f <= User) {
            _tasks.remove(item)
            f += 1
            green(f)
        }

    }


    fun reset() {
        Work.clear()
        Trabajo.clear()
        Oficio.clear()
        UserJuess.clear()
        UserTutu.clear()
        UserYuyu.clear()
        UserMars.clear()
        UserLuna.clear()

    }


    fun remove1(item: Ask, User: Int) {
        if (r <= User) {
            _wrap.remove(item)
            r += 1
        }

    }

    fun green(s: Int) {
        //  Log.d(TAG, " Este es shin en dook------>>> es: $s!")
    }

    fun grey(s: Int) {
        Log.d(TAG, " Este es el tamani de palabras----->>> es: $s!")
    }

    fun click(s: List<String>) {
        Log.d(TAG, " Click este es el valor pura en Affirmation->>> es: $s!")
    }

    fun click6(s: List<String>) {
        Log.d(TAG, " Llevo la preparacion de Equipos para la salida->>> es: $s!")
    }

    fun click1(s: Int) {
        // checkUserGuess()
        Log.d(TAG, " Click este es el valor de pura en Ask--->>> es: $s!")
    }

    fun click7(s: List<String>) {
        Log.d(TAG, " Este es el valorde click7  a salida->>> es: $s!")
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


    fun PalabrasUsa(guessdWord: String, mas: Int) {
        userGues = guessdWord
        userdWords.add(userGues)
        if (elefante.contains(userGues)) {
            elefante.remove(userGues)
            val sin = elefante.size
            Log.d(TAG, " Los elemantos son igual a-------------------->>> es: $sin!")
            mitin()
            pura = camello - elefante
        }
        Palabras()
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

    fun AskUsa(guessdWord: String, t: Int) {
        if (w <= t) {
            userPalabras = guessdWord
            var hulk = Pickat(userPalabras)
            te += 1
        }

    }

    fun Pickat(userGues: String): MutableSet<String> {
        userdPalabras.add(userGues)
        val pi = userdPalabras
        val e = pi.size
        return userdPalabras
    }

    data class DataItem(val id: Int, val key: String)

    fun PalabrasUsadas(userGues: String, u: Int): MutableSet<String> {
        pora = userGues
        Palabras.add(pora)
        var yup = whather(u)
        checkMito(u)
        checkGuess(pora)
        return Palabras
    }


    fun checkGuess(h: String) {
        viewModelScope.launch {
            _items.add(h as DataItem)
            items.emit(_items)
        }

    }


    suspend fun kar(y: Int) {
        Bill(y)
    }

    fun checkMito(g: Int) {
        viewModelScope.launch {
            val tino = kar(g)
        }
    }


    fun mitin(): Int {
        val mar = loadAffirmations()[1].key
        Log.d(TAG, "Mill -----------en---------------mitin: $mar!")
        val yup = elefante.size
        Log.d(TAG, "Mill -----------en---------------mitin: $yup!")
        return yup
    }


    suspend fun scull(): Int {
        val pico = mitin()
        Log.d(TAG, "Hello -----------enter---------------nilo: $pico!")
        return pico
    }


    fun checkUserGuess(h: Int): List<String> {
        viewModelScope.launch {
            var der = before(pora).collect { pora -> Palabras.add(pora) }
            if (pora != "hello" && can >= h) {
                val user = pora
                var can = UserYuyu.size
                UserYuyu.add(user)
                if (can == h) {
                    Usertutus = listade(UserYuyu)
                    Log.d(TAG, "Hello --------------------------nilo: $Usertutus!")
                    Datey(Usertutus)
                    Ditey(Usertutus)
                    userGues = Usertutus.toString()
                    Log.d(TAG, "Hello --------------------------nilo: $userGues!")
                    scull()
                }
                Usertutus
            }
            return@launch
        }
        return Usertutus
    }

    fun primo() {
        Log.d(TAG, "Hello --------------------------nilo: $userGues!")

    }

    var vel = primo()

    suspend fun before(s: String): Flow<String> = flow {
        emit(pora)
    }

    fun PalabrasAsk(userGues: String, f: Int): MutableSet<String> {
        oro = userGues
        userIndixe.add(oro)
        Log.d(TAG, "hola -----------Guess---------------User: $Guess!")
        checkMito(f)
        return userIndixe
    }


    suspend fun fibonacci(s: String): Flow<String> = flow {
        emit(oro)
    }

    fun checkPalabras(g: Int): List<String> {
        viewModelScope.launch {
            var der = fibonacci(oro).collect { oro -> userIndixe.add(oro) }
            if (oro != "world" && ten <= g) {
                val ten = intercambio.size
                val user = oro
                intercambio.add(user)
                if (ten == g) {
                    Usertotos = listade(intercambio)
                    Log.d(TAG, "hola --------------------------User: $Usertotos!")
                    Datey(Usertotos)
                    Ditey(Usertotos)
                    Log.d(TAG, "Hello ------------in-------------nilo: $userGues!")

                    scull()
                }
                Usertotos
            }
            return@launch

        }
        return Usertotos

    }

    fun Bill(z: Int) {
        viewModelScope.launch {
            val tiempo: Long = measureTimeMillis {
                val job1 = async { checkUserGuess(z) }
                val job2 = async { checkPalabras(z) }
                var tren = checkUserGuess(z)
                delay(1000)
                var gull = checkPalabras(z)
                Log.d(TAG, "Bull -----------en---------------tren: $pura!")
                Log.d(TAG, "Bull -----------en---------------gull : $gull!")
                job1.join()
                job2.join()
                pura = tren
                var jaque = pura - gull
                var mate = jaque.size
                Log.d(TAG, "Bull -----------en---------------jaque: $EnPalabras!")
                Log.d(TAG, "Bull -----------en---------------mate : $mate!")
            }
            Log.d(TAG, "Bull -----------en---------------Tiempo Total trascurido : $tiempo!")


        }
    }


    var jama = UserMars.add(pora)
    var elo = listade(UserMars)
    var mi = click(elo)
    var tren = elefante.size
    var nilllo = click1(tren)


    fun Palabras(): List<String> {
        viewModelScope.launch {
            var elenga = comer()
            Log.d(TAG, "Bill -----------en otro---------------oro1 : $elenga!")
            return@launch
        }
        return pura
    }

    suspend fun esmeman(): List<String> {
        if (elefante.size <= 40) {
            pura = camello - elefante
        }
        return pura
    }


    private var util = eco()


    fun eco() {
        viewModelScope.launch {
            val job = async { esmeman() }
            var eme = esmeman()
            var ten = job.join()

        }
    }

    fun roca() {
        viewModelScope.launch {
            val job = async { esmeman() }
            var eme = esmeman()
            var ten = job.join()

        }
    }


    fun Bell(z: Int) {
        viewModelScope.launch {
            val tiempo: Long = measureTimeMillis {

                //Log.d(TAG, "Bill -----------en---------------pora: $pora!")
                //  Log.d(TAG, "Bill -----------en---------------oro : $oro!")
                if (pora != "hello") {
                    val nube = pora
                    UserMars.add(nube)
                    Log.d(TAG, "Bill -----------en---------------oro1 : $UserMars!")

                }
                if (oro != "world") {
                    val nube = oro
                    UserMars.add(nube)
                    Log.d(TAG, "Bill -----------en---------------oro2 : $UserMars!")
                }
                Log.d(TAG, "Bill -----------en---------------oro3 : $UserMars!")
                var kon = UserMars.size
                Log.d(TAG, "Bill -----------en---------------oro3 : $kon!")

            }
        }
    }

    fun Bull(z: Int) {
        viewModelScope.launch {
            val tiempo: Long = measureTimeMillis {
                //val job1 = async { checkPalabras(z) }
                val job2 = async { checkUserGuess(z) }
                delay(1000)
                val job1 = async { checkPalabras(z) }
                Log.d(TAG, "Bull -----------en---------------job1: $job1!")
                Log.d(TAG, "Bull -----------en---------------job2 : $job2!")
                job1.join()
                job2.join()
            }
            Log.d(TAG, "Bull -----------en---------------job2 : $tiempo!")

        }
    }


    fun arbol(l: List<String>) {
        Log.d(TAG, "Arbol -----------com---------------Tiempo : $l!")

    }

    var three = _uiState.value.alfin
    var cafe = arbol(three)

    fun Brell(z: Int) {
        viewModelScope.launch {
            val tiempo: Long = measureTimeMillis {

                Log.d(TAG, "Bill -----------en---------------pora: $pora!")
                Log.d(TAG, "Bill -----------en---------------oro : $oro!")
            }
        }
    }

    fun whather(g: Int): MutableSet<String> {
        var ter = UserMars.add(pora)
        return UserMars
    }

    var tree = _uiState.value.torre
    var fe = arbol(tree)

    suspend fun mesa(t: Int) {
        var tito = checkPalabras(t)

    }


    fun MiraPalabras() {
        viewModelScope.launch {

            var i = h

            if (pora != "hello" && can >= 10) {
                val user = pora
                var can = UserYuyu.size
                // Log.d(TAG, "MiraPalabras -----------en---------------yupi: $can!")
                i = +1
                UserYuyu.add(user)
                if (can == 10) {

                    Usertutus = listade(UserYuyu)
                    Log.d(TAG, "Hello --------------------------nilo: $Usertutus!")
                    Datey(Usertutus)

                }

            } else if (oro != "world" && ten <= 10) {
                var ten = intercambio.size
                val user = oro
                intercambio.add(user)
                // Log.d(TAG, "MiraPalabras -------------helllo -------------UserYuyu: $UserYuyu!")
                Log.d(TAG, "Size de lukk ------------it--------------UserYuyu: $ten!")
                if (ten == 12) {
                    Usertotos = listade(intercambio)
                    Log.d(TAG, "hola --------------------------User: $Usertotos!")
                }
                // Log.d(TAG, "MiraPalabras -----------hilo---------------UserYuyu: $hilo!")
                i += 1
                //Log.d(TAG, "MiraPalabras -----------en---------------yupi: $i!")
            }
            var ten = intercambio.size
            var can = UserYuyu.size

            val neo: List<String> = Usertotos - Usertutus
            val lukk = neo.size

            Log.d(TAG, "Size de lukk ------------it--------------UserYuyu: $lukk!")

        }
    }

    fun checkPalabrasUsadas() {
        viewModelScope.launch {
            var Utus: List<String> = listOf()
            val tiempo: Long = measureTimeMillis {

                val she = usePalabras.add(pora)
                Log.d(TAG, "CheckPalabrasUsadas --------------------------She: $usePalabras!")
                val he = userIndixe.add(oro)

                Log.d(TAG, "CheckPalabrasUsadas -------------------------->>He: $userIndixe!")
                // var ten = verPalabras.add(erGuss)
                val you = _uiState.value.quantity
                Log.d(TAG, "El valor de Quantity -------------------------->>You: $you!")

                val we = listade(usePalabras)
                val they = listade(verPalabras)
                val elefant = we - they
                //var Our = verPalabras.size
                val Our = elefant.size

                click5(Our)

                Log.d(TAG, "it --------------------------UserIn------------->>: $Our!")
                val P = mar(Our)
                var Q = setFlavor(P)
                val Y = "tiempo"
                setDate(Y)

            }

            Log.d(TAG, "Tiempo transcurido:-------------------------->>>>: $tiempo!")
            click3(tiempo)

        }

    }

    fun elo(l: List<String>) {
        val tu = l
        Log.d(TAG, "Elo --------------------------Respuesta del Alfin: $tu!")

    }

    fun ole(l: List<DataItem>) {

        Log.d(TAG, "Extra -------------------------------------->>>:  $l!")

    }

    fun mar(i: Int): String {
        val can = i.toString()
        return can
    }

    fun checkScore() {
        viewModelScope.launch {
            var der = fibonacci(oro).collect { oro -> userIndixe.add(oro) }
            Log.d(TAG, "checkScore --------------------------UserIndixe: $userIndixe!")
            var creo = before(pora).collect { pora -> Palabras.add(pora) }
            Log.d(TAG, "CheckScore --------------------------Palabras: $Palabras!")
            userdWords = (userIndixe - Palabras) as MutableSet<String>
            val elef = listade(userdWords)
            val entiy = elef.size
            //click4(entiy)

            Log.d(TAG, "Nuevas Palabras --------------------------UserdWords: $userdWords!")
        }
    }


    fun CheckLibras() {
        viewModelScope.launch {
            val tiempo = measureTimeMillis {

                val job3 = async { checkScore() }

                job3.join()
            }
            Log.d(TAG, "Checklibras --------------------------UserIndixe: $userIndixe!")
        }
    }


    var mil = "hello"
    var sos = "electro()"


    fun shapk(ra: MutableSet<String>): List<String> {
        val lia = ra
        val fruit = listade(lia)
        Log.d(TAG, " shapk --------------------------Shapk in Ocean: $lia!")
        return fruit
    }


    fun ocasio(f: List<String>) {
        _uiState.update { currentState ->
            currentState.copy(
                alfin = f
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
        Log.d(TAG, " it -------------------------- Ruco Pichimcha: $himalaya!")
        return ra
    }

    fun gulf(item: List<String>) {
        val toque = item

        elo(item)

    }

    fun dulf(item: List<String>) {
        val toque = item

        elo(item)

    }

    fun grilf(item: List<DataItem>) {
        val toque = item
        ole(item)
    }

    ////---Wrap--------
    fun listade(a: MutableSet<String>): List<String> {
        val ls = a.asSequence().toList()
        return ls

    }

    fun listar(a: List<String>): MutableSet<String> {
        val ls = a.asSequence().toMutableSet()
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

data class Affirmation(val key: String, val drawable: Int)

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
        Affirmation("running", R.drawable.undraw_running_wild_h6ao),
        Affirmation("scientist", R.drawable.undraw_scientist_klqc),
        Affirmation("snow_games", R.drawable.undraw_snow_games_tq9r),
        Affirmation("summer", R.drawable.undraw_summer_1wi4),
        Affirmation("team", R.drawable.undraw_team_up_re_84ok),
        Affirmation("traveling", R.drawable.undraw_traveling_qio0),
        Affirmation("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
        Affirmation("woman", R.drawable.undraw_woman_re_afr8)
    )
}

data class Ask(val key: String, val drawable: Int)

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
        Ask("running", R.drawable.undraw_running_wild_h6ao),
        Ask("scientist", R.drawable.undraw_scientist_klqc),
        Ask("snow_games", R.drawable.undraw_snow_games_tq9r),
        Ask("summer", R.drawable.undraw_summer_1wi4),
        Ask("team", R.drawable.undraw_team_up_re_84ok),
        Ask("traveling", R.drawable.undraw_traveling_qio0),
        Ask("winter_skating", R.drawable.undraw_winter_skating_re_qouk),
        Ask("woman", R.drawable.undraw_woman_re_afr8)
    )
}


