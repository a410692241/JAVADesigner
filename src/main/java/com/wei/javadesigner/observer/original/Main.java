package com.wei.javadesigner.observer.original;

public class Main {

    public static void main(String[] args) {
        Weather weather = new Weather(60, 25);
        Display1 display1 = new Display1();
        Display2 display2 = new Display2();
        weather.register(display1);
        weather.register(display2);
        weather.notifyObserver();
    }
}
