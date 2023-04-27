package org.cadenzu.lutemon.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class Green extends Lutemon {

    public Green(String name, String color,
                 int attack, int defense, int exp,
                 int health, int maxHealth,
                 int id, int idCounter) {
        super(name, "Green", 6, 3, exp, health, 19, id, idCounter);
    }
}
