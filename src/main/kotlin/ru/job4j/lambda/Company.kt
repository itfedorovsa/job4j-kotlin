package ru.job4j.lambda

import java.time.LocalDateTime

data class Company(val name: String, val address: String, val created: LocalDateTime = LocalDateTime.now())

fun main() {
    val companies = listOf(
        Company("Name1", "Country1, City1"),
        Company("Name2", "Country2, City2"),
        Company("Name3", "Country3, City3")
    )
    companies.map { "${it.name}, ${it.address}, ${it.created}"}.forEach { println(it)}
}