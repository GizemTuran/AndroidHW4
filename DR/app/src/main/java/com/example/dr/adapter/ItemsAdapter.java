package com.example.dr.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dr.databinding.ViewholderItemListBinding;
import com.example.dr.entity.Items;

import java.util.ArrayList;

public class ItemsAdapter extends RecyclerView.Adapter<ItemsAdapter.ViewholderItem> {

    ArrayList<Items> itemsArrayList;
    Context context;

    public ItemsAdapter(ArrayList<Items> items, Context context) {
        this.itemsArrayList = items;
        this.context = context;
    }
    public class ViewholderItem extends RecyclerView.ViewHolder{

        private ViewholderItemListBinding itemListBinding;

        public ViewholderItem(@NonNull ViewholderItemListBinding itemListBinding){
            super(itemListBinding.getRoot());
            this.itemListBinding=itemListBinding;
        }
    }
    @NonNull
    @Override
    public ViewholderItem onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ViewholderItemListBinding binding =
                ViewholderItemListBinding.inflate(LayoutInflater.from(context),parent,false);
        return new ViewholderItem(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewholderItem holder, int position) {
        Items item = itemsArrayList.get(position);
        ViewholderItemListBinding b = holder.itemListBinding;

        b.resim.setImageResource(
                context.getResources().getIdentifier(item.getResim(),"drawable",context.getPackageName())
        );
        b.textViewIsim.setText(item.getAd());
        b.textViewFiyat.setText(item.getFiyat()+" ₺");

    }

    @Override
    public int getItemCount() {
        return itemsArrayList.size();
    }
}
