package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class TrainField extends Storage {

    ArrayList<Lutemon> lutemonsTrainField = new ArrayList<>();
    public TrainField(String name, ArrayList<Lutemon> lutemons) {
        super("Training Field", lutemons);
    }

    public static TrainField trainField = null;
    public static Storage getInstance() {
        if (trainField == null) {
            trainField = new TrainField(name, lutemons);
        }
        return trainField;
    }
}
