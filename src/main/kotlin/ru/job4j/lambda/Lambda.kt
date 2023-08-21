package ru.job4j.lambda

fun main() {
    val max = { x: Int, y: Int -> if (x > y) x else y }
    val rsl = max(1, 2)
    println(rsl)

    val inc = { x: Int -> x + 1 }
    println(inc(1))

    val sqrt = { x: Int -> x * x }
    println(sqrt(3))
}

