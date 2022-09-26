package oop


fun main(args: Array<String>) {
    var box1 = Box<Int>()
    box1.add(2)

    var box2 = Box<Boolean>()
    box2.add(true)
    // ****

    var myClass = MyClasses<SecondClass>()
    myClass.myFunc(SecondClass())
}

class Box<T>{
    var s: T? = null

    fun add(s: T){
        this.s = s
    }

    fun get(): T? = this.s
}

// ****

open class FirstClass{
    fun first(){
    }
}

class SecondClass: FirstClass(){
    fun second(){
    }
}

class ThirdClass: FirstClass(){
    fun third(){
    }
}

class MyClasses<T: FirstClass>{
    fun myFunc(t: T){

    }
}