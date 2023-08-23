package ru.job4j.lambda

class DbApply {
    private val pool = Pool()

    fun config() {
        pool.apply {
            driver = "org.postgres.Diver"
            url = "jdbc://localhost:5432/job4j"
            username = "postgres"
            password = "password"
        }
    }
}

fun main() {
    val db = DbApply()
    db.config()
}