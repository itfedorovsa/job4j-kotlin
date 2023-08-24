package ru.job4j.lambda

import java.time.LocalDate

data class Company(
    val name: String,
    val address: String,
    val created: LocalDate = LocalDate.now()
)

fun toStr(list: List<Company>): List<String> = list
    .map { "${it.name}, ${it.address}, ${it.created}" }
    .toList()

fun main() {
    val companies = listOf(
        Company("Name1", "Country1, City1"),
        Company("Name2", "Country2, City2"),
        Company("Name3", "Country3, City3")
    )
    companies
        .map { "${it.name}, ${it.address}, ${it.created}" }
        .forEach { println(it) }
}