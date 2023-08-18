package ru.job4j.oop.inheritance

class Doctor : Profession() {
    override fun action() {
        super.action()
        println("Action from Doctor")
    }

    override fun getName(): String {
        return "Doctor"
    }
}