package com.wei.javadesigner.commond;

public class CommondImpl implements Commond {
    private KeyBoard keyBoard;
    private Mouse mouse;

    public CommondImpl(KeyBoard keyBoard, Mouse mouse) {
        this.keyBoard = keyBoard;
        this.mouse = mouse;
    }

    @Override
    public void executeMouse() {
        mouse.mouseInit();
    }

    @Override
    public void execute() {
        keyBoard.initKeyBoard();
    }
}
