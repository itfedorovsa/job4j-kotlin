package ru.job4j.lambda

data class Account(private val name: String, private val balance: Int) {
    fun getName() = name
    fun getBalance() = balance
}

fun filterBy(list: List<Account>, targetName: String, balanceMoreThan: Int): List<Account> {
    return list.filter { targetName.equals(it.getName()) && it.getBalance() > balanceMoreThan }
}

fun main() {
    val accounts = listOf(
        Account("John", 0),
        Account("Jim", 100),
        Account("Julia", 5),
        Account("Jade", 0),
        Account("John", 10)
    )
    filterBy(accounts, "John", 0).forEach { println(it) }
}