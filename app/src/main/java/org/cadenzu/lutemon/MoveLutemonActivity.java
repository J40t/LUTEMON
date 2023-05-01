package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;

public class MoveLutemonActivity extends AppCompatActivity {

    private RadioGroup rgLutemonSelectHome;
    private RadioGroup rgLutemonSelectTrain;
    private RadioGroup rgLutemonSelectDuel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_lutemon);

        rgLutemonSelectHome = findViewById(R.id.rgLutemonSelectHome);
        rgLutemonSelectTrain = findViewById(R.id.rgLutemonSelectTrain);
        rgLutemonSelectDuel = findViewById(R.id.rgLutemonSelectDuel);

        dynamicRadioButtons();
    }

    public void dynamicRadioButtons() {
        // HOME
        ArrayList<Lutemon> lutemonsHome = Home.getInstance().getLutemons();
        RadioButton rbHome;
        int i = 0;
        for (Lutemon lutemon : lutemonsHome) {
            rbHome = new RadioButton(this);
            rbHome.setText(lutemon.getName());
            rbHome.setId(i++);
            rgLutemonSelectHome.addView(rbHome);
        }

        ArrayList<Lutemon> lutemonsTrain = TrainField.getInstance().getLutemons();
        RadioButton rbTrain;
        for (Lutemon lutemon : lutemonsTrain) {
            rbTrain = new RadioButton(this);
            rbTrain.setText(lutemon.getName());
            rbTrain.setId(i++);
            rgLutemonSelectTrain.addView(rbTrain);
        }

        ArrayList<Lutemon> lutemonsDuel = DuelArena.getInstance().getLutemons();
        RadioButton rbDuel;
        for (Lutemon lutemon : lutemonsDuel) {
            rbDuel = new RadioButton(this);
            rbDuel.setText(lutemon.getName());
            rbDuel.setId(i++);
            rgLutemonSelectDuel.addView(rbDuel);
        }
    }
    public void moveLutemon() {
        Lutemon selectedLutemon;


    }
}