package org.cadenzu.lutemon;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class DuelFragment extends Fragment {
    private Button btnDuelBegin;
    private RecyclerView rvLutemons;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_duel, container, false);

        btnDuelBegin = view.findViewById(R.id.btnBeginFight);
        rvLutemons = view.findViewById(R.id.rvLutemons);
        rvLutemons.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvLutemons.setAdapter(new LutemonViewAdapter(getActivity(), DuelArena.getInstance().getLutemons()));

        btnDuelBegin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (DuelArena.getInstance().getLutemons().size() == DuelArena.getInstance().getLutemonDuelStartRequirement()) {
                    openFightActivity();
                } else {
                    Toast.makeText(getActivity(), "Duel can only start with 2 Lutemons", Toast.LENGTH_LONG).show();
                }
            }
        });
        return view;
    }
    public void openFightActivity() {
        Intent intent = new Intent(getActivity(), FightActivity.class);
        startActivity(intent);
    }
}