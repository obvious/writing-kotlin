package `in`.obvious.ws.writingkotlin.nullsafety.kotlin

fun main() {
    // nullable and non-nullable types
    var number: Int = 6
    val unknownNumber: Int?
    val anotherNumber: Int? = null

    // safe calls
    val name: String? = someFunctionReturningAStringThatCanBeNull()
    val lengthOfName = name?.length // this will compile

    // elvis operator
    val cookieName: String? = null
    val l: Int = if (cookieName != null) cookieName.length else -1
    val usingElvis = cookieName?.length ?: -1  // elvis / Java Optional.getOrElse()

    // not-null assertion operator
    val npeLovers = cookieName!!.length
}

fun someFunctionReturningAStringThatCanBeNull(): String? {
    return null
}
