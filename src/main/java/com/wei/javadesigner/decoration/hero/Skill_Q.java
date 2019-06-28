package com.wei.javadesigner.decoration.hero;

public class Skill_Q extends Skills{
    private Hero hero;


    public Skill_Q(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void learnSkills() {
        System.out.println(hero.getHeroName() + "学习了技能Q:");

    }
}