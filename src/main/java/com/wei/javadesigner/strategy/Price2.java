package com.wei.javadesigner.strategy;

public class Price2 extends Price {
    private String account;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Price2(String username, Double amount, Strategy strategy, String account) {
        super(username, amount, strategy);
        this.account = account;
    }
}
