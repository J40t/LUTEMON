package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class DuelArena extends Storage {

    ArrayList<Lutemon> lutemonsDualArena = new ArrayList<>();

    public static DuelArena duelArena = null;

    public DuelArena() {

    }

    public static Storage getInstance() {
        if (duelArena == null) {
            duelArena = new DuelArena();
        }
        return duelArena;
    }
}
