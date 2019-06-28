package com.wei.javadesigner.decoration.starbucks;

public class Soy extends Condiment {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public Integer getSize() {
        return beverage.getSize();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+"soy";
    }

    @Override
    public Double cost() {
        return 3.55 + beverage.cost();
    }

}
