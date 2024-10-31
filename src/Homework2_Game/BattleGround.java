package Homework2_Game;

import Homework2_Game.Enemys.*;
import Homework2_Game.HeroType.*;


public class BattleGround {
    public static void main(String[] args) {
        Hero hr = new Warrior("Sparta",15,100);
        Hero arc = new Archer("Arch",20,70);
        Hero mage = new Mage("Mag", 30,50);

        Enemy en = new Enemy(50);
        Enemy zombee = new Zombee(70);
        Witch witch = new Witch(100);
        witch.callArmy();

        mage.attackEnemy(witch);
        hr.attackEnemy(en);
        arc.attackEnemy(zombee);
    }
}
