package com.example.kasircard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class NasiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasi);
        // Mendapatkan referensi ke semua CardView
        CardView cardGorengAyam = findViewById(R.id.gorengayam);
        CardView cardGorengBakso = findViewById(R.id.gorengbakso);
        CardView cardGorengKambing = findViewById(R.id.gorengkambing);
        CardView cardGorengKampung = findViewById(R.id.gorengkampung);
        CardView cardGorengSosis = findViewById(R.id.gorengsosis);
        CardView cardGorengSpesial = findViewById(R.id.gorengspesial);

        // Menambahkan onClickListener ke setiap CardView
        cardGorengAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Ayam", "RP.15000", R.drawable.gorengayam);
            }
        });

        cardGorengBakso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Bakso", "RP.15000", R.drawable.gorengbakso);
            }
        });

        cardGorengKambing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Kambing", "RP.15000", R.drawable.gorengkambing);
            }
        });

        cardGorengKampung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Kampung", "RP.15000", R.drawable.gorengkampung);
            }
        });

        cardGorengSosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Sosis", "RP.15000", R.drawable.gorengsosis);
            }
        });

        cardGorengSpesial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Nasi Goreng Spesial", "RP.15000", R.drawable.gorengspesial);
            }
        });
    }

    // Method untuk memulai DetailActivity dengan mengirimkan data
    private void startDetailActivity(String itemName, String itemPrice, int itemImageResId) {
        Intent intent = new Intent(NasiActivity.this, DetailActivity.class);
        intent.putExtra("itemName", itemName);
        intent.putExtra("itemPrice", itemPrice);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}