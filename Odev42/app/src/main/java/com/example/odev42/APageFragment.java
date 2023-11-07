package com.example.odev42;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class APageFragment extends Fragment {

    Button btn;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a_page,container,false);

        btn = view.findViewById(R.id.button_Id);
        textView = view.findViewById(R.id.textView_Id);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BPageFragment bPageFragment = new BPageFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_Id,bPageFragment).commit();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        return view;
    }
}