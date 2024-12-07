package academy.learnprogramming.inheritance

import java.time.Year

fun main() {
    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())
}

object CompanyCommunications {

    val curentYear = Year.now().value

    fun getTagLine() = "Out company Rocks!"
    fun getCopyrightLine() = "Copyright \u00A9 Out Company. All reights reserved."
}