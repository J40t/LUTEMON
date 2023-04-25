package org.cadenzu.lutemon;

import java.util.ArrayList;

public class Storage {
    protected String name;
    protected ArrayList<Lutemon> lutemons;

    public Storage(String name, ArrayList<Lutemon> lutemons) {
        this.name = name;
        this.lutemons = lutemons;
    }

    public static Storage storage = null;

    public Storage getInstance() {
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
