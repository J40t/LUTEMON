package org.cadenzu.lutemon;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;

import org.cadenzu.lutemon.lutemon.Lutemon;
import org.cadenzu.lutemon.lutemon.White;

public class HomeFragment extends Fragment {
    private Button btnCreate;
    private EditText txtName;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        btnCreate = view.findViewById(R.id.btnAddLutemon);
        txtName = view.findViewById(R.id.txtInputName);

        return view;
    }

    public void addLutemon(View view) {

        String name = txtName.getText().toString();


        RadioGroup rgLutemonType = view.findViewById(R.id.rgLutemonType);


        switch (rgLutemonType.getCheckedRadioButtonId()) {
            case R.id.rbWhite:
                Storage.getInstance().addLutemon(new White(name));
                break;
            case R.id.rbGreen:

                break;
            case R.id.rbPink:

                break;
            case R.id.rbOrange:

                break;
            case R.id.rbBlack:

                break;

        }

    }
}