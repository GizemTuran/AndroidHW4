package com.example.odev42;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class APageFragment extends Fragment {

    Button btnB;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_page,container,false);

        btnB = view.findViewById(R.id.buttonB);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YPageFragment yPageFragment = new YPageFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_Id,yPageFragment).commit();
            }
        });

        return view;
    }
}