package syntax

fun  main(args: Array<String>){
    var name="Özdemir"
    println(name)
    name="Burak"
    println(name)

    /* val değişkene yaratıldığı satır dışında atama yapılamaz.*/

    val surname="Şahin"

    /**
     * değişkenler ? ile nullable yapılabilir. ? ile nullable yapılan bir değişkenin property'sine erişilmeye çalışıldığında NPE alınmaz.(Null safe)
     * !! ifadesi ilede not nullable bir değişkene nullable bir değişken atanabilir.Fakat bu kullanımda NPE alınabilir.
      */

    var a: String?=null

    println(a?.length)

    var b=a!!.length

    print(b)

}