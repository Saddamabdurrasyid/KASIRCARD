package com.example.kasircard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mie);

        CardView cardMieRicaRica = findViewById(R.id.card_mie_rica_rica);
        CardView cardMieOriginal = findViewById(R.id.card_mie_original);
        CardView cardMieAceh = findViewById(R.id.card_mie_aceh);
        CardView cardMieAyamGeprek = findViewById(R.id.card_mie_ayam_geprek);
        CardView cardMieAyamPanggang = findViewById(R.id.card_mie_ayam_panggang);
        CardView cardMieRendang = findViewById(R.id.card_mie_rendang);

        cardMieRicaRica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Rica Rica", "RP.15000", R.drawable.miericarica);
            }
        });

        cardMieOriginal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Goreng Original", "RP.15000", R.drawable.originaljumbo);
            }
        });

        cardMieAceh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Goreng Aceh", "RP.15000", R.drawable.aceh);
            }
        });

        cardMieAyamGeprek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Ayam Geprek", "RP.15000", R.drawable.ayamgeprek);
            }
        });

        cardMieAyamPanggang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Ayam Panggang", "RP.15000", R.drawable.ayampanggang);
            }
        });

        cardMieRendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDetailActivity("Mie Rendang", "RP.15000", R.drawable.rendang);
            }
        });
    }

    // Method untuk memulai DetailActivity dengan mengirimkan data
    private void startDetailActivity(String itemName, String itemPrice, int itemImageResId) {
        Intent intent = new Intent(MieActivity.this, DetailActivity.class);
        intent.putExtra("itemName", itemName);
        intent.putExtra("itemPrice", itemPrice);
        intent.putExtra("itemImageResId", itemImageResId);
        startActivity(intent);
    }
}
