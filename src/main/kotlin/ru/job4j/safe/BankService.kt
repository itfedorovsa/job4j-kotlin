package ru.job4j.safe

class BankService {
    private val users = HashMap<User, ArrayList<Account?>>()
    fun addUser(user: User) {
        users.putIfAbsent(user, ArrayList())
    }

    fun findByRequisite(passport: String, requisite: String): Account? {
        val user = findByPassport(passport) ?: return null
        return users[user]!!.stream()
            .filter { account: Account? -> account!!.requisite == requisite }
            .findFirst()
            .orElse(null)
    }

    fun addAccount(passport: String, account: Account?) {
        val user = findByPassport(passport) ?: return
        users[user]!!.add(account)
    }

    fun findByPassport(passport: String): User? {
        for (user in users.keys) {
            if (user.passport == passport) {
                return user
            }
        }
        return null
    }

    fun transferMoney(
        srcPassport: String, srcRequisite: String,
        destPassport: String, descRequisite: String, amount: Double
    ): Boolean {
        val source = findByRequisite(srcPassport, srcRequisite)
        val dest = findByRequisite(destPassport, descRequisite)
        val rsl = source != null && dest != null
        if (rsl) {
            source!!.balance = source.balance - amount
            dest!!.balance = dest.balance + amount
        }
        return rsl
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val bank = BankService()
            bank.addUser(User("321", "Petr Arsentev"))
            var user = bank.findByPassport("3211")
            println(user?.username)
            user = bank.findByPassport("321")
            println(user?.username)
        }
    }
}
