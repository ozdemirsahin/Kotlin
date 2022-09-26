package oop

fun main(args: Array<String>) {
    hello()

    println(topla(1,2))

    // tek parametre alan lambda fonksiyonlarında it kullanılabilir
    var list = listOf(1,2,3)

    list.forEach{i -> println(i)}
    //veya
    list.forEach{println(it)}
}

var hello = {println("Hello")}

var topla = {a: Int, b: Int -> a + b }