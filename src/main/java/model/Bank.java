package model;

import java.util.ArrayList;

public class Bank {
    private int bankId;
    private String name;
    private ArrayList accountList = new ArrayList();

    public Bank(int bankId, String name) {
        this.bankId = bankId;
        this.name = name;
    }

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList accountList) {
        this.accountList = accountList;
    }
}
