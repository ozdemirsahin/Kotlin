package oop

fun  main(args: Array<String>){
    var p= People()
    p.name = "Burak"
    p.age = 3
}

class People{
    /**
     * Kotlin'de özel olarak getter setter tanımlamaya gerek yoktur.
     */
    var name: String = "Özdemir"
        get() = field
        set(value){field=value}

    var age: Int = 31
}

