package ru.job4j.service

import org.assertj.core.api.Assertions.assertThat

import org.junit.jupiter.api.Test

class ParseNumberTest {
    @Test
    fun onlyNumber() {
        assertThat(ParseNumber("123").result()).isEqualTo(123)
    }

    @Test
    fun startSharp() {
        assertThat(ParseNumber("#123").result()).isEqualTo(123)
    }

    @Test
    fun nameNumber() {
        assertThat(ParseNumber("Name [#123]").result()).isEqualTo(123)
    }

    @Test
    fun withoutNumber() {
        assertThat(ParseNumber("Only name").result()).isEqualTo(-1)
    }
}