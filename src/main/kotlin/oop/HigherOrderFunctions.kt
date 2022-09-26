package oop


fun  main(args: Array<String>){
    callMe { println("Özdemir") }

    sayHello("Özdemir", { text -> println(text)})

    reverse("Kotlin", { str -> str.reversed()})
}


// (Parametre Tipleri) -> Dönüş Tipi
fun callMe(func: () -> Unit){
     func()
}

fun sayHello(name: String, body: (String) -> Unit){
    body("Hello $name")
}

fun reverse(str: String, action: (String) -> String){
    var result = action(str)
    println(result)

}