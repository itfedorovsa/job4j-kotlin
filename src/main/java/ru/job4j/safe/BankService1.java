package ru.job4j.safe;

import java.util.ArrayList;
import java.util.HashMap;

public class BankService1 {
    private final HashMap<User1, ArrayList<Account1>> users = new HashMap<>();

    public void addUser(User1 user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public Account1 findByRequisite(String passport, String requisite) {
        User1 user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        return users.get(user).stream()
                .filter(account -> account.getRequisite().equals(requisite))
                .findFirst()
                .orElse(null);
    }

    public void addAccount(String passport, Account1 account) {
        User1 user = findByPassport(passport);
        if (user == null) {
            return;
        }
        users.get(user).add(account);
    }


    public User1 findByPassport(String passport) {
        for (User1 user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String descRequisite, double amount) {
        var source = findByRequisite(srcPassport, srcRequisite);
        var dest = findByRequisite(destPassport, descRequisite);
        boolean rsl = source != null && dest != null;
        if (rsl) {
            source.setBalance(source.getBalance() - amount);
            dest.setBalance(dest.getBalance() + amount);
        }
        return rsl;
    }

    public static void main(String[] args) {
        var bank = new BankService1();
        bank.addUser(new User1("321", "Petr Arsentev"));
        var user = bank.findByPassport("3211");
        System.out.println(user != null ? user.getUsername() : null);
        user = bank.findByPassport("321");
        System.out.println(user != null ? user.getUsername() : null);
    }
}
