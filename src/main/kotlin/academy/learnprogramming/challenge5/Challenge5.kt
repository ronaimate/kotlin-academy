package academy.learnprogramming.challenge5


fun main() {

    val joe = Person("Joe", "Jones", 45)
    val jane = Person("Jane", "Smith", 12)
    val mary = Person("Mary", "Wilson", 70)
    val john = Person("John", "Adams", 32)
    val jean = Person("Jane", "Smithson", 67)

    val people = mapOf(
        "Jones" to joe,
        "Smith" to jane,
        "Wilson" to mary,
        "Adams" to john,
        "Smithson" to jean,
    )

    println(people.count { it.value.lastName.startsWith("S") })
    val namePairs = people.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)

    val firstNames = people.map { it.value.firstName }
    val lastNames = people.map { it.value.lastName }
    val namePairs2 = firstNames.zip(lastNames)
    println(namePairs2)

    people.also {
        it.map { println("${it.value.firstName} is ${it.value.age} years old") }
    }


    val (fName, lName, age) = joe /* Destructuring declarations */
    println("fName = $fName, lName = $lName, age = $age")


    val list1 = listOf(1, 4, 9, 15, 33)
    val list2 = listOf(4, 55, -83, 15, 22, 101)

//    val list3 = list1.intersect(list2)
//    val list3 = list1.filter { it in list2 }
    val list3 = list1.filter { list2.contains(it) }
    println("list3 = $list3")

    var regularPaper = Box<Regular>()
    var paper = Box<Paper>()
    //paper = regularPaper - <out T>

    regularPaper = paper // - <in T>
}


class Person(val firstName: String, val lastName: String, val age: Int) {

    // or data class
    operator fun component1() = firstName
    operator fun component2() = lastName
    operator fun component3() = age

}


class Box<in T> {

    // out - covariance
//    fun takePaper(): T {
//
//    }

    // in - contravariance
//    fun addPaper(paper: T) {
//
//    }

}

open class Paper {}

class Regular : Paper() {}

class Premium : Paper() {}