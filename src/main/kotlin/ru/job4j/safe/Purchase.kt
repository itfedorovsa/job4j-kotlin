package ru.job4j.safe

import java.time.LocalDate

class Purchase(
    val name: String = "",
    val address: Address? = null
) {
    val created: LocalDate = LocalDate.now()
}

fun purchaseTable(list: List<Purchase>): String {
    return with(StringBuilder()) {
        append("<table>")
        for (purchase in list) {
            append("<tr>")
            append("<td>")
            append(purchase.name)
            append("</td>")
            append("<td>")
            append(purchase.created)
            append("</td>")
            append("<td>")
            when (purchase.address) {
                null -> append("")
                else -> append("${purchase.address.street}, ${purchase.address.home}, ${purchase.address.zip}")
            }
            append("</td>")
            append("</tr>")
        }
        append("</table>")
    }.toString()
}

fun main() {
    val list = listOf(Purchase("Bread"), Purchase("Milk", Address("Main", 10, 333100)))
    println(purchaseTable(list))
}