package ru.job4j.oop.tracker

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TrackerTest {

    @Test
    fun whenAdd() {
        val tracker = Tracker()
        tracker.add(Item(0, "ItemName"))
        assertEquals(tracker.findAll().size, 1)
    }

    @Test
    fun whenFindById() {
        val tracker = Tracker()
        tracker.add(Item(0, "ItemName"))
        assertEquals(tracker.findById(0)?.getName(), "ItemName")
    }

    @Test
    fun whenFindAll() {
        val tracker = Tracker()
        tracker.add(Item(0, "ItemName1"))
        tracker.add(Item(0, "ItemName2"))
        assertEquals(tracker.findAll().size, 2)
    }
}