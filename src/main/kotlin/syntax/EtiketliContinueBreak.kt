package syntax

fun main(args: Array<String>){
    //for
   dısdongu@ for(i in 1..5){
        icdongu@ for(j in 1..4){
            println("i=$i; j=$j;")
            if(i==2) break@dısdongu
        }
    }
}