package com.wei.javadesigner.commond;

public class Box {
    private Commond commond;

    public Box(Commond commond) {
        this.commond = commond;
    }

    public void resetKeyBoard() {
        commond.executeMouse();
    }
    public void resetMouse() {
        commond.execute();
    }
}