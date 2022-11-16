package com.example.sewasepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void pindahkepertama(View view) {
            Intent intent = new Intent(MainActivity5.this, MainActivity2.class);
            startActivity(intent);
    }
}