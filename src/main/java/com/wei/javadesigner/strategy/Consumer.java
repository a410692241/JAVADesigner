package com.wei.javadesigner.strategy;

public class Consumer {
    public static void main(String[] args) {
//        Strategy strategy = new StrategyImpl2();
//        strategy.run(new Price2("hu",10.00,strategy,"15979031565"));
        StrategyImpl4 strategy = new StrategyImpl4("1569");
        strategy.run(new Price("hu", 10.00, strategy));
    }
}
