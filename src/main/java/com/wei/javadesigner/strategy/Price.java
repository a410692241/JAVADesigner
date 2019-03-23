package com.wei.javadesigner.strategy;

public class Price { private String username;private Double amount;
    public Price(String username, Double amount, Strategy strategy) {
        this.username = username;
        this.amount = amount;
        this.strategy = strategy;
    }

    private Strategy strategy;

    public String getUsername() {
        return username;
    }public Double getAmount() { return amount; }public void run() { strategy.run(this); }}