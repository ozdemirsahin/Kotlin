package syntax

fun main(args:Array<String>){
    //java'daki switch case'e karşılık geliyor.
    var sayi=10
    when(sayi){
        1 -> println("sayı 1")
        2 -> println("sayı 2")
        3 -> println("sayı 3")
        else -> println("farklı sayı")
    }

    when(sayi){
        in 1..10 -> println("sayı 1 ile 10 arasında")
        else -> println("Sayı 1 ile 10 arasında değil")
    }

}