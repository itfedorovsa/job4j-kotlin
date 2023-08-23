package stream

import java.util.stream.Collectors

fun count1(list: List<Int>): MutableList<Int> {
    return list
        .stream()
        .filter { it % 2 == 0 }
        .map { it * it }
        .collect(Collectors.toList())
}

fun count2(list: List<Int>): Long {
    return list
        .stream()
        .filter { it > 0 }
        .map { it + 1 }
        .count()
}


fun main() {
    val list1 = listOf(1, 2, 3, 4)
    println(count1(list1))
    val list2 = listOf(-1, -2, 0, 3, 4)
    println(count2(list2))
}