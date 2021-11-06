package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button repoButton = findViewById(R.id.repo);
        repoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadRepository();
            }
        });

    }

    public void loadRepository(){
        Uri webUrl = Uri.parse("https://github.com/muhammad-farooq-786/intro-app.git");
        Intent repoIntent = new Intent(Intent.ACTION_VIEW,webUrl);
        startActivity(repoIntent);
    }
}