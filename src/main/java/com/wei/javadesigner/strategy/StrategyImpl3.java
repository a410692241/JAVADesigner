package com.wei.javadesigner.strategy;

public class StrategyImpl3 implements Strategy{
    @Override
    public void run(Price price) {
        Price2 price2 = (Price2) price;
        System.out.println("使用"+price2.getAccount()+"支付" + price.getUsername() + ":" + price.getAmount() + "元");
    }
}
