package ru.job4j.oop.tracker

import java.util.ArrayList

class Tracker {
    private var ids = 1
    private val items = ArrayList<Item>()

    fun add(item: Item): Item {
        val tempItem = item.copy(id = ids++)
        items.add(tempItem)
        return tempItem
    }

    fun findById(id: Int): Item? {
        var rsl: Item? = null
        for (name in items) {
            val item: Item = name
            if (item.getId() == id) {
                rsl = item
                break
            }
        }
        return rsl
    }


    fun findAll(): List<Item> {
        return items.toList()
    }
}