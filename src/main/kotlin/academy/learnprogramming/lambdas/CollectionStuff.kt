package academy.learnprogramming.lambdas


fun main() {

    val setInts = setOf(10, 15, 19, 5, 3, -22)

    println(setInts.filter { it % 2 != 0 })

    val immutableMap = mapOf(
        1 to Car("green", "Toyota", 2015),
        2 to Car("red", "Ford", 2016),
        3 to Car("silver", "Honda", 2013),
        17 to Car("red", "Bmw", 2015),
        8 to Car("green", "Ford", 2010),
    )
    println(immutableMap.toSortedMap())

    println(immutableMap.filter { it.value.year == 2015 })
    println(immutableMap.map { it.value.year })

    println(immutableMap.all { it.value.year > 2014 })
    println(immutableMap.any { it.value.year > 2014 })
    println(immutableMap.count() { it.value.year > 2014 })

    val cars = immutableMap.values
    println(cars.find { it.year > 2014 })
    println(cars.groupBy { it.color })
    println(cars.sortedBy { it.year })

    println(
        immutableMap
            .filter { it.value.model == "Ford" }
            .map { it.value.color }
    )

    val ints = arrayOf(1, 2, 3, 4, 5)
//    val add10List: MutableList<Int> = mutableListOf()
//    for (i in ints) {
//        add10List.add(i + 10)
//    }
//
//    println(add10List)

    val add10List = ints.map { it + 10 }
    println(add10List.javaClass)

}