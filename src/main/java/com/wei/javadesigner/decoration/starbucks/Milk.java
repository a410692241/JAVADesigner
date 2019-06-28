package com.wei.javadesigner.decoration.starbucks;
/**
 * @Author Awake-Hu
 * @Description 奶茶味装饰
 * @Date 2019/6/26 13:59
 **/
public class Milk extends Condiment {

    Beverage beverage;

    @Override
    protected Integer getSize() {
        return beverage.getSize();
    }

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    public Milk(Beverage beverage, Beverage beverage1) {
        this.beverage = beverage1;
    }

    @Override
    public Double cost() {
        return beverage.cost() + 0.2;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "milk";
    }
}
