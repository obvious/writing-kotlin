package `in`.obvious.ws.writingkotlin

import `in`.obvious.ws.writingkotlin.dataclasses.java.Method
import `in`.obvious.ws.writingkotlin.dataclasses.kotlin.NetworkRequest
import `in`.obvious.ws.writingkotlin.lambdas.java.Account
import `in`.obvious.ws.writingkotlin.lambdas.kotlin.Bank
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.io.File
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

fun scratch() {
    val request = NetworkRequest("127.0.0.1", method = Method.POST, timeout = 45_000, body = "Hello, World!")

    val post = request.copy(method = Method.GET, body = null)
}

@Suppress("JavaCollectionsStaticMethod", "MoveLambdaOutsideParentheses")
@RequiresApi(Build.VERSION_CODES.O)
fun scratchForLambdas() {
    val accounts = ArrayList<Account>()

    accounts.add(Account(1, 5000, LocalDate.parse("1990-01-01")))
    accounts.add(Account(2, 10000, LocalDate.parse("1970-05-03")))

    // Sort by balance
    Collections.sort(accounts) { o1, o2 -> (o1.balance - o2.balance).toInt() }

    // Sort by date
    Collections.sort(accounts) { o1, o2 -> o1.accountCreationDate.compareTo(o2.accountCreationDate) }

    // Create a Bank
    val firstBank = Bank(
        accounts = accounts,
        accountAddedListener = { addedAccount -> Log.d("LAMBDAS", "On account added: $addedAccount")},
        accountRemovedListener = {}
    )
    val secondBank = Bank(accounts = mutableListOf(),
        accountRemovedListener = { Log.d("LAMBDAS", "On account added: $it")},
        accountAddedListener = {}
    )
}

fun scratchForFileIO() {
    val file = File("data.txt")

    val content = file.readText()
    file.writeText("Hello, World!")
    file.appendText("Hi, again!")

    val countOfA = file.readText()
        .toLowerCase(Locale.ENGLISH)
        .count { it == 'a' }
}
