package app.deserted.cotopaxi.data

import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
fun main() {
   mask()
}



var listA = listOf<String>("a","s","f","h","p","l")
var listB = listOf<String>("a","s","f","g","o","l")
val flow = flow<String>{
    for (i in 1..10){
        emit("Hola $i")
    }
}



suspend fun  correr(){
    flow.collect{ println(it)}
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
fun listade(a:List<String>): Sequence<String> {
    val ls = a.asSequence()
    return ls

}

fun comprov(a:List<String>, b:List<String>): Int {
    var u = 0
    for (it in 1..6) {
        if (listade(a).map { it } == listade(b).map { it }) {
            u += 1
        }
    }
    return u
}

fun secul(){
    for (it in 1..6) {
        val hulk = listade(listA).map { it }
        val hello = hulk.toString()
        println(hello)
    }
}