package org.cadenzu.lutemon;

import android.content.Intent;
import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Fight {
    private Lutemon lutemonAttacker;
    private Lutemon lutemonDefender;

    private int fightStatus;
    // 1 = FightActivity displays the lutemons' stats
    // 2 = FightActivity displays the attack
    // 3 = FightActivity displays the result of attack (survive or die)

    public Fight() {
        this.lutemonAttacker = DuelArena.getInstance().getLutemons().get(0);
        this.lutemonDefender = DuelArena.getInstance().getLutemons().get(1);
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
        String survMsg = lutemon.getColor()
                + "(" + lutemon.getName() + ")"
                + "manages to escape death.";
        return survMsg;
    }

    public String deathMessage(Lutemon lutemon) {
        String deaMsg = lutemon.getColor()
                + "(" + lutemon.getName() + ")"
                + "gets killed.";
        return deaMsg;
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

    public int getFightStatus() {
        return fightStatus;
    }

    public void setFightStatus(int fightStatus) {
        this.fightStatus = fightStatus;
    }
}
