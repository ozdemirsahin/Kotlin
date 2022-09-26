package oop

fun  main(args: Array<String>){
    var p1=People1("Özdemir", 31)
    var p2=People1("Özdemir", 31)
    var p3=People2 ("Özdemir")
    var p4=People2 (age=31)
}

class People1{
    var name: String
    var age: Int

    constructor(name: String, age: Int){
        this.name=name
        this.age=age
        println("constructor")
    }

    init{
        println("init bloğu")
    }
}

/**
 * constructor yerine bu şekilde kullanılabilir.
 * parametreleri nullable yaparak yada başlangıç değeri atayarak 3 farklı constructor'ı tek satırda tanımlamış olduk.
 */
class People2(name: String? = null, age: Int = 0) {
    var name: String? = name
    var age: Int? = age
}

class People3(var name: String, var age: Int) // var anahtar kelimesi ile hem class değişkeni hem class property'si olabiliyor.