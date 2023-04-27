package org.cadenzu.lutemon;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHome = findViewById(R.id.btnHome);
        Button btnTraining = findViewById(R.id.btnTrain);
        Button btnDuel = findViewById(R.id.btnDuel);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragContainer, HomeFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("back")
                        .commit();
            }
        });

        btnTraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragContainer, TrainingFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("back")
                        .commit();
            }
        });

        btnDuel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragContainer, DuelFragment.class, null)
                        .setReorderingAllowed(true)
                        .addToBackStack("back")
                        .commit();
            }
        });

    }
}