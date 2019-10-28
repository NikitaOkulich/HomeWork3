package hw

import java.lang.StringBuilder

class Task3
fun main(){
    val str2:String = "BelieveBelieve"
    println(reverseCaseString(str2))
    }

fun reverseCaseString(str2: String): String {
    var reversedString: StringBuilder = StringBuilder("")
    str2.forEach { if (it.isUpperCase()) {
        reversedString.append(it.toLowerCase())
    }
        else {
        reversedString()
    }
    }
    return reversedString.toString()

}

private operator fun StringBuilder.invoke() {

}







