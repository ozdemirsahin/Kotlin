package oop

fun main(args: Array<String>) {
   var mercedes= Mercedes("C200d", 2018, 200)
}

open class Car(var name: String, var model: Int){ // open keyword'ü ile bu class'tan sub class türetilebileceğini sağladık.
    init{
        println(" name : $name")
        println(" model : $model")
    }
}

class Mercedes( name: String, model: Int, var hp: Int): Car(name, model){
    init{
        println(" hp : $hp")
    }
}

class abc(param1: String, param2: Int){
    init{
        println(param1)
    }
}