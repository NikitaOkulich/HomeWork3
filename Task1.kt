package hw

class Task
fun foo() {
val str : String = "believe"
println(isUpperCase(str))
}

fun isUpperCase(str: String): Boolean {
    str.forEach {if(it.isUpperCase()) return true
    }
return false
}
