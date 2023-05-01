package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class DuelArena extends Storage {

    public static DuelArena duelArena = null;

    public DuelArena() {

    }

    public static DuelArena getInstance() {
        if (duelArena == null) {
            duelArena = new DuelArena();
        }
        return duelArena;
    }
}
