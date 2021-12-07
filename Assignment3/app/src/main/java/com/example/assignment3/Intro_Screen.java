package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Intro_Screen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Repository button
        Button repoButton = findViewById(R.id.repo);
        repoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadRepository();
            }
        });


        //Makharij button
        Button makharijButton = findViewById(R.id.makharij);
        makharijButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadMakharij();
            }
        });

    }

    public void loadRepository(){
        Uri webUrl = Uri.parse("https://github.com/muhammad-farooq-786/intro-app.git");
        Intent repoIntent = new Intent(Intent.ACTION_VIEW,webUrl);
        startActivity(repoIntent);
    }

    public void loadMakharij(){
        Intent mIntent = new Intent(Intro_Screen.this,Makharij.class);
        startActivity(mIntent);
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