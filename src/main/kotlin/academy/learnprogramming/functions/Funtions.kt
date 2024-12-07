package academy.learnprogramming.functions

fun main() {
    println(labelMultiply(3, 4, "The result is:"))
    println(labelMultiply(3, 4))
    println(labelMultiply(label = "Here's the result:", operand2 = 3, opearand1 = 4)) // named arguments

    val emp = Employee("Jane")
    println(emp.upperCaseFirstName())

    val car1 = Car("blue", "toyota", 2015)
    val car2 = Car("red", "ford", 2016)
    val car3 = Car("blue", "mercedes", 2020)

    printColors(car1, car2, car3, str = "Color: ")

    val numbers = arrayOf(1, 2, 3) // use varArg


    val manyCars = arrayOf(car1, car2, car3)

    printColors(*manyCars) // spread operator: * unpacked the array and pass the elements

    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for (c in lotsOfCars) {
        println(c)
    }

    println(Utils().upperFirstAndLast("this is all in lowercase"))
    println("this is all in lowercase".upperFirstAndLast())

}

fun String.upperFirstAndLast(): String {
    val upperFirst = substring(0, 1).uppercase() + substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            substring(upperFirst.length - 1, upperFirst.length).uppercase()
}

// vararg not must last position, but need use named argument the other arguments
fun printColors(vararg cars: Car, str: String) {
    for (car in cars) {
        println(car.color);
    }
}

// can call printColors("Color", car1, car2) // without named arguments if vararg is last
fun printColors(str: String, vararg cars: Car) {
    for (car in cars) {
        println(car.color);
    }
}

fun printColors(vararg cars: Car) {
    for (car in cars) {
        println(car.color);
    }
}

fun whatever() = 3 * 4

//fun labelMultiply(opearand1: Int, operand2: Int, label: String): String { block body
//    return ("$label ${opearand1 * operand2}")
//}

//fun labelMultiply(
//    opearand1: Int, operand2: Int,
//    label: String = "The answer is:"
//) = // expression body
//    "$label ${opearand1 * operand2}"


inline fun labelMultiply(
    opearand1: Int, operand2: Int,
    label: String = "The answer is:"
) = // expression body
    "$label ${opearand1 * operand2}"


class Employee(val firstName: String) {

    fun upperCaseFirstName() = firstName.uppercase()
}

data class Car(val color: String, val model: String, val year: Int) {

}