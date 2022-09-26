package oop

fun main(args: Array<String>) {
    printRepeated("Hello",10)

    arrayOf(1,2,3,4,5).printArrayExt()
}

fun <T> printRepeated(t: T, times: Int){
    for(i in 1..times){
        println(t)
    }
}

fun <T> Array<T>.printArrayExt(){
    for(items in this){
        println(items)
    }
}