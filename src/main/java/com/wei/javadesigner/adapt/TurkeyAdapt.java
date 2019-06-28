package com.wei.javadesigner.adapt;

public class TurkeyAdapt implements Duck{
    Turkey turkey;

    public TurkeyAdapt(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
