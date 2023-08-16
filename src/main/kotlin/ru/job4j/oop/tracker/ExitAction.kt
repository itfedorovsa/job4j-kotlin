package ru.job4j.oop.tracker

class ExitAction : Action {
    override fun name(): String {
        return "Exit Program"
    }

    override fun execute(tracker: Tracker, input: Input): Boolean {
        return false
    }
}