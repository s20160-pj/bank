package model;

import controller.AccountNrAnnotation;

public class Account extends User {
    private Double balance;
    @AccountNrAnnotation(accountNrAnnotation = 11000011110000111100001111d)
    private Double accountNr;

    public Account(int id, String name, String surname, Double balance, Double accountNr) {
        super(id, name, surname);
        this.balance = balance;
        this.accountNr = accountNr;
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(Double accountNr) {
        this.accountNr = accountNr;
    }
}
