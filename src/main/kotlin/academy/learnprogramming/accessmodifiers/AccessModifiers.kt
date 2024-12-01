package academy.learnprogramming.accessmodifiers

val MY_CONSTANT = 100

fun main() {

//    println(MY_CONSTANT)
//
    val emp = Employee("John")
    println(emp.firstName)

    val emp2 = Employee("John")
    println(emp == emp2)
//    emp.fullTime = false
//    println(emp.fullTime)
//
//    val emp2 = Employee("Joe")
//    println(emp2.firstName)
//    println(emp2.fullTime)
//
//    val emp3 = Employee("Jane", false)
//    println(emp3.firstName)
//    println(emp3.fullTime)

//    println(Demo().dummy)

    val car = Car("blue", "toyota", 2015)
    println(car)
    val car2 = Car("blue", "toyota", 2015)
    println(car == car2)
    val car3 = car.copy()
    println(car3)
    val car4 = car.copy(year = 2016, color = "green")
    println(car4)
}

//class Employee constructor(firstName: String) { full way
//    val firstName: String
//
//    init {
//        this.firstName = firstName
//    }
//}

//class Employee constructor(firstName: String) { shorter
//    val firstName: String = firstName
//}

//class Employee constructor(val firstName: String) { more shorter
//}

//class Employee(val firstName: String) { the correct way (shortest)
//}

//class Employee protected constructor(val firstName: String) { protected contructor required write access mod + const keyword (default: public)
//}


//class Employee(val firstName: String) {   secondary constructor full way
//
//    var fullTime = true
//
//    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
//        this.fullTime = fullTime
//    }
//}

//class Employee(
//    val firstName: String,
//    var fullTime: Boolean = true
//) { // shortest way without secondary constructor, with default value
//}


//class Demo { it's work, but i dont know whenm need thid, the init has more make sense
//    var dummy: String
//
//    constructor() {
//        dummy = "Hello"
//    }
//}

// ------------Properties and Fields in Kotlin
class Employee(
    val firstName: String,
    fullTime: Boolean = true
) {
    var fullTime = fullTime
        get() {
            println("Running the custom get")
            return field
        }
        set(value) {
            println("Running the custom set")
            field = value
        }

}

data class Car(val color: String, val model: String, val year: Int) {

}