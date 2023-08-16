package ru.job4j.oop.tracker

import java.util.*

object StartUI {

    fun init() {
        val scanner = Scanner(System.`in`)
        var run = true
        while (run) {
            showMenu()
            print("Select: ")
            val select: Int = scanner.nextLine().toInt()
            if (select != 2) {
                println("User's choice: $select")
            } else {
                run = false
            }
        }
    }

    private fun showMenu() {
        val menu = arrayOf(
            "Add new Item", "Show all items", "Exit Program"
        )
        println("Menu:")
        for (i in menu.indices) {
            println(i.toString() + ". " + menu[i])
        }
    }
}

fun main() {
    StartUI.init()
}