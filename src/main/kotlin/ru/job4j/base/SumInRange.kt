package ru.job4j.base

fun add(start: Int, finish: Int): Int {
    var rsl = 0
    for (value in start..finish) {
        rsl += value
    }
    return rsl
}

fun show(start: Int, finish: Int) {
    for (value in start until finish step 2) {
        println(value)
    }
}

fun showBackward(start: Int, finish: Int) {
    for (value in finish downTo start step 3) {
        println(value)
    }
}

fun draw(size: Int) {
    var start = 0
    var finish = size - 1
    for (value in 0 until size) {
        for (v in 0 until size) {
            if (v == start || v == finish) print('*') else print(' ')

        }
        start++
        finish--
        println()
    }
}

fun main() {
    val rsl = plus(0, 10)
    println("Sum from 0 to 10 is $rsl")
    show(0, 10)
    showBackward(0, 10)
    draw(7)
}