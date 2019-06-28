package com.wei.javadesigner.decoration.starbucks;
/**
 * @Author Awake-Hu
 * @Description 杯子装饰
 * @Date 2019/6/26 13:58
 **/
public class SmallCup extends Beverage{
    public static final Integer size = 20;

    @Override
    protected Integer getSize() {
        return size;
    }

    @Override
    public Double cost() {
        return 2.99 + getSize() * 0.2;
    }
}