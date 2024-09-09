fun printAll(string: Collection<String>) {
    for(s in string) print("$s ")
    println()
}

fun main(args: Array<String>) {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}