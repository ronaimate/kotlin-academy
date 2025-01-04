package academy.learnprogramming.generics.coverance

fun main() {

    val shortList: List<Short> = listOf(1, 2, 3, 4, 5)
    convertToInt(shortList)

}

fun convertToInt(collection: List<Number>) {
    for (num in collection) {
        println("${num.toInt()}")
    }
}


fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

fun waterGarden(garden: Garden<Flower>) {}

open class Flower {}

class Rose : Flower() {}

// out -> covarient
class Garden<out T : Flower>(
//    var something: T == cant do it just with val: val something: T
    // var generate setter and getter val genereate only getter

    // we can use var if it's private
    private var something: T
) {

    val flowers: List<T> = listOf()

    fun pickFLower(i: Int): T = flowers[i]
//    fun plantFlower(flower: T) {} // cant do it, cant modify the instance

    fun contains(flower: @UnsafeVariance T): Boolean =
        flowers.contains(flower) // cant do with @UnsafeVariance, but never modify instance

}