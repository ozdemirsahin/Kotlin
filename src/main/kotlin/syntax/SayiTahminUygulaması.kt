package syntax

import java.util.Random

fun main(args: Array<String>){

    var random: Int = Random().nextInt(100)
    var tahmin: Int
    var sayac=1

    while(true){
        println("Tahmin Giriniz :")
        tahmin= readLine()!!.toInt()

        if(tahmin > random){
            println("tahmini küçültün")
            sayac++
        }else if(tahmin < random){
            println("tahmini büyültün")
            sayac++
        }else{
            println("Tebrikler doğru tahmin. $sayac. seferde bildiniz")
            break
        }
    }

}