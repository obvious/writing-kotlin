package `in`.obvious.ws.writingkotlin.utilityclasses.kotlin

import android.view.View

fun View.show() {
    this.visibility = View.VISIBLE
}

fun View.hide() {
    this.visibility = View.GONE
}

fun randomUIMethod(view: View) {
    view.show()
    view.hide()
}
