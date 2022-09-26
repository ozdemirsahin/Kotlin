package oop

fun main(args: Array<String>) {
    var person = Person("Özdemir",31)
    var person1 = person.copy()
    println(person.hashCode())
    println(person1.hashCode())
    var person2 = person.copy("Burak", 4)
    println(person2.hashCode())
    println(person.toString())
}

data class Person(var name: String, var age: Int) //getter-setter, equals(), hascode() ve toString() methodları otomatik üretilir