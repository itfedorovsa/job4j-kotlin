package ru.job4j.lambda

class EmailService {

    fun emailTo(message: Message): String {
        return with(StringBuilder()) {
            append("Subject : ").append(message.email).append(", ")
            append("Body : ").append("Hello, ").append(message.email).append(", ")
            append("You win!")
        }.toString()
    }
}

fun main() {
    val emailService = EmailService()
    println(emailService.emailTo(Message("Raccoon", "John")))
}