package Homework2_Game.Enemys;

public class Zombee  extends Enemy{

    public Zombee(int health) {
        super(health);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage);
        if(Math.random() < 0.5){
            setHealth(100);
            System.out.println("zombee relife");
        }
    }
}
