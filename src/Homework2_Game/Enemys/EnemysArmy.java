package Homework2_Game.Enemys;

import Homework2_Game.Interface.Mortal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnemysArmy implements Mortal {
    List<Enemy> enemys = new ArrayList<>();
    public EnemysArmy() {
        enemys = new ArrayList<>();
    }

    public List<Enemy> createArmy(){
        Random r = new Random();
        int numberOfEnemy = r.nextInt(10);
        for(int i=0;i< numberOfEnemy;i++){
            enemys.add(new Enemy(r.nextInt(100)));
        }
        return enemys;
    }
    @Override
    public boolean isAlive() {
        return false;
    }
}
