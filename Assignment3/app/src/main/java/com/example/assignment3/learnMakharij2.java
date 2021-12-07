package com.example.assignment3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class learnMakharij2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn_makharij2);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        Button backButton = findViewById(R.id.back3);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij2.this,learnMakharij1.class);
                startActivity(intent);
            }
        });

        Button homeButton = findViewById(R.id.Home);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij2.this,Makharij.class);
                startActivity(intent);
            }
        });

        Button nextButton = findViewById(R.id.Next3);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(learnMakharij2.this,learnMakharij3.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.makharij:
                Intent intent = new Intent(this, Makharij.class);
                startActivity(intent);
            case R.id.action_favorite:
                Toast.makeText(getApplicationContext(),"Fav", Toast.LENGTH_LONG).show();
            case R.id.test:
                Toast.makeText(getApplicationContext(),"Test was clicked", Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}