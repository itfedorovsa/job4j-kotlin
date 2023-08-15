package ru.job4j.oop.tracker

class Tracker {
    private var ids: Int = 1
    private val items: ArrayList<Item> = ArrayList()


    fun add(item: Item): Item {
        item.id = ids++
        items.add(item)
        return item
    }

    fun findById(id: Int): Item? {
        var rsl: Item? = null
        for (name in items) {
            val item: Item = name
            if (item.id == id) {
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