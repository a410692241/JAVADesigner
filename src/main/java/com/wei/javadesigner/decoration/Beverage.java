package com.wei.javadesigner.decoration;

public abstract class Beverage {
    String description = "这是一个描述!";

    public String getDescription() {
        return description;
    }

    public abstract Double cost() ;

}
