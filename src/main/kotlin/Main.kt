fun main() {
    val person = Person("November", false)
    person.name = "new Name"
    person.isMarried = true
    println("person name : ${person.name}, isMarried : ${person.isMarried}")
}

fun max(a: Int, b: Int): Int = if (a > b) a else b
