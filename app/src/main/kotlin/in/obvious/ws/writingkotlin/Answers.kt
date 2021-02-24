package `in`.obvious.ws.writingkotlin

import `in`.obvious.ws.writingkotlin.collections.kotlin.Alignment
import `in`.obvious.ws.writingkotlin.collections.kotlin.Mutant
import `in`.obvious.ws.writingkotlin.collections.kotlin.Rank
import `in`.obvious.ws.writingkotlin.lambdas.java.Account
import `in`.obvious.ws.writingkotlin.lambdas.kotlin.Bank
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import java.lang.Exception
import java.time.LocalDate

// Exercise solution for data classes
data class User(val id: Int, val name: String, val phoneNumber: PhoneNumber, val emailAddress: EmailAddress)

data class PhoneNumber(val number: String, val countryISDCode: String)

data class EmailAddress(val username: String, val emailProvider: String)

fun scratchForDataClasses() {
    val userVinayShenoy: User = User(
        1,
        "Vinay Shenoy",
        PhoneNumber("1234567890", "+91"),
        EmailAddress("vinay", "obvious.in")
    )

    val userWithUpdatedNumber = userVinayShenoy.copy(
        phoneNumber = userVinayShenoy.phoneNumber.copy(number = "0987654321")
    )
}

// Exercise solution for lambdas
@RequiresApi(Build.VERSION_CODES.O)
fun scratchForLambdasInAnswers() {
    val accounts = ArrayList<Account>()

    accounts.add(Account(1, 5000, LocalDate.parse("1990-01-01")))
    accounts.add(Account(2, 10000, LocalDate.parse("1970-05-03")))

    val firstBank = Bank(
        accounts,
        accountRemovedListener = { account -> Log.d("TAG", account.toString()) },
        accountAddedListener = {}
    )

    val secondBank = Bank(
        accounts = accounts,
        accountRemovedListener = { account ->
            if (account.balance > 5000) {
                Log.d("TAG", account.toString())
            }
        },
        accountAddedListener = {}
    )
}

// Exercise solution for null-safety
data class Dessert(val pastry: String, var amountOfCalories: Int? = null) {

    fun setCalories(amountOfCalories: Int?) {
        this.amountOfCalories = amountOfCalories ?: -1
    }
}

@RequiresApi(Build.VERSION_CODES.O)
fun scratchForNullSafety() {
    val pancake = Dessert("Pancake")
}

// Exercise solution for mutants
val mutants = listOf(
    Mutant("Professor X", "Charles Xavier", Alignment.Good, 40, Rank.Leader),
    Mutant("Magneto", "Erik Lehnsherr", Alignment.Evil, 40, Rank.Leader),
    Mutant("Wolverine", "James Howlett", Alignment.Good, 50, Rank.Senior),
    Mutant("Jean Grey", "Jean Grey", Alignment.Good, 15, Rank.Senior),
    Mutant("Shadowcat", "Kitty Pryde", Alignment.Good, 5, Rank.Junior),
    Mutant("Cyclops", "Scott Summers", Alignment.Good, 16, Rank.Senior),
    Mutant("Scarlet Witch", "Wanda Maximoff", Alignment.Evil, 5, Rank.Senior),
    Mutant("Mystique", "Raven Darkholme", Alignment.Evil, 10, Rank.Senior),
    Mutant("Pyro", "John Allerdyce", Alignment.Evil, 5, Rank.Junior)
)

// Find all mutants with 10 or more years of experience
val mutantsWith10MoreExperience = mutants.filter { it.yearsOfExperience >= 10 }

// Find the real names of all the good mutants
val realNamesOfGoodMutants = mutants
    .filter { it.alignment == Alignment.Good }
    .map { it.actualName }

// Concatenate the code names of all the senior mutants with a ", "
val allSeniorMutants = mutants
    .filter { it.rank == Rank.Senior }
    .joinToString { it.codeName }

// Concatenate the code names of all the good and evil mutants separately with a ", "
val allGoodMutants = mutants
    .filter { it.alignment == Alignment.Good }
    .joinToString(", ") { it.codeName }

val allEvilMutants = mutants
    .filter { it.alignment == Alignment.Evil }
    .joinToString(", ") { it.codeName }

// Concatenate these two strings together with a " VS. "
val concatenatedMutants = "$allGoodMutants VS. $allEvilMutants"

// Alternate method to concatenate mutant names
val concatenated = mutants
    .groupBy { it.alignment }
    .map { (_, mutants) -> mutants.joinToString { it.codeName } }
    .joinToString(separator = " VS. ")

// Sealed classes
sealed class Failure {
    data class ServerError(val errorMessage: String? = null) : Failure()
    data class AuthenticationError(val errorMessage: String? = null) : Failure()
    data class Exception(val cause: java.lang.Exception? = null) : Failure()
}

fun scratchForSealedClass() {
    fun doNetworkCall(failure: Failure) {
        when (failure) {
            is Failure.ServerError -> println(failure.errorMessage)
            is Failure.AuthenticationError -> failure.errorMessage
            is Failure.Exception -> failure.cause?.printStackTrace()
        }
    }
}

// Utility classes
class Shape() {
    fun circle() = println("This is a circle")
    fun triangle() = println("This is a triangle")
}

fun Shape.getRadius(radius: Int) = println("Radius of the shape is $radius")

fun scratchForUtilityClass() {
    val shape = Shape()
    println(shape.circle())
    println(shape.triangle())
    println(shape.getRadius(10))
}
