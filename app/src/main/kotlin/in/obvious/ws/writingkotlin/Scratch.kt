package `in`.obvious.ws.writingkotlin

import `in`.obvious.ws.writingkotlin.dataclasses.java.Method
import `in`.obvious.ws.writingkotlin.dataclasses.kotlin.NetworkRequest
import `in`.obvious.ws.writingkotlin.lambdas.java.Account
import `in`.obvious.ws.writingkotlin.lambdas.kotlin.Bank
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.time.LocalDate
import java.util.*
import kotlin.collections.ArrayList

fun scratch() {
    val request = NetworkRequest(
        url = "127.0.0.1",
        timeout = 45_000
    )

    val post = request.copy(method = Method.POST, body = "Hello, World!")
}

@Suppress("JavaCollectionsStaticMethod", "MoveLambdaOutsideParentheses")
@RequiresApi(Build.VERSION_CODES.O)
fun scratchForLambdas() {
    val accounts = ArrayList<Account>()

    accounts.add(Account(1, 5000, LocalDate.parse("1990-01-01")))
    accounts.add(Account(2, 10000, LocalDate.parse("1970-05-03")))

    // Sort by balance
    Collections.sort(accounts) { o1, o2 -> (o1.balance - o2.balance).toInt() }
    Collections.sort(accounts) { o1, o2 -> o1.accountCreationDate.compareTo(o2.accountCreationDate) }

    // Create a Bank
    val firstBank = Bank(accounts, { addedAccount -> Log.d("LAMBDAS", "On account added: $addedAccount")})
    val secondBank = Bank(mutableListOf()) { Log.d("LAMBDAS", "On account added: $it")}
}
