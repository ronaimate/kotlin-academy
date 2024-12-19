package academy.learnprogramming.lambdas

fun main() {

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
    )

    println(immutableMap.javaClass) // class java.util.LinkedHashMap
    println(immutableMap)

    val mutableMap = mutableMapOf(
        "John's Car" to Car("red", "Range Rover", 2010),
        "Jane's Car" to Car("blue", "Hyundai", 2012),
    )

    println(mutableMap.javaClass) // class java.util.LinkedHashMap - (if we want to use normal hashMap: hashMapOf(...) the hasmap is mutable like mutableMapOf
    println(mutableMap)
    mutableMap.put("Mary's Car", Car("red", "Corvette", 1965))

    for ((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val pair = Pair(10, "ten")
//    val firstValue = pair.first
//    val secondValue = pair.second
    val (firstValue, secondValue) = pair // Destructuring declarations
    println(firstValue)
    println(secondValue)

    val car = Car("blue", "Corvette", 1959)
    val (color, model, year) = car
    println("color = $color, model = $model, year = $year")


}

//class Car(val color: String, val model: String, val year: Int) {
//
//    operator fun component1() = color
//    operator fun component2() = model
//    operator fun component3() = year
//
//}

data class Car(
    val color: String,
    val model: String,
    val year: Int
) // data classes default feature: Destructuring declarations