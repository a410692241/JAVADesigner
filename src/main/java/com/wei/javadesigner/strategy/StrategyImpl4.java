package com.wei.javadesigner.strategy;

/**
 * 通过扩充调用者的方式来扩充
 */
public class StrategyImpl4 implements Strategy{
    private String account;

    public StrategyImpl4(String account) {
        this.account = account;
    }

    @Override
    public void run(Price price) {
        System.out.println("使用"+this.account+"支付" + price.getUsername() + ":" + price.getAmount() + "元");
    }
}
