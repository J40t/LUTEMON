package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Lutemon;

import java.util.ArrayList;
import java.util.Arrays;

public class MoveLutemonActivity extends AppCompatActivity {

    private RadioGroup rgLutemonSelectMove;
    private RadioGroup rgLocationSelect;
    private Button btnConfirmMove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_lutemon);

        rgLutemonSelectMove = findViewById(R.id.rgLutemonSelectMove);
        btnConfirmMove = findViewById((R.id.btnConfirmMove));
        rgLocationSelect = findViewById(R.id.rgLocations);

        createDynamicCheckBoxes();

        btnConfirmMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveLutemons(view);
            }
        });
    }

    public void createDynamicCheckBoxes() {

        //Adding all lutemons to the same ArrayList (There's no "shared" ArrayList in storage class so this is a way to put every lutemon together)
        ArrayList<Lutemon> allLutemons = new ArrayList<>();
        allLutemons.addAll(Home.getInstance().getLutemons());
        allLutemons.addAll(TrainField.getInstance().getLutemons());
        allLutemons.addAll(DuelArena.getInstance().getLutemons());

        //Dynamically made CheckBoxes' ID is always 0 ... i
        CheckBox cbLutemonSelect;
        int i = 0;
        for (Lutemon lutemon : allLutemons) {
            cbLutemonSelect = new CheckBox(this);
            cbLutemonSelect.setText(lutemon.getName());
            cbLutemonSelect.setId(i++);
            rgLutemonSelectMove.addView(cbLutemonSelect);
        }
    }
    public void moveLutemons(View view) {

        //Adding all lutemons to the same ArrayList (There's no "shared" ArrayList in storage class so this is a way to put every lutemon together)
        ArrayList<Lutemon> allLutemons = new ArrayList<>();
        allLutemons.addAll(Home.getInstance().getLutemons());
        allLutemons.addAll(TrainField.getInstance().getLutemons());
        allLutemons.addAll(DuelArena.getInstance().getLutemons());


        for (int i = 0; i < allLutemons.size(); i++) {
            CheckBox cbLutemonBox = findViewById(i);
            System.out.println("i: " + i);

            if (cbLutemonBox.isChecked()) { // Only checked lutemons will be moved/interacted with
                Lutemon lutemon = allLutemons.get(i);   // Selected lutemon will be removed from every possible location
                Home.getInstance().getLutemons().remove(lutemon);
                TrainField.getInstance().getLutemons().remove(lutemon);
                DuelArena.getInstance().getLutemons().remove(lutemon);
                System.out.println("Ennen switch");
                switch (rgLocationSelect.getCheckedRadioButtonId()) { //Selected lutemon will be added to one of three locations.
                    case R.id.rbHome:
                        Home.getInstance().getLutemons().add(lutemon);
                        Home.getInstance().listLutemons();
                        System.out.println("Homeen juu");
                        break;
                    case R.id.rbTrainField:
                        System.out.println("Trainingii juu");
                        TrainField.getInstance().getLutemons().add(lutemon);
                        System.out.println("Trainingii juu 2");

                        break;
                    case R.id.rbDuelArena:
                        DuelArena.getInstance().getLutemons().add(lutemon);
                        DuelArena.getInstance().listLutemons();
                        break;

                }

            }
        }
    }
}