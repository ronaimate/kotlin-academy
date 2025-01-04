package academy.learnprogramming.generics.contravariance

fun main() {

    val flowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) = println("I'm tending a flower a ${flower.name}!")
    }

    val roseGarden = Garden<Rose>(listOf(Rose(), Rose()), flowerTender)
    roseGarden.tendFlower(0)

    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil(), Daffodil(), Daffodil()), flowerTender)
    daffodilGarden.tendFlower(2)
}


class Garden<T : Flower>(val flowers: List<T>, val flowerCare: FlowerCare<T>) {
    fun pickFlower(i: Int) = flowers[i]
    fun tendFlower(i: Int) {
        flowerCare.prune(flowers[i])
    }
}

open class Flower(val name: String) {}

class Rose : Flower("Rose") {}

class Daffodil : Flower("Daffodil") {}

interface FlowerCare<in T> {
    fun prune(flower: T)
//    fun pick(): T can't do it
}