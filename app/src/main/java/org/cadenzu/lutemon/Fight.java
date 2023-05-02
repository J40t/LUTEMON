package org.cadenzu.lutemon;

import android.content.Intent;
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
        return lutemonAttacker.getColor()
                + " (" + lutemonAttacker.getName() + ") "
                + "attacks "
                + lutemonDefender.getColor()
                + " (" + lutemonDefender.getName() + ")";
    }

    public void lutemonDefenderHealthCalculation() {
        int damage = lutemonDefender.getDefense() - lutemonAttacker.getAttack();
        if (damage < 0) { //damage value is negative whenever Attacker's attack stat is higher than the Defender's defense stat.
            lutemonDefender.setHealth(lutemonDefender.getHealth() - (-damage));
        }

    }

    public String surviveMessage(Lutemon lutemon) {
        return lutemon.getColor()
                + " (" + lutemon.getName() + ") "
                + "manages to escape death.";
    }

    public String deathMessage(Lutemon lutemon) {
        return lutemon.getColor()
                + "(" + lutemon.getName() + ") "
                + "gets killed.";
    }

    public void flipAttackerAndDefender() {
        Lutemon newRoleLutemon = lutemonAttacker;
        lutemonAttacker = lutemonDefender; //Attacker switches to defender
        lutemonDefender = newRoleLutemon; //Defender switches to attacker

        System.out.println("newrole " + newRoleLutemon.getName());
        System.out.println("lutemondefender " + lutemonDefender.getName());
        System.out.println("lutemonattacker " + lutemonAttacker.getName());

    }

    public void fightOver() {
        DuelArena.getInstance().getLutemons().remove(lutemonDefender); //Loser dies
        lutemonAttacker.incrementExperience(); //Winner gets an experience point
    }

    public Lutemon getLutemonAttacker() {
        return lutemonAttacker;
    }

    public Lutemon getLutemonDefender() {
        return lutemonDefender;
    }

}
