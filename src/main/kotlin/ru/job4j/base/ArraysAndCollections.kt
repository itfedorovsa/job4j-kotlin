package ru.job4j.base

fun createArray() {
    val names = arrayOfNulls<String>(5)
    names[0] = "Name"
    for (name in names) {
        println(name?.length)
    }
}

fun createArrayList() {
    val names = ArrayList<String>()
    names.add("Name")
    for (name in names) {
        println(name)
    }
}

fun iterateWithIndex() {
    val names = arrayOfNulls<String>(5)
    names[0] = "Name"
    for ((index, name) in names.withIndex()) {
        println("$index: " + name?.length)
    }
}

fun defragment(array: Array<String?>): Array<String?> {
    val defragmented = arrayOfNulls<String?>(array.size)
    var counter = 0
    for (name in array) {
        if (name != null) {
            defragmented[counter] = name
            counter++
        }
    }
    return defragmented
}

fun main() {
    createArray()
    createArrayList()
    iterateWithIndex()
    defragment(arrayOf(null, "1", null, "3", null)).forEach { println(it) }
}