package hw

class Task2
fun main(){


    val str1: String = "BelieveBelieve"
    println(sizeUpperCase(str1))

}

fun sizeUpperCase(str1: String): Int {
    var a: Int = 0

    str1.forEach {
        if (it.isUpperCase()) {
            a++
        }
    }
    return a
}

