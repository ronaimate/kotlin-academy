package academy.learnprogramming.lambdas

fun main() {

    val strings = listOf("spring", "summer", "fall", "winter", "summer")
    val colorList = listOf("black", "white", "red", "black", "red")

    val mutableSeasons = strings.toMutableList()
    mutableSeasons.add("some other season")
    println(mutableSeasons)

    println(strings.last())

    println(strings.asReversed())


//    if(strings.size > 5) {
//        println(strings[5])
//    }
    println(strings.getOrNull(5))

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints.max())

    println(colorList.zip(strings)) // Pairű

    val mergedLists = listOf(colorList, strings) // two list in list
    println(mergedLists)

    val combinedList = colorList + strings
    println(combinedList)

    val noDupsList = combinedList.union(strings)
    println(noDupsList)

    val noDupColors = colorList.distinct()
    println(noDupColors)

}