package org.cadenzu.lutemon.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class White extends Lutemon {

    public White(String name, String color,
                 int attack, int defense, int exp,
                 int health, int maxHealth,
                 int id, int idCounter) {
        super(name, "White", 5, 4, exp, health, 20, id, idCounter);
    }
}
