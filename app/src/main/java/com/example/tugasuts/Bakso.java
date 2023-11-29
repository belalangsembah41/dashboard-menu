package com.example.tugasuts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bakso extends AppCompatActivity {

    TextView jumlah, harga;
    int tambah, hargaBks;

    Button kurangx, tambahx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bakso);
        jumlah = findViewById(R.id.total);
        harga = findViewById(R.id.harga);
        kurangx = findViewById(R.id.btnKurang);
        tambahx = findViewById(R.id.btnTambah);

        tambahx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah++;
                hargaBks = hargaBks + 12000;
                harga.setText(Integer.toString(hargaBks));
                jumlah.setText(Integer.toString(tambah));
            }
        });

        kurangx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tambah--;
                hargaBks = hargaBks - 12000;
                if(tambah < 0) {
                    tambah = 0;
                }
                harga.setText(Integer.toString(hargaBks));
                jumlah.setText(Integer.toString(tambah));
            }
        });
    }

}