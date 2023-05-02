package org.cadenzu.lutemon;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class TrainField extends Storage {

    public static TrainField trainField = null;

    public TrainField() {

    }
    public static TrainField getInstance() {
        if (trainField == null) {
            trainField = new TrainField();
        }
        return trainField;
    }

    public void increaseExperienceTraining() {
        for (Lutemon lutemon : lutemons) {
            lutemon.incrementExperience();
        }
    }

}
