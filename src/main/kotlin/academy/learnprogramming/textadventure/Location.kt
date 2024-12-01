package academy.learnprogramming.textadventure

data class Location(val locationId: Int, val description: String) {

    val exists = mutableMapOf<String, Int>()

    init {
        exists["Q"] = 0
    }

    fun addExit(direction: String, destinationId: Int) {
        exists[direction] = destinationId
    }
}