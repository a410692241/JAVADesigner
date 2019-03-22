package com.wei.javadesigner.strategy;

public class Consumer {
    public static void main(String[] args) {
        Strategy strategy = new StrategyImpl2();
        strategy.run(new Price2("hu",10.00,strategy,"15979031565"));
    }
}
