package ru.job4j.service

class ParseNumber(val number: String) {
    fun result(): Int {
        val num = number.replace(Regex("""[^0-9.]"""), "")
        val rsl: Int
        rsl = if (!num.isEmpty()) {
            num.toInt()
        } else {
            -1
        }
        return rsl
    }

}