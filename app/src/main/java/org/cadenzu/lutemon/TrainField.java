package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class TrainField extends Storage {

    ArrayList<Lutemon> lutemonsTrainField = new ArrayList<>();

    public static TrainField trainField = null;

    public TrainField() {

    }
    public static Storage getInstance() {
        if (trainField == null) {
            trainField = new TrainField();
        }
        return trainField;
    }
}
