package ru.job4j.oop.tracker

class Actions {
    companion object Actions {
        fun addItem(tracker: Tracker, input: Input): Boolean {
            println("=== Create a new Item ===")
            val item = Item(name = input.askStr("Enter name: "))
            val addedItem = tracker.add(item)
            println("Added item: $addedItem")
            return true
        }

        fun findAllItems(tracker: Tracker): Boolean {
            println("=== Show all items ===")
            val items: List<Item> = tracker.findAll()
            if (items.isNotEmpty()) {
                for (item in items) {
                    println(item)
                }
            } else {
                println("The storage doesn't contain any items yet")
            }
            return true
        }

        fun terminate(): Boolean {
            return false
        }

    }
}
