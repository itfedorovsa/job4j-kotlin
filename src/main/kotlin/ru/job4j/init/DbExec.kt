package ru.job4j.init

import java.sql.Connection
import java.sql.DriverManager
import java.sql.Statement

class DbExec {

    private lateinit var connection: Connection
    private val url: String = "jdbc:postgresql://localhost:5432/some_db"
    private val username: String = "postgres"
    private val password: String = "password"

    fun initConnection() {
        Class.forName("org.postgresql.Driver")
        connection = DriverManager.getConnection(url, username, password)
    }

    fun exec(sql: String): Boolean {
        val statement: Statement = connection.createStatement()
        val rsl = statement.execute(sql)
        statement.close()
        execLog(sql)
        return rsl
    }

    private fun execLog(sql: String) {
        var log = "script is unknown or empty"
        val scriptType = sql.lowercase().split(" ").get(0)
        when (scriptType) {
            "insert" -> log = "insert script executed"
            "update" -> log = "update script executed"
            "select" -> log = "select script executed"
            "delete" -> log = "delete script executed"
        }
        println(log)
    }
}