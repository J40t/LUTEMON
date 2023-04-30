package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class DuelArena extends Storage {

    ArrayList<Lutemon> lutemonsDualArena = new ArrayList<>();

    public DuelArena(String name, ArrayList<Lutemon> lutemons) {
        super("Dueling Arena", lutemons);
    }

    public static DuelArena duelArena = null;
    public static Storage getInstance() {
        if (duelArena == null) {
            duelArena = new DuelArena(name, lutemons);
        }
        return duelArena;
    }
}
