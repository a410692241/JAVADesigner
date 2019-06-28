package com.wei.javadesigner.decoration.starbucks;

public abstract class Beverage {
    String description = "这是一个描述!";

    public String getDescription() {
        return description;
    }

    public abstract Double cost();

    protected abstract Integer getSize();
}
