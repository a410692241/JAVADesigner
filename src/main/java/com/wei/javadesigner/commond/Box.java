package com.wei.javadesigner.commond;

public class Box {
    private Commond commond;

    public Box(CommondMouse commond) {
        this.commond = commond;
    }

    public Box(CommondKeyBoard commond) {
        this.commond = commond;
    }

    public void execute() {
        commond.execute();
    }
}