package oop

fun main(args: Array<String>) {
    println(Renk.KIRMIZI.rgb)
    println(Renk.YESIL.rgb)
    println(Renk.MAVI.rgb)
}

enum class Renk(val rgb: String){
    KIRMIZI("FF0000"),
    YESIL("00FF00"),
    MAVI("0000FF")
}