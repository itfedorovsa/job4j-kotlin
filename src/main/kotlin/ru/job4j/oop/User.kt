package ru.job4j.oop

class User(
    var name: String = "",
    var surname: String = "",
    var email: String = "",
    var password: String = "",
    var address: String = ""
) {

    fun show() {
        println("$name $email")
    }
}

fun main() {
    val user = User(email = "example@gmail.com", password = "secret")
    user.show()
}