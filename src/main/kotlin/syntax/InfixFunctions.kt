package syntax


/**
 * Tüm infix fonksiyonlar bir extension fonksiyondur.Fakat tüm extension fonksiyonlar infix fonksiyon değildir.
 * Infix fonksiyonlar tek parametre alır.
 */
fun  main(args: Array<String>){
    println(5 topla 3)
    println(5.topla(3))
}

infix fun Int.topla(sayi: Int):Int = this+sayi