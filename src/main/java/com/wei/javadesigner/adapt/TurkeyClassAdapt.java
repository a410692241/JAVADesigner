package com.wei.javadesigner.adapt;

public class TurkeyClassAdapt extends WildTurkey implements Duck{

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
