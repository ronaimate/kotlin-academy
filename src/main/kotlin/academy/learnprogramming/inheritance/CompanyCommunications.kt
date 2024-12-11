package academy.learnprogramming.inheritance

import java.time.Year

fun main() {

    println(Department.ACCOUNTING.getDepInfo())

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    println(SomeClass.SomeCompanion.accessPrivateVar()) // full debault, default name: Companion
    println(SomeClass.accessPrivateVar()) // short

    val someClass1 = SomeClass.justAssign("this is the string as is")
    val someClass2 = SomeClass.upperOrLowerCase("this isn't the string as is", false)

    println(someClass1.someString)
    println(someClass2.someString)


    val myAnonymousObject = object {
        val valueInAnonymousObject = "This is anonymous object"
        fun functionInAnonymousFunction(): String {
            return "This is a function in anonymous object"
        }
    }
    println(myAnonymousObject.valueInAnonymousObject)
    println(myAnonymousObject.functionInAnonymousFunction())


    var thisIsMutable = 45

    wantsSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            thisIsMutable++
            return "This is from mustImplement: ${num * 100}"
        }
    })

    println(thisIsMutable)
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resouces", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 3),
    SALES("Sales", 20);

    fun getDepInfo() = "The $fullName department has $numEmployees employees"
}

object CompanyCommunications {

    val curentYear = Year.now().value

    fun getTagLine() = "Out company Rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 Out Company. All reights reserved."

}

/*
java code for static method:
public class SomeClass {

    private static int privateVar = 6;

    public static void accessPrivateVar() {
        System.out.println("I'm accessing privateVar: " + privateVar);
    }
}
 */

class SomeClass private constructor(val someString: String) {

    companion object SomeCompanion {
        private val privateVar = 6

        fun accessPrivateVar() = "I'm accessing privateVar: $privateVar"

        fun justAssign(str: String) = SomeClass(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClass {
            return if (lowerCase) {
                SomeClass(str.lowercase())
            } else {
                SomeClass(str.uppercase())
            }
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantsSomeInterface(si: SomeInterface) = println("Printing from wantsSomeInterface ${si.mustImplement(22)}")