package ru.job4j.safe

class Npe {

    fun print(foo: Foo?) {
        val text = foo?.name()
        println(text)
    }

    class Foo {
        fun name(): String = "Foo foo foo"
    }
}

fun main() {
    Npe().print(null)
}