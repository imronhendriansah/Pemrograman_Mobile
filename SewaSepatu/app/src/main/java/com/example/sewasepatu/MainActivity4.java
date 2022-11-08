package com.example.sewasepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }


    public void pindahke5(View view) {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
    }

    public void pindahkeakhir(View view) {
            Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
            startActivity(intent);
    }
}