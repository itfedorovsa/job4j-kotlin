package ru.job4j.safe

class Account3 {
    var address: Address3? = null
}

class Address3 {
    var zip: Zip? = null
}

class Zip {
    var code: Int? = null
}

fun main() {
    val list = listOf(
        Account3(),
        Account3().apply { address = Address3() },
        Account3().apply { address = Address3().apply { zip = Zip().apply { code = 123 } } }
    )
    /* instead
    list.forEach {
        val address = it.address
        if (address != null) {
            val zip = address.zip
            if (zip != null) {
                println(zip.code)
            } else {
                print("not defined")
            }
        } else {
            print("not defined")
        }
    }*/
    list.forEach {
        val code = it.address?.zip?.code ?: "not defined"
        println(code)
    }
}