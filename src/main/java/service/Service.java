package service;

import model.Account;
import model.Bank;
import model.User;

import java.math.BigDecimal;
import java.util.Optional;

public class Service {
    Bank bank;

    public Service(Bank bank) {
        this.bank = bank;
    }

    public BigDecimal accountBalance(User user) {
        return BigDecimal.valueOf(user.getAccount().getBalance());
    }

//    public Optional<Account> getAccountForUser(User user) {
//
//    }

//    public boolean checkBankAndAccountCorrelation(Account account) {
//        String s = account.getAccountNr()+"";
//        s.
//    }
}
