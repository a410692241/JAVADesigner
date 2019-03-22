package com.wei.javadesigner.strategy;

public class StrategyImpl implements Strategy {
    @Override
    public void run(Price price) {
        System.out.println("使用美元支付" + price.getUsername() + ":" + price.getAmount() + "元");
    }
}
