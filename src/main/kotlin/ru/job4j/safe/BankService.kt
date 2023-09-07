package ru.job4j.safe

class BankService {
    private val users = HashMap<User, ArrayList<Account>>()

    fun addUser(user: User): Boolean =
        users.putIfAbsent(user, ArrayList()) == null

    fun addAccount(passport: String, account: Account) {
        val user = findByPassport(passport) ?: return
        users[user]!!.add(account)
    }

    fun findByPassport(passport: String): User? =
        users.keys.find { it.passport == passport }

    fun findAccounts(passport: String): ArrayList<Account>? =
        findByPassport(passport)?.let { user -> users[user] }


    fun findByRequisite(passport: String, requisite: String): Account? =
        findByPassport(passport)?.let { user ->
            users[user]?.find { it.requisite == requisite }
        }

    fun transferMoney(
        srcPassport: String, srcRequisite: String,
        destPassport: String, destRequisite: String, amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, destRequisite)
        val rsl = source != null && dest != null && source.balance > amount
        if (rsl) {
            source!!.balance -= amount
            dest!!.balance += amount
        }
        return rsl
    }

}

fun main(args: Array<String>) {
    val bank = BankService()
    bank.addUser(User("321", "Petr Arsentev"))
    var user = bank.findByPassport("3211")
    println(user?.username)
    user = bank.findByPassport("321")
    println(user?.username)
}
