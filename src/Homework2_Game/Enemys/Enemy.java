package Homework2_Game.Enemys;
import Homework2_Game.Interface.Mortal;
public class Enemy implements Mortal {
    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void takeDamage(int damage){
        health -=damage;

        if(isAlive()){
            System.out.println("Enemy is live");
        }
        else{
            System.out.println("Enemy is dead");
        }
    }

    @Override
    public boolean isAlive() {
        if(health > 0 ){
            return true;
        }
        return false;
    }
}
