package ru.job4j.oop.tracker

class FindAllAction : Action {
    override fun name(): String {
        return "Find all items"
    }

    override fun execute(tracker: Tracker, input: Input): Boolean {
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
}