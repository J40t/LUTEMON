package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public abstract class Storage {
    protected String name;
    protected ArrayList<Lutemon> lutemons = new ArrayList<>();

    public void addLutemon(Lutemon lutemon) {
        lutemons.add(lutemon);
    }

    public ArrayList<Lutemon> getLutemons() {
        return lutemons;
    }
}
