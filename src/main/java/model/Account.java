package model;

import java.math.BigDecimal;

public class Account extends User {
    private BigDecimal balance;
    private int accountNr;

    public Account(int id, String name, String surname, BigDecimal balance, int accountNr) {
        super(id, name, surname);
        this.balance = balance;
        this.accountNr = accountNr;
    }

    public Account(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public int getAccountNr() {
        return accountNr;
    }

    public void setAccountNr(int accountNr) {
        this.accountNr = accountNr;
    }
}
