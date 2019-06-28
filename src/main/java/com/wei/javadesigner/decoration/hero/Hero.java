package com.wei.javadesigner.decoration.hero;

public abstract class Hero {
    String heroName = "";

    //学习技能
    String getHeroName() {
        return heroName;
    }

    abstract void learnSkills();
}