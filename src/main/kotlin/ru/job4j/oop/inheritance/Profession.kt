package ru.job4j.oop.inheritance

open class Profession {
    open fun action() {
        println("Execute some actions")
    }

    open fun getName(): String {
        return "Profession"
    }
}