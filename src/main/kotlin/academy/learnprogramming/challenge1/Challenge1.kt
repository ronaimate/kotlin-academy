package academy.learnprogramming.challenge1

import java.util.*


fun main() {

    val hello1 = "Hello!"
    val hello2 = "Hello!"

    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    println("hello1 is structually equal to hello2: ${hello1 == hello2}")

    var num = 2988

    val text: Any = "The Any type is the root of the Kotlin class hiarchy"

    if(text is String) {
        println(text.uppercase(Locale.getDefault()))
    }

    println("""     1
        |    11
        |   111
        |  1111""".trimMargin())
}