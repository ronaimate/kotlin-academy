package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main() {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)
    val employeeFour = employeeTwo
    println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)

    val x = 0x00101101
    val y = 0x11011011

    val something: Any = employeeFour
    if (something is Employee) {
//        val newEmployee = something as Employee
        println(something.name)
    }


    var number: Int
    number = 10
    number = 20

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smioth"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 500)
    } else {
        employee2 = Employee("Mike Watson", 150)
    }


    println("--- String templates ---")
    println(employee1)

    val change = 4.22
    println("To show the value of change, we use \$change")
    println("$change")
    println("$$change")
    println("$")

    val numerator = 10.99
    val denominator = 20.00
    println("The value of $numerator deivided by $denominator is ${numerator / denominator}")

    println("The employee's id is ${employee1.id}")

    val filePath = """c:\somedir\somedir2"""
    val eggName = "Humpty"
    val nurseryRhyme =
        """$eggName Dumpty sat on the wall
        *$eggName Dumpty had a great fall
        *All the king's hordses and all the king's men
        *Coundn't put $eggName together again."""
    println(nurseryRhyme.trimMargin("*")) // default character: "|"



}

class Employee(var name: String, val id: Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

    override fun toString(): String {
        return "Employee(name=$name, id=$id)"
    }


}