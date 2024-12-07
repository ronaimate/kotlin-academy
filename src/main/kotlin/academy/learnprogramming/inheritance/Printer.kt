package academy.learnprogramming.inheritance


fun main() {
    val laserPrinter = LaserPrinter("Brother 1234", 15)
    laserPrinter.printModel()
    laserPrinter.bestSellingPrice()

    SomethingElse("whaterver")
}

//open class Printer(val modelName: String) { // open because default classes are final
//
//}

abstract class Printer(val modelName: String) { // abstract dont need open

    open fun printModel() = println("The model name of this printer is $modelName")

    abstract fun bestSellingPrice(): Double

}

//class LaserPrinter(modelName: String) : Printer(modelName) {
//
//    override fun printModel() = println("The model name of this laser printer is $modelName")
//
//    override fun bestSellingPrice(): Double = 129.99
//
//}

open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {

    final override fun printModel() = println("The model name of this laser printer is $modelName")

    override fun bestSellingPrice(): Double = 129.99

}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {


}

// --------------------------------------------------------------------------------------------------------

open class Something: MySubInterface {

    val someProperty: String
    override val number: Int = 25

    constructor(someProperty: String) { // run firstly
        this.someProperty = someProperty
        println("I'm the parent's secondary constructor, and i dotn have primary constructor!")
    }

    override fun mySubFunction(number: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFuction(str: String): String {
        TODO("Not yet implemented")
    }
}

class SomethingElse : Something {

    constructor(someOtherParameter: String) : super(someOtherParameter) { // run secondly
        println("I'm in the cild's constructor!")
    }

}


//open data class DataClass(val number: Int) { // data class cant be extended
//
//}

// --------------------------------------------------------------------------------------------------------

interface MyInterface {

    val number: Int
    val number2: Int
        get() = number * 100

    fun myFuction(str: String): String
}

interface MySubInterface : MyInterface {

    fun mySubFunction(number: Int): String
}