package Homework2_Game.HeroType;

import Homework2_Game.Enemys.Enemy;

import java.util.List;
import java.util.Random;

public class Warrior extends Hero{
    public Warrior(String name, int damage, int health) {
        super(name, damage, health);
    }

    @Override
    public void attackEnemy(Enemy e) {
        System.out.println("Warrior " + this.getName() + " is attacted");
        e.takeDamage(getDamage());
    }

    @Override
    public void komboAttack(List<Enemy> enemys) {
        for (Enemy e: enemys ){
            e.takeDamage(getDamage());
        }
    }
}
