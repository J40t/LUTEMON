package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {

    private TextView txtLutemonTitle1, txtLutemonTitle2;
    private TextView txtStats1, txtStats2;

    private TextView txtAttackEvent, txtResultEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        Fight fight = new Fight();

        txtLutemonTitle1 = findViewById(R.id.txtLutemonTitle1);
        txtLutemonTitle2 = findViewById(R.id.txtLutemonTitle2);
        txtStats1 = findViewById(R.id.txtStats1);
        txtStats2 = findViewById(R.id.txtStats2);
        txtAttackEvent = findViewById(R.id.txtAttackEvent);
        txtResultEvent = findViewById(R.id.txtResultEvent);


        txtLutemonTitle1.setText(fight.getLutemonAttacker().getName());
        txtLutemonTitle2.setText(fight.getLutemonDefender().getName());




        while (true) {

            txtStats1.setText(fight.battleDisplayStatsLutemon(fight.getLutemonAttacker()));
            txtStats2.setText(fight.battleDisplayStatsLutemon(fight.getLutemonDefender()));
            txtAttackEvent.setText(fight.attackEventMessage());
            if (fight.getLutemonDefender().getHealth() <= 0) {

            }
            break;

        }


    }

}