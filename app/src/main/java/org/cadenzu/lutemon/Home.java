package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class Home extends Storage {

    public static Home home = null;

    public Home() {

    }


    public static Home getInstance() {
        if (home == null) {
            home = new Home();
        }
        return home;
    }

}
