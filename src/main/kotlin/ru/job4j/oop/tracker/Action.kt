package ru.job4j.oop.tracker

interface Action {

    fun name(): String
    fun execute(tracker: Tracker, input: Input): Boolean
}