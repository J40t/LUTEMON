package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Home extends Storage {

    ArrayList<Lutemon> lutemonsHome = new ArrayList<>();

    public Home(String name, ArrayList<Lutemon> lutemons) {
        super("Home", lutemons);

    }

    public static Home home = null;
    public static Storage getInstance() {
        if (home == null) {
            home = new Home(name, lutemons);
        }
        return home;
    }

}
