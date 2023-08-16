package ru.job4j.oop.tracker

object StartUI {

    fun init(tracker: Tracker, input: Input, actions: List<Action>) {

        var run = true
        while (run) {
            showMenu(actions)
            val select: Int = input.askInt("Select: ")
            if (select < 0 || select >= actions.size) {
                println("Wrong input. Try again.")
                continue
            }
            val action = actions[select]
            run = action.execute(tracker, input)
        }
    }

    private fun showMenu(actions: List<Action>) {
        println("Menu:")
        for (index in actions.indices) {
            println("$index. ${actions[index].name()}")
        }
    }
}

fun main() {
    val tracker = Tracker()
    val input = ConsoleInput()
    val actions = listOf(CreateAction(), FindAllAction(), ExitAction())
    StartUI.init(tracker, input, actions)
}