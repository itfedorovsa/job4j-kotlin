package ru.job4j.lambda

class HtmlTable {

    fun table(row: Int, cell: Int): String {
        val table = StringBuilder()
        table.append("<table>")
        for (rows in 0..row) {
            table.append("<tr>")
            for (cells in 0..cell) {
                table.append("<td></td>")
            }
            table.append("</tr>")
        }
        table.append("</table>")
        return table.toString()
    }

    fun tableWith(row: Int, cell: Int): String {
        return with(StringBuilder()) {
            append("<table>")
            for (rows in 0..row) {
                append("<tr>")
                for (cells in 0..cell) {
                    append("<td></td>")
                }
                append("</tr>")
            }
            append("</table>")
        }.toString()
    }
}

fun main() {
    println(HtmlTable().tableWith(2, 2))
}