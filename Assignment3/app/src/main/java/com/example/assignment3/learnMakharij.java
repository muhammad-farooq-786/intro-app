package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class learnMakharij extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_makharij);

        Button backButton = findViewById(R.id.back3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij.this,Makharij.class);
                startActivity(intent);
            }
        });

        Button homeButton = findViewById(R.id.Home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij.this,Makharij.class);
                startActivity(intent);
            }
        });

        Button nextButton = findViewById(R.id.Next3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij.this,learnMakharij1.class);
                startActivity(intent);
            }
        });
    }
}