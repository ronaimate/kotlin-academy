package academy.learnprogramming.functions

class Utils {

    fun upperFirstAndLast(str: String): String {
        val upperFirst = str.substring(0, 1).uppercase() + str.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1) +
                str.substring(upperFirst.length - 1, upperFirst.length).uppercase()
    }
}