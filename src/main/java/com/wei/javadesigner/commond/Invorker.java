package com.wei.javadesigner.commond;

public class Invorker {
    private Commond commond;

    public Invorker(Commond commond) {
        this.commond = commond;
    }

    public void biosRun() {
        commond.execute();
    }

}
