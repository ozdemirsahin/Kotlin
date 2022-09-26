package syntax

fun main(args: Array<String>){
    //while
    var i =1

    while(i<=10){
        println(i)
        i++;
    }

    // 0 ila 100 arası tek sayıların toplamını ekrana yazdıran program
    var sayi=0
    var toplam=0
    while (sayi <=100){
        if(sayi % 2 == 1) toplam+=sayi
        sayi++
    }
    println(toplam)

    //do-while döngüsü
    //0 ila 10 arasındaki sayıları ekrana yazan program
    var x=0
    do {
        println(x)
        x++
    }while (x < 11)

    // username password doğru girilene kadar devam eden döngü
    var userName: String
    var password: String

    do {
        println("Username giriniz")
        userName= readLine().toString()
        println("Password giriniz")
        password= readLine().toString()
    }while (!userName.equals("Özdemir") && !password.equals("123"))

    println("Giriş başarılı")

}