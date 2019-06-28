package com.wei.javadesigner.decoration.hero;

public class BlindMonk extends Hero {

    private String name;

    public BlindMonk(String name) {
        this.name = name;
    }

    @Override
    String getHeroName() {
        return name;
    }

    @Override
    public void learnSkills() {
        System.out.println(name + "学习了以上技能！");
    }
}