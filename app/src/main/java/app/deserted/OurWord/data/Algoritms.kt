package app.deserted.OurWord.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import com.example.cupcake.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking{
    val tiempo = measureTimeMillis {
        val gol = correr()
            println(gol)
    }
    println("Recoger en $tiempo millisegundos")
}



var listA = listOf<String>("a","s","f","h","p","l")
var listB = listOf<String>("a","s","f","g","o","l")
val flow = flow<String>{
    for (i in 1..10){
        delay(1000)
        val userGues = "Hola $i"
        emit(userGues)
    }

}

// __________________________________________________
var userPalabras by mutableStateOf("")
    private  set


//---------------------------
private var WordsUsadas: MutableSet<String> = mutableSetOf()

private var usePalabras: MutableSet<String> = mutableSetOf()

// __________________________________________________
var userGues by mutableStateOf("")
    private set


suspend fun  correr(): MutableSet<String> {
    try{
        val ulti = flow.collect { userGues ->
        val gutf = golpe(userGues)
        }
        val gulf = golpe(userGues)
        return gulf
    } catch (e: Exception){
        println("The flow es $e")
    }
    return golpe(userGues)
}

 suspend fun golpe(s:String): MutableSet<String> {
    WordsUsadas.add(s)
    return WordsUsadas
}


fun pasar(s: MutableSet<String>): List<String> {
    val pera = listar(s)
    return pera
}


fun listar(a: MutableSet<String>): List<String> {
    val ls = a.asSequence().toList()
    return ls

}


fun mask(){
    var j = 0
    for (i in 0..5){
        if (listA[i] == listB[i] ){
            j+= 1
        }
    }
    println(j)
}
fun listade(a: List<String>): Sequence<String> {
    val ls = a.asSequence()
    return ls

}

fun secul(){
    for (it in 1..6) {
        val hulk = listade(listA).map { it }
        val hello = hulk.toString()
        println(hello)
    }
}


