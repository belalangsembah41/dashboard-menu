package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imageBakso, imageMieAyam, imageRawon, imageSotoAyam, imageCotoMakassar, imageSopIga, imageBuburAyam, imageSotoBetawi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageBakso = findViewById(R.id.bakso);
        imageMieAyam = findViewById(R.id.mie_ayam);
        imageRawon = findViewById(R.id.rawon);
        imageSotoAyam = findViewById(R.id.soto_ayam);
        imageCotoMakassar = findViewById(R.id.coto_makassar);
        imageSopIga = findViewById(R.id.sop_iga);
        imageBuburAyam = findViewById(R.id.bubur_ayam);
        imageSotoBetawi = findViewById(R.id.soto_betawi);

        imageBakso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Bakso.class));
            }
        });

        imageMieAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MieAyam.class));
            }
        });

        imageRawon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Rawon.class));
            }
        });

        imageSotoAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SotoAyam.class));
            }
        });

        imageCotoMakassar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CotoMakassar.class));
            }
        });

        imageSopIga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SopIga.class));
            }
        });

        imageBuburAyam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, BuburAyam.class));
            }
        });

        imageSotoBetawi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SotoBetawi.class));
            }
        });

    }
}