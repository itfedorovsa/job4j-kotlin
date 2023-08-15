package ru.job4j.base

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class ArraysAndCollectionsTest {

    @Test
    fun whenEmptyArr() {
        assertContentEquals(defragment(arrayOfNulls<String?>(3)), arrayOfNulls<String?>(3))
    }

    @Test
    fun whenNullAnd1AndNullThen1AndNullAndNull() {
        assertContentEquals(defragment(arrayOf(null, "1", null)), arrayOf("1", null, null))
    }

    @Test
    fun whenNullAnd1And2Then1And2AndNull() {
        assertContentEquals(defragment(arrayOf(null, "1", "2")), arrayOf("1", "2", null))
    }

    @Test
    fun when1And2And3Then1And2And3() {
        assertContentEquals(defragment(arrayOf("1", "2", "3")), arrayOf("1", "2", "3"))
    }
}