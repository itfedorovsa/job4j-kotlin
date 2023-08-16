package ru.job4j.oop.tracker

interface Input {
    fun askInt(question: String): Int
    fun askStr(question: String): String
}
