package ru.job4j.base

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CalcJUnit5Test {
    @Test
    fun when1Plus1() {
        assertThat(plus(1, 1)).isEqualTo(2)
    }

    @Test
    fun when1Minus1() {
        assertThat(subtract(1, 1)).isEqualTo(0)
    }

    @Test
    fun when2Multi2() {
        assertThat(multi(2, 2)).isEqualTo(4)
    }

    @Test
    fun when2Div2() {
        assertThat(divide(2, 2)).isEqualTo(1)
    }
}