package com.wei.javadesigner.adapt;

public class Main {
    public static void main(String[] args) {
//        TurkeyAdapt turkeyAdapt = new TurkeyAdapt(new WildTurkey());
//        turkeyAdapt.quack();
//        turkeyAdapt.fly();

        TurkeyClassAdapt r = new TurkeyClassAdapt();
        r.quack();
        r.fly();

    }
}
