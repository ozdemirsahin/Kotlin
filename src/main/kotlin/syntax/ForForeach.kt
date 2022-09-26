package syntax

fun main(args: Array<String>){
    //for
    for(i in 1..5){
        println(i)
    }

    for(i in 5 downTo  1 step 2){
        println(i)
    }

    //foreach
    (0..10).forEach{ i-> println(i) }

    (10 downTo 1 step 2).forEach{i-> println(i) }
}