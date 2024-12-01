package academy.learnprogramming.challenge2

fun main() {
    val float1: Float? = -3847.384f
    val float3: Float? = -3847.384.toFloat()

    val shortArray = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    val intArray = Array<Int?>(40) { i -> (i + 5) * 5 }

    val charArray = charArrayOf('a', 'b', 'c')
    Challenge2().method1(charArray)

//    val charArray2 = Array<Char>(1) { i -> 'a' }
//    Challenge2().method1(charArray2) not possible, when java method parameter is primitive, required: charArrayOf...

    val x: String? = "I AM IN UPPERCASE"
    val z = x?.lowercase() ?: "I give up!"

    x?.let { println(it.lowercase().replace("am", "am not")) }


    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble()
}