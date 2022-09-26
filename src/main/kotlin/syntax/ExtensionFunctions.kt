package syntax

fun main(args: Array<String>){
    println(5.triple_2())
}

fun triple(sayi: Int):Int = sayi*3

//extension function
fun Int.triple_2():Int = this*3