package org.cadenzu.lutemon;

import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Fight {
    private Lutemon lutemonAttacker;
    private Lutemon lutemonDefender;

    public Fight() {
        this.lutemonAttacker = DuelArena.getInstance().getLutemons().get(0);
        this.lutemonDefender = DuelArena.getInstance().getLutemons().get(1);
    }

    public void fullBattle() {

        while (true) {
            //Samaan aikaan FightActivityssa:
            //txtStats1.setText(fight.battleDisplayStatsLutemon(fight.getLutemon1()));
            //txtStats2.setText(fight.battleDisplayStatsLutemon(fight.getLutemon2()));
            lutemonDefender.setHealth(lutemonDefenderHealthCalculation());

            if (lutemonDefender.getHealth() <= 0) {

                break;
            }


        }

    }


    public String battleDisplayStatsLutemon(Lutemon lutemon) {
        String stats = lutemon.getColor()
                + "(" + lutemon.getName() + ") "
                + "att: " + lutemon.getAttack() + "; "
                + "def: " + lutemon.getDefense() + "; "
                + "exp: " + lutemon.getExp() + "; "
                + "health: " + lutemon.getHealth() + "/" + lutemon.getMaxHealth();
        return stats;
    }

    public String attackEventMessage() {
        String eventMessage = lutemonAttacker.getColor()
                + " (" + lutemonAttacker.getName() + ") "
                + "attacks "
                + lutemonDefender.getColor()
                + " (" + lutemonDefender.getName() + ")";

        return eventMessage;
    }

    public int lutemonDefenderHealthCalculation() {
        int newHealth = lutemonDefender.getHealth() - (lutemonDefender.getDefense() - lutemonAttacker.getAttack());
        return newHealth;
    }



    public String surviveMessage(Lutemon lutemon) {
        String survMessage = lutemon.getColor()
                + "(" + lutemon.getName() + ")"
                + "manages to escape death.";
        return survMessage;
    }



    public void flipAttackerAndDefender() {
        Lutemon newRoleLutemon = lutemonDefender;
        setLutemonAttacker(newRoleLutemon); //Defender switches to attacker
        setLutemonDefender(lutemonAttacker); //Attacker switches to defender

    }

    public Lutemon getLutemonAttacker() {
        return lutemonAttacker;
    }

    public Lutemon getLutemonDefender() {
        return lutemonDefender;
    }

    public void setLutemonAttacker(Lutemon lutemonAttacker) {
        this.lutemonAttacker = lutemonAttacker;
    }

    public void setLutemonDefender(Lutemon lutemonDefender) {
        this.lutemonDefender = lutemonDefender;
    }
}
