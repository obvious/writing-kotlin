package `in`.obvious.ws.writingkotlin.lambdas.kotlin

import `in`.obvious.ws.writingkotlin.lambdas.java.Account

class Bank(
    private val accounts: MutableList<Account>,
    private val accountAddedListener: (Account) -> Unit
) {

    fun addAccount(account: Account) {
        accounts.add(account)
        accountAddedListener(account)
    }
}
