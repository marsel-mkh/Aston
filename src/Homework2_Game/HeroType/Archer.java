package Homework2_Game.HeroType;

import Homework2_Game.Enemys.Enemy;

import java.util.List;
import java.util.Random;

public class Archer extends Hero {
    public Archer(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy e) {
        System.out.println("Archer " + this.getName() + " is attacted" );
        e.takeDamage(getDamage());
    }

    @Override
    public void komboAttack(List<Enemy> enemys) {
        System.out.println("Archer used kombo");
        Random r = new Random();
        int x = r.nextInt(5);
        for (int i=0;i<x;i++){
            enemys.get(i).takeDamage(this.getDamage());

        }
    }
}
