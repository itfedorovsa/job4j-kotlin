package ru.job4j.oop.inheritance

class Pilot : Profession() {
    override fun action() {
        super.action()
        println("Action from Pilot")
    }

    override fun getName(): String {
        return "Pilot"
    }
}