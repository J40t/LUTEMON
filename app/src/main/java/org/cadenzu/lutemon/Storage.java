package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public abstract class Storage {
    protected String name;
    protected ArrayList<Lutemon> lutemons = new ArrayList<>();

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
        System.out.println("Added a lutemon with the following information:");
        System.out.println("Name: " + lutemon.getName());
        System.out.println("Color: " + lutemon.getColor());
        System.out.println("Attack: " + lutemon.getAttack());
        System.out.println("Defense: " + lutemon.getDefense());
        System.out.println("Exp: " + lutemon.getExp());
        System.out.println("Health: " + lutemon.getHealth());
        System.out.println("Max Health: " + lutemon.getMaxHealth());
        System.out.println("Id: " + lutemon.getId());

    }

    public Lutemon getLutemon(int idRequired) {

        for (Lutemon lutemon : lutemons) {
            if (lutemon.getId() == idRequired) {
                return lutemon;
            }
        }
        return null;
    }

    public void listLutemons() {
        System.out.println("Following lutemons exist:");
        for (Lutemon lutemon : lutemons) {
            System.out.println(lutemon.getName() + ", " + lutemon.getColor());
        }
    }

    public ArrayList<Lutemon> getLutemons() {
        return lutemons;
    }
}
