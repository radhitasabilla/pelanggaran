package com.example.pelanggaran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//  intent untuk pindah ke layout_utama
    public void tampilActivityUtama(View v){
        Intent in = new Intent(this,ActivityUtama.class);
        startActivity(in);
    }
}