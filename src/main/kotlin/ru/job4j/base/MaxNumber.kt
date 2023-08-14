package ru.job4j.base

/* simplification chain of "max" function
fun max1(first: Int, second: Int) : Int {
    val rsl : Int
    if (first > second) {
        rsl = first
    } else {
        rsl = second
    }
    return rsl
}

fun max2(first: Int, second: Int) : Int {
    val rsl = if (first > second) {
        first
    } else {
        second
    }
    return rsl
}

fun max3(first: Int, second: Int) : Int {
    return if (first > second) first else second
}*/

fun max(first: Int, second: Int) = if (first > second) first else second

fun max(first: Int, second: Int, third: Int): Int {
    val temp = max(first, second)
    return if (temp > third) temp else third
}

fun main() {
    val max = max(2, 5, 3)
    println("Max of 2, 5, 3 is $max")
}

