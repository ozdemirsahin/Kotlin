package oop

fun main(args: Array<String>) {
    var result: Int = MyObject.multiple(6,2)
    println(result)

    //Object tüm class method ve property'lerini static yaparken
    //Companion Object class içinde özel olarak statik olması istenilen method ve property'leri yapar.
    MyClass.hello()
    MyClass.b

    var nesne = MyClass()
    var anonimNesne = object: MyClass() {
        override fun hello() = println("Anonim Hello!")
    }

    nesne.hello()
    anonimNesne.hello()

    println(nesne.javaClass)
    println(anonimNesne.javaClass)
}

object MyObject{
    var a: Int=1
    var b: Int=2

    fun multiple(sayi1: Int, sayi2: Int): Int{
        return sayi1*sayi2
    }
}

open class MyClass{
    var a: Int= 1

    open fun hello() = println("Hello!")

    companion object{
        var b: Int=1

        fun hello() = println("Hello!")
    }
}