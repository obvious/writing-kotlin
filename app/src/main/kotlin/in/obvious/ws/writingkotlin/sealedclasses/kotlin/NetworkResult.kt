package `in`.obvious.ws.writingkotlin.sealedclasses.kotlin

sealed class NetworkResult {
    object Failure : NetworkResult()

    data class Loading(val canShowProgress: Boolean) : NetworkResult()

    data class Success(val listOfNames : List<String>) : NetworkResult()
}
