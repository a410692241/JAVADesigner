package com.wei.javadesigner.strategy;

public class Consumer {
    public static void main(String[] args) {
        Strategy strategy = new StrategyImpl2();
        strategy.run();
    }
}
