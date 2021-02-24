package `in`.obvious.ws.writingkotlin.dataclasses.kotlin

import java.time.LocalDate

data class Person(val id: Long, val name: String, val dateOfBirth: LocalDate, val emailAddress: String) {

    val hasValidEmailAddress: Boolean by lazy { emailAddress.contains('@') }
}
