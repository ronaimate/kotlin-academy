package academy.learnprogramming.generics


fun main() {

    val ints = listOf(1, 2, 3, 4, 5)
    val shorts: List<Short?> = listOf(10, 20, 30, 40)
    val floats: List<Float?> = listOf(100.3f, -459.43f)
    val strings = listOf("1", "2", "3", "4")

    if (strings is List<String>) {
        println("This list contains strings")
    }

    var listAny: Any = listOf("str1", "str2", "str3")
    if (listAny is List<*>) { // star projection syntax
        println("Yes, this is a list. Thank you star projection!")
    }

    listAny = listOf(1, 2, 3, 4)
    if (listAny is List<*>) {
        println("This list contains strings")
        val strList = listAny as List<String>
        println(strList[1].replace("str", "string"))
    }

    academy.learnprogramming.generics.coverance.convertToInt(ints)
    convertToInt(shorts)
    convertToInt(floats)
//    convertToInt(strings)

    append(StringBuilder("String 1"), StringBuilder("String 2"))


//    printCollection(shorts)
    printCollection(strings)
}

fun <T : Any> printCollection(collection: List<T>) { // only T only non nullable
    for (item in collection) {
        println(item)
    }
}

fun <T> append(item1: T, item2: T)
        where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}


fun <T : Number?> convertToInt(collection: List<T>) {
    for (num in collection) {
        println("${num?.toInt()}")
    }
}