package app.deserted.cotopaxi.data

fun main()
{
    mask()

}

var listA = listOf<String>("a","s","f","h","p","l")
var listB = listOf<String>("a","s","f","g","o","l")

fun mask(){
    var j = 0
    for (i in 0..5){
        if (listA[i] == listB[i]){
            j+= 1
        }
    }
    println(j)
}