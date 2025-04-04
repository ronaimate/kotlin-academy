package academy.learnprogramming.datatypes

import academy.learnprogramming.javacode.DummyClass

fun main() {
    val myInt = 10
    println("default datatype is ${myInt is Int}")
    var myLong = 22L

    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    val anotherInt = 5

    var myDouble = 65.984
    println(myDouble is Double)

    val myFloat = 838.9423f
    println("This is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble()

    val char = 'b'

    val myCharInt = 65
    println(myCharInt.toChar())

    val myBoolean = true

    val vacationTime = false
    val onVacation = DummyClass().isVacationTime(vacationTime)
    println(onVacation)

    val anything: Any
    val unit: Unit
    val nothing: Nothing

}