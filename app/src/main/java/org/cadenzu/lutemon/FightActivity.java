package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {
    private TextView txtLutemonTitle1, txtLutemonTitle2;
    private TextView txtBattleWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        Fight fight = new Fight();

        txtLutemonTitle1 = findViewById(R.id.txtLutemonTitle1);
        txtLutemonTitle2 = findViewById(R.id.txtLutemonTitle2);
        txtBattleWindow = findViewById(R.id.txtBattleWindow);

        txtLutemonTitle1.setText(fight.getLutemonAttacker().getName());
        txtLutemonTitle2.setText(fight.getLutemonDefender().getName());

        while (true) {
            txtBattleWindow.append(fight.battleDisplayStatsLutemon(fight.getLutemonAttacker()) + "\n");
            txtBattleWindow.append(fight.battleDisplayStatsLutemon(fight.getLutemonDefender()) + "\n");
            txtBattleWindow.append(fight.attackEventMessage() + "\n");
            fight.lutemonDefenderHealthCalculation();
            if (fight.getLutemonDefender().getHealth() <= 0) {
                txtBattleWindow.append(fight.deathMessage(fight.getLutemonDefender()) + "\n");
                txtBattleWindow.append("The Battle is Over");
                fight.fightOver();
                break;
            } else {
                txtBattleWindow.append(fight.surviveMessage(fight.getLutemonDefender()) + "\n");
                fight.flipAttackerAndDefender();
            }
        }
    }
}