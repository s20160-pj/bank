package model;

import controller.AccountNrAnnotation;

public class Account {
    private Double balance;
    @AccountNrAnnotation(accountNrAnnotation = 11000011110000111100001111d)
    private double accountNr;
    private User user;

    public Account(double balance, double accountNr) {
        this.balance = balance;
        this.accountNr = accountNr;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public double getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(double accountNr) {
        this.accountNr = accountNr;
    }
}
