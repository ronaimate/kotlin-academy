package academy.learnprogramming.iokotlin

import java.io.File

fun main() {

    // new InputStreamReader(new FileInputStreamReader(new File("testfile.txt")), "UTF-8")

//    val reader = File("testfile.txt").reader()
//    val lines = reader.readText()
//    println(lines)
//    reader.close()

//    val lines = File("testfile.txt").reader().use { it.readText() }
//    println(lines)

//    val lines = File("testfile.txt").bufferedReader().use { it.readText() }
//    println(lines)

//    val lines = File("testfile.txt").readText()
//    println(lines)

//    File("testfile.txt").useLines { it.forEach { println(it) } }
    File("testfile.txt").forEachLine { println(it) }

}