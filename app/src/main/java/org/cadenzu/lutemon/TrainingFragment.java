package org.cadenzu.lutemon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class TrainingFragment extends Fragment {

    private Button btnTrainEm;
    private RecyclerView rvLutemons;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_training, container, false);
        btnTrainEm = view.findViewById(R.id.btnTrainEm);
        rvLutemons = view.findViewById(R.id.rvLutemons);
        rvLutemons.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvLutemons.setAdapter(new LutemonViewAdapter(getActivity(), TrainField.getInstance().getLutemons()));


        btnTrainEm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TrainField.getInstance().increaseExperienceTraining();
            }
        });


        return view;
    }
}