package academy.learnprogramming.ifexpression

fun main() {

//    var num: Int
//
//    if(someCondition) { // full
//        num = 50
//    } else {
//        num = 592
//    }
//
//    num = someCondition ? 50 : 592 // in java
//    num if (someCondition) 50 else 592 // in kotlin

    val someCondition = 1 < 2
//    val num = if (someCondition) 50 else 592


    val num2 = if (someCondition) { // 'if' must have both main and 'else' branches if used as an expression
        println("something")
        50
    } else {
        println("something else")
        592
    }

    println(num2)


    println("The result of the if expression is ${
        if (someCondition) { 
            println("something")
            50
        } else {
            println("something else")
            592
        }
    }")
}