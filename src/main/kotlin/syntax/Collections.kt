package syntax

fun  main(args: Array<String>){
    //Array
    var array= Array<Int>(3){0}
    for(items in array) println(items)

    var array2 = arrayOf('1','2','3')

    println(array2)

    var array3: Array<String> = arrayOf("1","2","3")

    println(array3)

    /**Collections
     *  Immutable collections (Read only)
     *      listOf
     *      mapOf,
     *      setOf
     *  Mutable collections (Read & Write)
     *      ArrayList, arrayListOf, mutableListOf
     *      HashMap, hashMapOf, mutableMapOf
     *      mutableSetOf, hashSetOf
     */

    //List
    var list1 = listOf<String>("1","2","3")
    //list1[1] = "1"; eleman değiştirilmez, silinemez, eklenemez.

    var list2 = mutableListOf<String>("1","2","3")
    list2[2] = "Özdemir"
    list2.add("Burak")
    list2.removeAt(0)
    list2.remove("Özdemir")

    //Map
    var map1 = mapOf<Int,String>(1 to "Özdemir", 2 to "Burak", 3 to "Ebru")
    //map1.put() ekleme çıkarma silme yapılamaz

    var map2 = HashMap<Int, String>()
    map2.put(1,";Özdemir")
    map2.put(2,"Ebru")
    map2.put(3, "Burak")

    var map3 = hashMapOf<Int,String>(1 to "Özdemir", 2 to "Burak", 3 to "Ebru")
    map3.put(4,"Özdemir")


    var map4 = mutableMapOf<Int,String>(1 to "Özdemir", 2 to "Burak", 3 to "Ebru") // LinkedHashMap verileri sıralı biçimde tutuyor(Eklenme sırasına göre)
    map4.put(4,"Zeynep")
    map4.replace(4, "Ela")
    map4.remove(1)

    for(i in map3)  println("key: ${i.key} value: ${i.value}")

    //Set
    var set1 = setOf<Int>(1,2,3,4,5,5,5)
    //set1.add(1) ekleme çıkarma silme yapılamaz.

    var set2 = mutableSetOf<Int>(1,2,3,4,5,5,5)
    set2.add(4)
    set2.forEach(){i -> println(i)}

    var set3 = hashSetOf<Int>(1,2,3,4,5,5,5)
    set3.remove(1)
    set3.forEach(){i -> println(i)}
}