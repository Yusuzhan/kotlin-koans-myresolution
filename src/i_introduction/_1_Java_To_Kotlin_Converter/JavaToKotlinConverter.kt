package i_introduction._1_Java_To_Kotlin_Converter

import util.TODO

fun todoTask1(collection: Collection<Int>): Nothing = TODO(
    """
        Task 1.
        Rewrite JavaCode1.task1 in Kotlin.
        In IntelliJ IDEA, you can just copy-paste the code and agree to automatically convert it to Kotlin,
        but only for this task!
    """,
    references = { JavaCode1().task1(collection) })


fun task1(collection: Collection<Int>): String {
    var sb: StringBuilder = StringBuilder()
    sb.append("{")
    var it: Iterator<Int> = collection.iterator()
    while (it.hasNext()){
        var e: Int = it.next()
        sb.append(e)
        if (it.hasNext()){
            sb.append(", ")
        }
    }
    sb.append("}")
    println(sb)
    return sb.toString()
}
