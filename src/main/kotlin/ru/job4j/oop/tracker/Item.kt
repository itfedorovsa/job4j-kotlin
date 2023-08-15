package ru.job4j.oop.tracker

data class Item(private val id: Int = 0, private val name: String = "") {
    fun getId() = this.id
    fun getName() = this.name
}