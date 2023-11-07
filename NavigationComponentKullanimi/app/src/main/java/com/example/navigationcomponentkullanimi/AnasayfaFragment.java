package com.example.navigationcomponentkullanimi;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponentkullanimi.databinding.FragmentAnasayfaBinding;

public class AnasayfaFragment extends Fragment {
    private FragmentAnasayfaBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, //fragment açıldığında ilk çalışan fonk, tasarımsal yükleme işlemleri burada yapılır
                             Bundle savedInstanceState) {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false);

        binding.buttonDetay.setOnClickListener(view ->{ //view buttonDetayı temsil eder
            //binding.textViewAnasayfa.setText("Merhaba");
            Urunler urun = new Urunler(100,"TV");

            AnasayfaFragmentDirections.DetayGecis gecis = AnasayfaFragmentDirections.detayGecis(urun);
            gecis.setAd("Ahmet");
            gecis.setYas(23);
            gecis.setBoy(1.78f);
            gecis.setBekar(true);

            Navigation.findNavController(view).navigate(gecis);//butona basıldığında bu id çalışır sayfa geri gelebilir.
        });

        return binding.getRoot(); //inflater görsel tasarımı yazılıma aktrarır.container görsel tasarım, false başka bir yapı gelmeyeceğini gösterir.
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Yaşam Döngüsü ","onCreate");
        //uygulama çalıştırıldığında bir kere çalışır.
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Yaşam Döngüsü ","onResume");
        //Sayfa her görüldüğünde
        //Sayfaya geri dönüldüğünde
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Yaşam Döngüsü ","onPause");
        //Sayfa her görünmez olduğunda çalışır.
    }
}