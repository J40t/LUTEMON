package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class FightActivity extends AppCompatActivity {

    private TextView txtLutemonTitle1;
    private TextView txtLutemonTitle2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fight);

        txtLutemonTitle1 = findViewById(R.id.txtLutemonTitle1);
        txtLutemonTitle2 = findViewById(R.id.txtLutemonTitle2);

        txtLutemonTitle1.setText(fight.getLutemon1().getName());
        txtLutemonTitle2.setText(fight.getLutemon2().getName());

    }

}