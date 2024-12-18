package academy.learnprogramming.loops

fun main() {
    // for(int i = 1; i < 10; i++) {} - not available in kotlin - use range for with range (i in 1..10) {}

    val range = 1..5
    for (i in range) {
        println(i)
    }

    for (num in 1..20 step 4) {
        println(num)
    }

    for (i in 1 until 10) {
        println(i)
    }

    for (i in 20 downTo 10 step 5) {
        println(i)
    }

    val charRange = 'a'..'z'
    val stringRange = "ABC".."XYZ" // cant iter, str range don't have iterator

    val str = "Hello"
    for (c in str) {
        println(c)
    }

    println(3 in range) // true
    println('q' in charRange) // true
    println("CCC" in stringRange) // true
    println("CCCCCC" in stringRange) // true
    println("ZZZZZZ" in stringRange) // false

    val backwardRange = 5.downTo(1)
    println(5 in backwardRange) // true

//    val r = 5..1
//    println(5 in r) // false -> use 5.downTo(1) insted of 5..1

    val stepRange = 3..15
    val stepThree = stepRange.step(3) // only numeric and char ranges
    for (n in stepThree) {
        println(n)
    }
    val reversedRange = range.reversed() // only numeric and char ranges
    for (i in reversedRange) {
        println(i)
    }


    val seasons = arrayOf("spring", "summer", "winter", "fall")
    for (season in seasons) {
        println(season)
    }
    for (index in seasons.indices) {
        println("${seasons[index]} is season number $index")
    }
    seasons.forEach { println(it) }
    seasons.forEachIndexed { index, value -> println("$value is season number $index") }


    val notASeason = "whatever" !in seasons
    println(notASeason)

    val notInRange = 32 !in 1..10
    println(notInRange)

    val strHello = "Hello"
    println('e' in strHello)
    println('e' !in strHello)

    for (i in 1..3) {
        println("i = $i")
        jloop@ for (j in 1..4) {
            println("j = $j")
            for (k in 5..10) {
                println("k = $k")
                if (k == 7) {
//                    break@jloop
                    continue@jloop
                    //  if possible, we do not use this because it leads to spaghetti code
                }
            }
        }
    }


}