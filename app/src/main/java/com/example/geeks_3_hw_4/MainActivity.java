package com.example.geeks_3_hw_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.geeks_3_hw_4.adapter.Clickable;
import com.example.geeks_3_hw_4.adapter.ProductAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Clickable {

    ArrayList<Product> arrayListNames = new ArrayList<>();
    ProductAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addElements();
        adapter = new ProductAdapter(arrayListNames, this);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adapter);
    }

    public void addElements(){
        arrayListNames.add(new Product("Fashion Mango Bag", R.drawable.b1, "Waterproof. Made in Spain", "RED", "18.4 USD"));
        arrayListNames.add(new Product("H&M Backpack", R.drawable.b2, "Fashion. Made in Sweden", "GRAY", "20.5 USD"));
        arrayListNames.add(new Product("Adidas Big Bag", R.drawable.b3, "Used to carry clothes and shoes", "ORANGE", "25.4 USD"));
        arrayListNames.add(new Product("Bag-Purse included", R.drawable.b4, "Cloth Backpack, used in travelling", "PINK", "20.3 USD"));
        arrayListNames.add(new Product("Travel Backpack", R.drawable.b5, "Convenient and easy to carry", "BLUE", "17.6 USD"));
        arrayListNames.add(new Product("Italian Purse", R.drawable.p1, "Waterproof. Made in Italy", "PINK", "22.5 USD"));
        arrayListNames.add(new Product("Mango Purse", R.drawable.p8, "Made in Spain. Most Popular Purse", "DARK-BROWN", "25.4 USD"));
        arrayListNames.add(new Product("Ethno Shopper", R.drawable.sh8, "Handmade Shopper. 100% cotton", "BROWN", "18.4 USD"));
    }

    @Override
    public void onItemClick(Product product) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("product", product);
        startActivity(intent);
    }
}