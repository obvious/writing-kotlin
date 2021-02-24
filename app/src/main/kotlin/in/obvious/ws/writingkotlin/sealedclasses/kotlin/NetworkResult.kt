package `in`.obvious.ws.writingkotlin.sealedclasses.kotlin

import java.lang.IllegalStateException

sealed class NetworkResult {
    object Failure : NetworkResult()

    data class Loading(val canShowProgress: Boolean) : NetworkResult()

    data class Success(val listOfNames : List<String>) : NetworkResult()
}

fun handleResult(result: NetworkResult) {
    when(result) {
        NetworkResult.Failure -> TODO()
        is NetworkResult.Loading -> TODO()
        is NetworkResult.Success -> TODO()
    }
}
