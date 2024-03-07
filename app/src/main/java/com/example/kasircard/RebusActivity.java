package com.example.kasircard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class RebusActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rebus);

        CardView cardSotoMie = findViewById(R.id.sotomie);
        CardView cardAyamBawang = findViewById(R.id.ayambawang);
        CardView cardKariAyam = findViewById(R.id.kariayam);
        CardView cardAyamSpesial = findViewById(R.id.ayamspesial);
        CardView cardSotoSpesial = findViewById(R.id.sotospesial);
        CardView cardEmpalGentong = findViewById(R.id.empalgentong);

        cardSotoMie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Soto Mie", "RP.15000", R.drawable.sotomie);
            }
        });

        cardAyamBawang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Ayam Bawang", "RP.15000", R.drawable.ayambawang);
            }
        });

        cardKariAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Kari Ayam", "RP.15000", R.drawable.kariayam);
            }
        });

        cardAyamSpesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Ayam Spesial", "RP.15000", R.drawable.ayamspesial);
            }
        });

        cardSotoSpesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Soto Spesial", "RP.15000", R.drawable.sotospesial);
            }
        });

        cardEmpalGentong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Empal Gentong", "RP.15000", R.drawable.empalgentong);
            }
        });
    }

    // Method untuk memulai DetailActivity dengan mengirimkan data
    private void startDetailActivity(String itemName, String itemPrice, int itemImageResId) {
        Intent intent = new Intent(RebusActivity.this, DetailActivity.class);
        intent.putExtra("itemName", itemName);
        intent.putExtra("itemPrice", itemPrice);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}
