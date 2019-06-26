package com.wei.javadesigner.observer.observable;

public class Main {

    public static void main(String[] args) {
        Weather observable = new Weather();
        Display1 display1 = new Display1(observable);
        Display2 display2 = new Display2(observable);
        observable.addObserver(display1);
        observable.addObserver(display2);
        observable.setMeasurementsChanged(25,60);
    }
}
