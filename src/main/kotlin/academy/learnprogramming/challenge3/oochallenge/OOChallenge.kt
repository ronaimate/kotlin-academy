package academy.learnprogramming.challenge3.oochallenge

fun main() {

//    val bicycle = KotlinBicycle(10, 3, 10)
//    bicycle.printDescription()
//
//    val mountainBike = KotlinMountainBike(20, 2, 10, 5)
//    mountainBike.printDescription()
//
//    val roadBike = KotlinRoadBike(10, 10, 3, 10)
//    roadBike.printDescription()
//
//    val bicycle2 = KotlinBicycle(10, speed = 10)
//    bicycle2.printDescription()
//
//    val mountainBike2 = KotlinMountainBike(20, 2, speed = 5)
//    mountainBike2.printDescription()
//
//    val roadBike2 = KotlinRoadBike(10, 10, speed = 10)
//    roadBike2.printDescription()

    val mountainBike3 = KotlinMountainBike(10, 10, speed = 10, color = "Blue")
    mountainBike3.printDescription()

    KotlinMountainBike.availableColors.forEach(::println) // like .forEach { println(it) }

}

open class KotlinBicycle(var cadence: Int, var gear: Int = 10, var speed: Int) {

    fun applyBreak(decrement: Int) {
        speed -= decrement
    }

    fun speedUp(increment: Int) {
        speed += increment
    }

    open fun printDescription() {
        println("Bike is in gear $gear with a cadence of $cadence travelling at a speed of $speed.")
    }
}

class KotlinMountainBike(var seatHeight: Int, cadence: Int, gear: Int = 10, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

    companion object {
        val availableColors = listOf("blue", "red", "white", "black", "green", "brown")
    }

    constructor(seatHeight: Int, cadence: Int, gear: Int = 20, speed: Int, color: String) :
            this(seatHeight, cadence, gear, speed) {
        println("This is the $color")
    }

    override fun printDescription() {
        super.printDescription()
        println("The mountain bike has a seat height of $seatHeight inches.")
    }
}

class KotlinRoadBike(val tireWidth: Int, cadence: Int, gear: Int = 10, speed: Int) :
    KotlinBicycle(cadence, gear, speed) {

    override fun printDescription() {
        super.printDescription()
        println("The road bike has a tire width of $tireWidth MM.")
    }
}