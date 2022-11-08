package com.example.sewasepatu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

        public void pindahke3(View view) {
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
    }
}
