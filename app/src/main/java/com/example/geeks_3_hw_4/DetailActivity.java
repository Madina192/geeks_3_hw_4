package com.example.geeks_3_hw_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    Product product;
    TextView name;
    ImageView icon;
    TextView descr;
    TextView color;
    TextView sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        product = (Product) getIntent().getSerializableExtra("product");
        System.out.println("name: " + product.getName());
        findViews();
        setViews();

    }

    private void findViews() {
        name = findViewById(R.id.textViewName);
        icon = findViewById(R.id.imageViewIcon);
        descr = findViewById(R.id.textViewDescr);
        color = findViewById(R.id.textViewColor);
        sum = findViewById(R.id.textViewSum);
    }

    private void setViews() {
        name.setText(product.getName());
        icon.setImageResource(product.getImage());
        descr.setText(product.getDescr());
        color.setText(product.getColor());
        sum.setText(product.getSum());
    }
}