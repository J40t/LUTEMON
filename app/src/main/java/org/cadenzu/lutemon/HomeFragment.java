package org.cadenzu.lutemon;

import static org.cadenzu.lutemon.Home.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Black;
import org.cadenzu.lutemon.lutemon.Green;
import org.cadenzu.lutemon.lutemon.Lutemon;
import org.cadenzu.lutemon.lutemon.Orange;
import org.cadenzu.lutemon.lutemon.Pink;
import org.cadenzu.lutemon.lutemon.White;

public class HomeFragment extends Fragment {
    private Button btnCreate;
    private EditText txtName;
    private RadioGroup rgLutemonType;
    private RecyclerView rvLutemons;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnCreate = view.findViewById(R.id.btnAddLutemon);
        txtName = view.findViewById(R.id.txtInputName);
        rgLutemonType = view.findViewById(R.id.rgLutemonType);
        rvLutemons = view.findViewById(R.id.rvLutemons);
        rvLutemons.setLayoutManager(new LinearLayoutManager(getActivity()));
        rvLutemons.setAdapter(new LutemonViewAdapter(getActivity(), Home.getInstance().getLutemons()));

        btnCreate.setOnClickListener(new View.OnClickListener() { // Activates on the "CREATE" button
            @Override
            public void onClick(View view) {
                addLutemon(view);
            }
        });
        return view;
    }



    public void addLutemon(View view) {
        String name = txtName.getText().toString();
        switch (rgLutemonType.getCheckedRadioButtonId()) {
            case R.id.rbWhite:
                Home.getInstance().addLutemon(new White(name));
                break;
            case R.id.rbGreen:
                Home.getInstance().addLutemon(new Green(name));
                break;
            case R.id.rbPink:
                Home.getInstance().addLutemon(new Pink(name));
                break;
            case R.id.rbOrange:
                Home.getInstance().addLutemon(new Orange(name));
                break;
            case R.id.rbBlack:
                Home.getInstance().addLutemon(new Black(name));
                break;
        }
    }
}