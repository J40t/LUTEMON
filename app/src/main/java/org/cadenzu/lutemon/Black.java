package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class Black extends Lutemon {

    public Black(String name, String color,
                 int attack, int defense, int exp,
                 int health, int maxHealth,
                 int id, int idCounter) {
        super(name, "Black", 9, 0, exp, health, 16, id, idCounter);
    }
}
