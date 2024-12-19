package academy.learnprogramming.lambdas

fun main() {

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "Bmw", 2015),
        8 to Car("green", "Ford", 2010),
    )

    println(
        immutableMap
            .filter { it.value.model == "Ford" } // returns a collection (performance issue)
            .map { it.value.color }              // returns a collection (performance issue)

    )

    // fyi: Kotlin collections are very efficient, so the sequence is not necessary for small collections

    println(
        immutableMap
            .asSequence()
            .filter { it.value.model == "Ford" }
            .map { it.value.color }
            .toList() // The operation is terminal like java stream.

    )

    listOf("Joe", "Mary", "Jane")
        .asSequence() // without a sequence, all operators will execute and returns a list
        .filter { println("filtering $it"); it[0] == 'J' }
        .map { println("mapping $it"); it.uppercase() }
        .find { it.endsWith("E") }
}