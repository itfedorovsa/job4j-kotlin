package ru.job4j.oop.tracker

object StartUI2 {

    fun init(tracker: Tracker, input: Input) {
        var run = true
        while (run) {
            showMenu()
            val select = input.askInt("Select: ")
            when (select) {
                0 -> {
                    Actions.addItem(tracker, input)
                }

                1 -> {
                    Actions.findAllItems(tracker)
                }

                2 -> {
                    run = Actions.terminate()
                }
            }
        }
    }

    private fun showMenu() {
        val menu = arrayOf(
            "Add new Item", "Show all items", "Exit Program"
        )
        for ((index, _) in menu.withIndex()) {
            println("$index. ${menu[index]}")
        }
    }
}

fun main() {
    val tracker = Tracker()
    val input = ConsoleInput()
    StartUI2.init(tracker, input)
}