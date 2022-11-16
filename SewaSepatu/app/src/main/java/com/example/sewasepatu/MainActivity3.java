package com.example.sewasepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void pindahke4(View view) {
            Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
            startActivity(intent);
    }
}