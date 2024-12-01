package academy.learnprogramming.nullreferences

import java.util.*

fun main() {

    val str: String? = null // nullable
//    val str4 = str!!.uppercase(Locale.getDefault()) // not null assertion
//    if(str == null) {
//        throw exception
//    } else {
//        str.uppercase(Locale.getDefault())
//    }

//    if(str != null) { // we use the safe call operator instead
//        str.uppercase(Locale.getDefault())
//    }

    println("What happens wwhen we do this: ${str?.uppercase(Locale.getDefault())}")
//    if (str == null) {
//        null
//    } else {
//        str.uppercase(Locale.getDefault())
//    }


//    val countryCode: String? = bankBranch?.address?.country?.countryCode

    val str2 = str ?: "This is default value!!!"
//    if(str ==null) {
//        str2 = "This is..."
//    } else {
//        str2 = str
//    }
    println(str2)

//    val whatever = bankBranch?.address?.country? ?: "US"

    val something: Any = arrayOf(1, 2, 3, 4)
    val str3 =
        something as? String // when use safe cast operator i need use safe call operator: val str3: String? = ...     | str3?.toUpp...
    println(str3)
    println(str3?.uppercase(Locale.getDefault()))


//    val str5 = str!!
//    val str6 = str5.uppercase(Locale.getDefault()) // NPE: Line when str!!

//    val countryCode = bankBranch!!.address!!.country!! // !!! do not do this, bc we dont know what is null


    val text: String? = "This isn't null"
//    if (text != null) {
//        printText(text)
//    }
    str?.let { printText(it) }

    val text2: String? = null
    val anotherText = "This isn't nullable"
    println(text2 == anotherText)


    val nullableInts = arrayOfNulls<Int>(5)
    for (i in nullableInts) {
        println(i)
    }
    println(nullableInts[3])
//    println(nullableInts[3].plus(2)) // nullableInts[3] is null we need use ? or !!
}

fun printText(text: String) {
    print(text)
}