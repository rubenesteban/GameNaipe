package app.deserted.cotopaxi.data

fun main()
{
    secul()
}

var listA = listOf<String>("a","s","f","h","p","l")
var listB = listOf<String>("a","s","f","g","o","l")

fun mask(){
    var j = 0
    for (i in 0..5){
        if (listade(listA) == listade(listB) ){
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
        var hulk = listade(listA).map { it }
        var hello = hulk.toString()
        println(hello)
    }
}