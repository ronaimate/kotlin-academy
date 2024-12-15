package academy.learnprogramming.imports
// kotlic dont throw error, but use the java standard here: academy.leratnprogramming.helloworld

import academy.learnprogramming.functions.upperFirstAndLast
import academy.learnprogramming.inheritance.CompanyCommunications as Comm
import academy.learnprogramming.inheritance.Department.*
import academy.learnprogramming.inheritance.topLevel as tp


fun main() {
    println("My package doens't match!")
    tp("Hello!")
    println(Comm.getCopyrightLine())
    println(IT.getDepInfo())
    println(SALES.getDepInfo())
    println("a string to work with".upperFirstAndLast())
}

fun anotherTopLevel(str: String) = println(" Another top level functionm: $str")