package `in`.obvious.ws.writingkotlin.dataclasses.kotlin

import `in`.obvious.ws.writingkotlin.dataclasses.java.Method;

data class NetworkRequest(
    val url: String,
    val method: Method = Method.GET,
    val body: String? = null,
    val timeout: Long = 30_000
)
