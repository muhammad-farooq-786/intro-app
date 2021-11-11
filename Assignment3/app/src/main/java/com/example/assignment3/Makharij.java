package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Makharij extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makharij);

        Button learnButton = findViewById(R.id.learn);
        learnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Makharij.this,learnMakharij.class);
                startActivity(intent);
            }
        });

        Button testButton = findViewById(R.id.test);
        testButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Makharij.this,testScreen.class);
                startActivity(intent);
            }
        });
    }
}