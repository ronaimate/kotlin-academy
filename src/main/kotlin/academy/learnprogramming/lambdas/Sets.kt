package academy.learnprogramming.lambdas

fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22) // immutable
    println(setInts.plus(20)) // .plus(..) returns a new set
    println(setInts.plus(10))
    println(setInts.minus(19)) // .minus(..) returns a new set
    println(setInts.minus(100)) // nothing happens
    println(setInts.average())
    println(setInts.drop(3)) // returns a new set, drop first n (3) element

    val mutableInts = mutableListOf(1, 2, 3, 4, 5)
    mutableInts.plus(10) // .plus(..) and .minus(..) returns a new set just like the immutable set
    println(mutableInts)

    mutableInts.add(10)
    println(mutableInts)

}