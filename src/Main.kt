fun main() {
    val value: Int = max(5, 3)
    println("Max value is : $value")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
