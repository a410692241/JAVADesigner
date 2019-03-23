package com.wei.javadesigner.strategy;

public class StrategyImpl3 implements Strategy{
    /**
     * @param price 通过配合price2扩充上下文来达到扩展的目的
     */
    @Override
    public void run(Price price) {
        Price2 price2 = (Price2) price;
        System.out.println("使用"+price2.getAccount()+"支付" + price.getUsername() + ":" + price.getAmount() + "元");
    }
}
