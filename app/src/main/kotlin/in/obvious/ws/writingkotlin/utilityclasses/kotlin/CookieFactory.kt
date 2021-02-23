package `in`.obvious.ws.writingkotlin.utilityclasses.kotlin

class CookieFactory {
    fun makeChocolateCookie(amountOfProtein: Int): Int {
        return amountOfProtein
    }
}

fun CookieFactory.makeSugarCookie(amountOfProtein: Int): Int {
    return amountOfProtein
}

fun main() {
    val cookieFactory = CookieFactory()
    val chocoCookieCalorie = cookieFactory.makeChocolateCookie(55)
    println("This cookie has $chocoCookieCalorie number of calories")

    val sugerCookieCalorie = cookieFactory.makeSugarCookie(95)
    println("This cookie has $sugerCookieCalorie number of calories")
}

