package oop

fun main(args: Array<String>) {
}

class A(override var name: String) : MyInterface {
    override fun hello() {
        TODO("Not yet implemented")
    }
}

interface MyInterface {
    var name: String

    fun hello()

    fun hello2(){
        println("Özdemir")
    }
}