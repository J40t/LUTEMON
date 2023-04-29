package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Storage {
    protected static String name;
    protected static ArrayList<Lutemon> lutemons;

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

    }

    public Lutemon getLutemon(Lutemon lutemon) {

        return lutemon;
    }

    public void listLutemons() {

    }

}
