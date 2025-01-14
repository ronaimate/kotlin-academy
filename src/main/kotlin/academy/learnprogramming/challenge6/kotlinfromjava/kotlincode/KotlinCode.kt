@file:JvmName("KotlinStuff")

package academy.learnprogramming.challenge6.kotlinfromjava.kotlincode

import kotlin.jvm.Throws

fun sayHelloToJava(name: String) = println("Kotlin says hello to Java and $name")

object Challenge {
    @JvmStatic
    fun doMath(x: Int, y: Int) = (x + y) * (x - y)
}

class Employee(var firstName: String, var lastName: String, @JvmField var startYear: Int) {

    @JvmOverloads
    fun takesDefault(param1: String?, param2: String = "default") {
        println("$param1 and $param2")
    }

}