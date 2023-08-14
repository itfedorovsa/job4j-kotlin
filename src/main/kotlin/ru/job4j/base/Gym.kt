package ru.job4j.base

fun fitness(jim: Int, john: Int): Int {
    var month = 0
    var powerJim = jim
    var powerJohn = john
    while (powerJim < powerJohn) {
        powerJim *= 3
        powerJohn *= 2
        month++
    }
    return month
}

fun main() {
    val rsl = fitness(50, 90)
    println("Month : $rsl")
}