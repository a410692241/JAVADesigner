package com.wei.javadesigner.decoration.hero;

public class Skill_W extends Skills{
    private Hero hero;


    public Skill_W(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        System.out.println(hero.getHeroName() + "学习了技能W:");

    }
}