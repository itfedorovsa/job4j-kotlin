package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    val targetName = "John"
    val targetBalance = 0

    @Test
    fun when1Match() {
        val accounts = listOf(
            Account("John", 0),
            Account("Jim", 100),
            Account("Julia", 5),
            Account("Jade", 0),
            Account("John", 10)
        )
        assertThat(filterBy(accounts, targetName, targetBalance)).isEqualTo(listOf(Account("John", 10)))
    }

    @Test
    fun when2Matches() {
        val accounts = listOf(
            Account("John", 20),
            Account("Jim", 100),
            Account("Julia", 5),
            Account("Jade", 0),
            Account("John", 10)
        )
        assertThat(filterBy(accounts, targetName, targetBalance))
            .isEqualTo(listOf(Account("John", 20), Account("John", 10)))
    }

    @Test
    fun whenNoMatches() {
        val accounts = listOf(
            Account("John", 0),
            Account("Jim", 100),
            Account("Julia", 5)
        )
        assertThat(filterBy(accounts, targetName, targetBalance))
            .isEqualTo(listOf<Account>())
    }
}