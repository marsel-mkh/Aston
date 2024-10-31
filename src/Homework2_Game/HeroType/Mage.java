package Homework2_Game.HeroType;

import Homework2_Game.Enemys.Enemy;

import java.util.List;
import java.util.Random;

public class Mage extends Hero {
    public Mage(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void komboAttack(List<Enemy> e) {
        Random r = new Random();
        int x = r.nextInt(3);
        for (int i=0;i<x;i++){
            e.get(i).takeDamage(this.getDamage()*2);

        }
    }

    @Override
    public void attackEnemy(Enemy e) {
        System.out.println("Mage " + this.getName() + " is attacted");
        e.takeDamage(getDamage());

    }
}
