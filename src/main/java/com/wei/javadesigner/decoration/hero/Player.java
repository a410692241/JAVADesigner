package com.wei.javadesigner.decoration.hero;

public class Player {
    public static void main(String[] args) {
        BlindMonk blindMonk = new BlindMonk("李青");
        Skill_R skill_r = new Skill_R(blindMonk);
        Skill_E skill_e = new Skill_E(blindMonk);
        Skill_W skill_w = new Skill_W(blindMonk);
        Skill_Q skill_q = new Skill_Q(blindMonk);
        skill_q.learnSkills();
        skill_w.learnSkills();
        skill_e.learnSkills();
        skill_r.learnSkills();

    }
}