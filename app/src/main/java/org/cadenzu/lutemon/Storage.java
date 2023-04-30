package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Storage {
    protected static String name;
    protected static ArrayList<Lutemon> lutemons = new ArrayList<>();

    public static Storage storage = null;

    public Storage(String name, ArrayList<Lutemon> lutemons) {
        this.name = name;
        this.lutemons = lutemons;
    }



    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage(name, lutemons);
        }
        return storage;
    }

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

        listLutemons();
    }

    public Lutemon getLutemon(Lutemon lutemon) {

        return lutemon;
    }

    public void listLutemons() {
        System.out.println("Following lutemons exist:");
        for (Lutemon lutemon : lutemons) {
            System.out.println(lutemon.getName() + ", " + lutemon.getColor());
        }
    }

}
