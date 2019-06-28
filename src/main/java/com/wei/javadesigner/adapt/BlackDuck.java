package com.wei.javadesigner.adapt;

public class BlackDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("嘎嘎!");
    }

    @Override
    public void fly() {
        System.out.println("鸭子不会飞了!");
    }
}
