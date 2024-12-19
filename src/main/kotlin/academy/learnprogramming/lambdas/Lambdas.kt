package academy.learnprogramming.lambdas

fun main() {

//    run { println("I'm in a lambda!") }

    val employees = listOf(
        Employee("John", "Smith", 2012),
        Employee("Jane", "Wilson", 2015),
        Employee("Mary", "Johnson", 2010),
        Employee("Mike", "Jones", 2002),
    )

//    println(employees.minBy { e: Employee -> e.startYear })
//    println(employees.minBy { it.startYear })
    println(employees.minBy(Employee::startYear))

    println(employees.filter { it.startYear > 2005 }.map(Employee::firstName))

    findByLastName(employees, "Wilson")
    findByLastName(employees, "Smitson")

    "Some String".apply somestring@ {
        "Another String".apply {
            println(lowercase())
            println(this@somestring.uppercase())
        }
    }

//    var num = 10
//    run {
//        num += 15
//        println(num)
//    }

    run(::topLevel)


    println(countTo100())

}

fun findByLastName(employees: List<Employee>, lastName: String) {
    employees.forEach returnBlock@ {
        if (it.lastName == lastName) {
            println("Yes, there's an employee with the last name $lastName")
            return@returnBlock // local return only from lambda, not the function, like the break
        }
    }

    println("Nope, there's no employee with the last name $lastName")
}

fun countTo100() =
    StringBuilder().apply { // apply always return the receiver object
        for (i in 1..99) {
            append(i)
            append(", ")
        }
        append(100)
    }.toString()

//fun countTo100() =
//    with(StringBuilder()) { // -> instance to receiver
//        for (i in 1..99) {
//            append(i) // this.append
//            append(", ") // this.append
//        }
//        append(100) // this.append
//        toString() // this.toString
//    }

//fun countTo100(): String {
//    val numbers = StringBuilder()
//    for (i in 1..99) {
//        numbers.append(i)
//        numbers.append(", ")
//    }
//    numbers.append(100)
//    return numbers.toString()
//}

fun topLevel() = println("I'm in a function!")

fun useParameter(employees: List<Employee>, num: Int) = employees.forEach {
    println(it.firstName)
    println(num)
}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)