package oop

/**
 *  a++ a.inc()
 *  a-- a.dec()
 *  a+b a.plus(b)
 *  a-b a.minus(b)
 *  a*b a.times(b)
 *  a/b a.div(b)
 *  a%b a.rem(b), a.mod(b) (deprecated)
 *  a..b a.rangeTo(b)
 * */

fun main(args: Array<String>) {
    val kesir1: Kesir = Kesir(1,3)
    val kesir2: Kesir = Kesir(1,4)
    val sonuc = kesir1 + kesir2

    println(sonuc)
}

data class Kesir (val pay :Int, val payda :Int){

    operator fun plus(eklenenKesir :Kesir) :Kesir{
        if(this.payda == eklenenKesir.payda){
            return Kesir(this.pay + eklenenKesir.pay, this.payda + eklenenKesir.payda)
        }else {
            return Kesir(this.pay * eklenenKesir.payda+ eklenenKesir.pay*this.payda, this.payda*eklenenKesir.payda)
        }
    }

}