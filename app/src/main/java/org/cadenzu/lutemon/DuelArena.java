package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class DuelArena extends Storage {

    private final int lutemonDuelStartCapacity = 2;
    public static DuelArena duelArena = null;

    public DuelArena() {

    }

    public static DuelArena getInstance() {
        if (duelArena == null) {
            duelArena = new DuelArena();
        }
        return duelArena;
    }

    public int getLutemonDuelStartCapacity() {
        return lutemonDuelStartCapacity;
    }

}
