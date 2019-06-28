package com.wei.javadesigner.adapt;

public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("野生火鸡吃饭中...");
    }

    @Override
    public void fly() {
        System.out.println("野生火鸡飞起来了!");
    }
}
