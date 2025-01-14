@file:JvmName("StaticCar") // default name: File name with extension e.g: CarKt  - CarKt.topLevel()
package academy.learnprogramming.interperability.kotlinfromjava.kotlincode

import java.io.IOException
import kotlin.jvm.Throws


fun topLevel() = println("I'm in the Car file!")

@Throws(IOException::class)
fun doIO() {
    throw IOException()
}

@JvmOverloads
fun defaultArgs(str: String, num: Int = 25) {

}

fun main() {
    "Print this".print()
    Car.carComp()
    SingletonObj.doSomething()
}

object SingletonObj {
    @JvmStatic
    fun doSomething() = println("I'm doing something in the singleton object")
}

class Car(color: String, @JvmField val model: String, val year: Int) {

    companion object {
        const val constant = 25

        @JvmField
        val isAuto = false

        @JvmStatic
        fun carComp() = println("I'm in Car's companion object!")
    }

    var color: String = color
        private set(value) {
            field = "always green"
        }

    fun printMe(text: String) {
        println("I dont't expect a null value: $text")
    }
}


fun String.print() {
    println(this)
}