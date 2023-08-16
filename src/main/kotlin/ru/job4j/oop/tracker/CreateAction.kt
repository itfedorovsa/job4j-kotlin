package ru.job4j.oop.tracker

class CreateAction : Action {
    override fun name(): String {
        return "Add new Item"
    }

    override fun execute(tracker: Tracker, input: Input): Boolean {
        println("=== Create a new Item ===")
        val item = Item(name = input.askStr("Enter name: "))
        val addedItem = tracker.add(item)
        println("Added item: $addedItem")
        return true
    }
}