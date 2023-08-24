package ru.job4j.lambda

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.time.LocalDate

class CompanyTest {

    @Test
    fun when2Companies() {
        val companies = listOf(
            Company("Name1", "Country1, City1"),
            Company("Name2", "Country2, City2")
        )
        assertThat(toStr(companies)).isEqualTo(
            listOf(
                "Name1, Country1, City1, " + LocalDate.now(),
                "Name2, Country2, City2, " + LocalDate.now()
            )
        )
    }

    @Test
    fun whenEmpty() {
        val companies = listOf<Company>()
        assertThat(toStr(companies)).isEqualTo(listOf<String>())
    }
}