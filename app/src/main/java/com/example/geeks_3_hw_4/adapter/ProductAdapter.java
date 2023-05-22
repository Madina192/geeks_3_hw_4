package com.example.geeks_3_hw_4.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.geeks_3_hw_4.Product;
import com.example.geeks_3_hw_4.R;

import java.util.ArrayList;


public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>{

    ArrayList<Product> adapterArrayList;
    Clickable adapterClick;

    public ProductAdapter(ArrayList<Product> adapterArrayList, Clickable adapterClick) {
        this.adapterArrayList = adapterArrayList;
        this.adapterClick = adapterClick;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProductViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        holder.onBind(adapterArrayList.get(position));
        holder.itemView.setOnClickListener(v -> adapterClick.onItemClick(adapterArrayList.get(position)));
    }

    @Override
    public int getItemCount() {
        return adapterArrayList.size();
    }
}

class ProductViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    ImageView icon;
    TextView description;
    TextView color;
    TextView sum;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Product product) {
        name = itemView.findViewById(R.id.textViewName);
        icon = itemView.findViewById(R.id.imageViewIcon);
        description = itemView.findViewById(R.id.textViewDescr);
        color = itemView.findViewById(R.id.textViewColor);
        sum = itemView.findViewById(R.id.textViewSum);
        name.setText(product.getName());
        icon.setImageResource(product.getImage());
        description.setText(product.getDescr());
        color.setText(product.getColor());
        sum.setText(product.getSum());
    }
}
