package ru.job4j.safe;

public class User1 {
    private final String passport;
    private final String username;

    public User1(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    public String getPassport() {
        return passport;
    }

    public String getUsername() {
        return username;
    }
}
