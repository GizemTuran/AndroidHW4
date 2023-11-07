package com.example.odev42;

import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnA,btnB;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().add(R.id.container_Id, new MainFragment()).commit();
    }
}