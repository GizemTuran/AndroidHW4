package com.example.odev4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.odev4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button firstBtn, secondBtn;
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstBtn = findViewById(R.id.anasayfaBtnA);
        secondBtn = findViewById(R.id.anasayfaBtnX);

        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.anasayfaBtnA,new APageFragment());
                fragmentTransaction.commit();
            }
        });

        secondBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.anasayfaBtnX,new XPageFragment());
                fragmentTransaction.commit();
            }
        });
    }

}