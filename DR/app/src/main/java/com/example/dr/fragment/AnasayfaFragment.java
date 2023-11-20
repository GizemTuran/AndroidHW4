package com.example.dr.fragment;

import android.content.ClipData;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dr.R;
import com.example.dr.adapter.ItemsAdapter;
import com.example.dr.databinding.FragmentAnasayfaBinding;
import com.example.dr.entity.Items;

import java.util.ArrayList;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false);

        binding.popularBooks.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));

        ArrayList<Items> itemsList = new ArrayList<>();
        Items i1 = new Items(1,"Gece Yarısı Kütüphanesi",90.0,"geceyarisi");
        Items i2 = new Items(2,"Gurur Ve Önyargı",70.0,"gururveonyargi");
        Items i3 = new Items(3,"Küçük Prens",60.0,"kucukprens");
        Items i4 = new Items(4,"Olasılıksız",100.0,"olasiliksiz");
        Items i5 = new Items(5,"Çizgili Pijamalı Çocuk",80.0,"striped");
        Items i6 = new Items(6,"Beyaz Diş",85.0,"beyazdis");
        Items i7 = new Items(7,"Masumiyet Müzesi",150.0,"masumiyetmuzesi");
        Items i8 = new Items(8,"Suç Ve Ceza",120.0,"sucveceza");
        itemsList.add(i1);
        itemsList.add(i2);
        itemsList.add(i3);
        itemsList.add(i4);
        itemsList.add(i5);
        itemsList.add(i6);
        itemsList.add(i7);
        itemsList.add(i8);

        ItemsAdapter itemsAdapter = new ItemsAdapter(itemsList,requireContext());
        binding.popularBooks.setAdapter(itemsAdapter);

        return binding.getRoot();
    }
}