package oop

fun main(args: Array<String>) {
    var list = listOf(1,2,3,4,5,6,7,8,9,10)

    //filter
    var list2 = list.filter { it >5 }
    list2.print()

    //map
    var list3 = list.map { it*3 }
    list3.print()

    //count
    var count = list.count{it >5}
    println(count)

    //all
    var result = list.all { it > 2 }
    println(result)

    //any
    var result2 = list.any { it > 2 }
    println(result2)

    //find
    var result3 = list.find { it > 4 }
    println(result3)
}

fun <T> List<T>.print(){
    for(item in this){
        println(item)
    }
}