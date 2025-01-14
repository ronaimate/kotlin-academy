package academy.learnprogramming.iokotlin

import java.io.DataInputStream
import java.io.File
import java.io.FileInputStream

fun main() {


    val di = DataInputStream(FileInputStream(File("testfile.bin")))
    var si: String

    try {
        while (true) {
            si = di.readUTF()
            println(si)
        }
    } catch (e: Exception) {

    }
}