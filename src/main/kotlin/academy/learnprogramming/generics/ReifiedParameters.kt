package academy.learnprogramming.generics

import java.math.BigDecimal

fun main() {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5), "fall", BigDecimal(-38938993.123))
    val bigDecimalsOnly = getElementsOfType<String>(mixedList)
    bigDecimalsOnly.forEach { println(it) }


}


// reified: it is used when the type needs to be checked at runtime within the function
// only type parameters of inline functions can be reified
inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }

    return newList

}