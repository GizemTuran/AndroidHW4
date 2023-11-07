package com.example.odev42;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class XPageFragment extends Fragment {

    Button btnY;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_x_page, container, false);

        btnY = view.findViewById(R.id.buttonY);

        btnY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                YPageFragment yPageFragment = new YPageFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_Id, yPageFragment).commit();
            }
        });

        return view;
    }
}