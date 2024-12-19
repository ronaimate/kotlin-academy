package academy.learnprogramming.lambdas

fun main() {

    val strings = listOf("spring", "summer", "fall", "winter") // immutable
    println(strings.javaClass)

    val emptyList = emptyList<String>() // immutable
    println(emptyList.javaClass)

    val notNullList = listOfNotNull("hello", null, "goodbye")
    println(notNullList) // [hello, goodbye]

    val arrayList = arrayListOf(1, 2, 4) // mutable
    println(arrayList.javaClass) // class java.util.ArrayLis
    arrayList.add(5)
    println(arrayList)

    val mutableList = mutableListOf(1, 2, 3) // mutable
    println(mutableList.javaClass) // class java.util.ArrayLis

    println(mutableList[2]) // mutableList.get(2)
    mutableList[1] = 20     //  mutableList.set(1, 20)
    println(mutableList)

    val array = arrayOf("black", "white", "green")
    val colorList = listOf(*array) // same: array.toList()
    println(colorList)

    val ints = intArrayOf(1, 2, 3)
    println(ints.toList())


}