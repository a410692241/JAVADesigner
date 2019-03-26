package com.wei.javadesigner.commond;

public class CommondMouse implements Commond{
    private Mouse mouse;

    public CommondMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    @Override
    public void execute() {
        mouse.mouseInit();
    }
}
