package Homework2_Game.Enemys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Witch  extends Enemy{
    public Witch(int health) {
        super(health);
    }

    public List<Enemy> callArmy(){
        EnemysArmy eArmy = new EnemysArmy();
        return eArmy.createArmy();

    }


}
