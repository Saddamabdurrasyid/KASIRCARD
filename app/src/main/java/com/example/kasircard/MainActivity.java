package com.example.kasircard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);CardView cardMieGoreng = findViewById(R.id.card_mie_goreng);
        CardView cardNasiGoreng = findViewById(R.id.card_nasi_goreng);
        CardView cardIndomieRebus = findViewById(R.id.card_mie_rebus);

        cardMieGoreng.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MieActivity.class);
            startActivity(intent);
        });

        cardNasiGoreng.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, NasiActivity.class);
            startActivity(intent);
        });

        cardIndomieRebus.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, RebusActivity.class);
            startActivity(intent);
        });
    }
}