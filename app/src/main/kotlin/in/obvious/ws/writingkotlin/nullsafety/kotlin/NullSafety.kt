package `in`.obvious.ws.writingkotlin.nullsafety.kotlin

class NullSafety {
    private val phoneNumber: String? = loadPhoneNumber()

    fun main() {
        if (phoneNumber != null) {
            callUser(phoneNumber = phoneNumber)
        }
    }

    private fun callUser(phoneNumber: String) {

    }

    private fun loadPhoneNumber(): String? {
        return null
        // return phoneNumber;
    }
}
