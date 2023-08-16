package ru.job4j.oop.tracker

import java.util.*

object StartUI {

    fun init(tracker: Tracker) {
        val scanner = Scanner(System.`in`)
        var run = true
        while (run) {
            showMenu()
            print("Select: ")
            val select: Int = scanner.nextLine().toInt()
            when (select) {
                0 -> {
                    println("=== Create a new Item ===")
                    print("Enter name: ")
                    val name: String = scanner.nextLine()
                    val item = Item(name = name)
                    val addedItem = tracker.add(item)
                    println("Added item: $addedItem")
                }

                1 -> {
                    println("=== Show all items ===")
                    val items: List<Item> = tracker.findAll()
                    if (items.isNotEmpty()) items.forEach { println(it) } else println("Storage is empty")
                }

                2 -> {
                    println("=== Program terminated ===")
                    run = false
                }
            }
        }
    }

    private fun showMenu() {
        val menu = arrayOf(
            "Add new Item", "Show all items", "Exit Program"
        )
        println("Menu:")
        for (index in menu.indices) {
            println(index.toString() + ". " + menu[index])
        }
    }

}

fun main() {
    val tracker = Tracker()
    StartUI.init(tracker)
}