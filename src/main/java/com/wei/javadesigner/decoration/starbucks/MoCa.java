package com.wei.javadesigner.decoration.starbucks;
/**
 * @Author Awake-Hu
 * @Description 摩卡装饰
 * @Date 2019/6/26 13:58
 **/
public class MoCa extends Condiment {
    Beverage beverage;

    @Override
    protected Integer getSize() {
        return beverage.getSize();
    }

    public MoCa(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.9;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "moca";
    }
}
