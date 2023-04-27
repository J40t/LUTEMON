package org.cadenzu.lutemon.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class Orange extends Lutemon {

    public Orange(String name, String color,
                 int attack, int defense, int exp,
                 int health, int maxHealth,
                 int id, int idCounter) {
        super(name, "Orange", 8, 1, exp, health, 17, id, idCounter);
    }
}
