package Homework2_Game.HeroType;

import Homework2_Game.Enemys.Enemy;

import java.util.List;

public  abstract class Hero {
    private final String NAME;
    private int damage;
    int health;

    public Hero(String name, int damage,int health) {
        this.NAME = name;
        this.damage = damage;
        this.health = health;

    }

    public String getName() {
        return NAME;
    }

    public int getDamage() {
        return damage;
    }

    public abstract void attackEnemy(Enemy enemy);
    public abstract void komboAttack(List<Enemy> e);
}
