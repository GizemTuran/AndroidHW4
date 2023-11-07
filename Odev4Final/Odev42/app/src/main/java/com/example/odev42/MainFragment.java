package com.example.odev42;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    Button btnA,btnX;
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_anasayfa,container,false);

        btnA = view.findViewById(R.id.anasayfaBtnA);
        textView = view.findViewById(R.id.homePage);

        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                APageFragment aPageFragment = new APageFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_Id,aPageFragment).commit();
            }
        });


        btnX = view.findViewById(R.id.anasayfaBtnX);
        textView = view.findViewById(R.id.homePage);

        btnX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                XPageFragment xPageFragment = new XPageFragment();
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_Id,xPageFragment).commit();
            }
        });
        return view;
    }
}
