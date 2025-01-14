package academy.learnprogramming.interperability.javafromkotlin.calljava

import academy.learnprogramming.interperability.javafromkotlin.javacode.Car

fun main() {

    val car = Car("blue", "Ford", 2015)
    car.color = "green"
    println(car)

    car.variableMethod(5, "hello", "goodbye")
    val strings = arrayOf("hello", "goodbye")
    car.variableMethod(10, *strings)

    car.wantsIntArray(intArrayOf(1, 2, 3)) // or - arrayOf(1, 2, 3).toIntArray()

    (car.anObject as Object).notify()
    car.anObject.javaClass

    println("x = ${Car.x}")
    println(Car.xString())

    car.demoMethod({ println("I'm in a thread!") })

    var model = car.model
    println(model?.javaClass)

}