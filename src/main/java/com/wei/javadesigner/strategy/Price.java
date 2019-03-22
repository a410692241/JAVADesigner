package com.wei.javadesigner.strategy;

public class Price {
    private Strategy strategy;

    public Price(Strategy strategy) {
        this.strategy = strategy;
    }

    public void run() {
        strategy.run();
    }
}