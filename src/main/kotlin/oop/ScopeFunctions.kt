package oop

fun main(args: Array<String>) {

    //let fonksiyonun bir değişkenin nıll olup olmadığının kontrolünü yapar

    var str: String? = "Kotlin"

    str?.let {
        println("Null Değil")
    } ?: println("Null")

    var result = str.let {
        println(str) // argument
        5       // return value
    }

    println(result)

    // Run
    var playerList = mutableListOf<Team>()

    var playersCount = playerList.run {
        add(Team("Özdemir","Şahin"))
        add(Team("Burak","Şahin"))
        size
    }

    println(playersCount)

    //apply fonksiyonu daha kısa kod yazmamızı sağlıyor

    val task1 = Runnable{println("Task 1")}
    val thread1 = Thread(task1)

    thread1.isDaemon = true
    thread1.name = "thread1"
    thread1.state
    thread1.start()

    val task2 = Runnable{println("Task 2")}
    val thread2 = Thread(task2)

    thread2.apply {
        thread2.isDaemon = true
        thread2.name = "thread2"
        thread2.state
        thread2.start()
    }

    // with
    val task3 = Runnable{println("Task 1")}
    val thread3 = Thread(task3)

    var result3 = with(thread3){
        thread3.isDaemon = true
        thread3.name = "thread1"
        thread3.state
        thread3.start()
    }

    //repeat
    repeat(10, {println("Özdemir")})

}

class Team(var name: String, surmane: String){

}