package academy.learnprogramming.textadventure

import java.util.*

fun main() {

    val locations = readLocationInfo()
    var loc = 64

    while (true) {
        val location = locations[loc] ?: Location(0, "Sorry, something went wrong, so the game will terminate")

        println(location.description)

        if (location.locationId == 0) {
            break
        }

        print("Avaliable exits are: ")
        location.exists.keys.forEach {
            print("$it, ")
        }

        val direction = readLine()?.uppercase(Locale.getDefault()) ?: "Z"

        if (location.exists.containsKey(direction)) {
            loc = location.exists[direction]!!
        } else {
            println("You can't keep go in that direction")
        }

    }
}