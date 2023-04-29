package org.cadenzu.lutemon.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

public class Black extends Lutemon {

    public Black(String name) {
        super(name, "Black", 9, 0, 0, 16, 16, 0);
        id = getIdCounter();
    }
}
