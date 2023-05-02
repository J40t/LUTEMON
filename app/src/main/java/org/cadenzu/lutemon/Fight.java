package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class Fight {

    private Lutemon lutemon1;
    private Lutemon lutemon2;


    public Fight(Lutemon lutemon1, Lutemon lutemon2) {
        this.lutemon1 = lutemon1;
        this.lutemon2 = lutemon2;
    }

    public void battle() {


    }

    public void displayStatsLutemon(Lutemon lutemon) {
        String stats = lutemon.getColor()
                + "(" + lutemon.getName() + ")"
                + "att: " + lutemon.getAttack() + "; "
                + "def: " + lutemon.getDefense() + "; "
                + "exp: " + lutemon.getExp() + "; "
                + "health: " + lutemon.getHealth() + "/" + lutemon.getMaxHealth();
    }



    public Lutemon getLutemon1() {
        return lutemon1;
    }

    public Lutemon getLutemon2() {
        return lutemon2;
    }
}
