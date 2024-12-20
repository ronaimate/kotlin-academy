package academy.learnprogramming.generics

import java.math.BigDecimal

fun main() {

    val list = mutableListOf("Hello")
    list.add("another string")
//    printCollection(list)
    list.printCollection()
    list[0].uppercase()

    val bdList = mutableListOf(BigDecimal(-33.45), BigDecimal(3503.99), BigDecimal(0.329))
//    printCollection(bdList)
    list.printCollection()

}


//fun  <T>printCollection(collection: Collection<T>) {
//    for (item in collection) {
//        println(item)
//    }
//}

fun  <T>List<T>.printCollection() {
    for (item in this) {
        println(item)
    }
}