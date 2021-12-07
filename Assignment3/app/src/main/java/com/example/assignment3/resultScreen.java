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
import android.widget.TextView;
import android.widget.Toast;

public class resultScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);

        TextView result,score;
        result = findViewById(R.id.resultView);
        score = findViewById(R.id.scoreView);
        Intent intent = getIntent();
        String totalScore = intent.getStringExtra("result");
        int resultScore = Integer.parseInt(totalScore);
        if(resultScore > 2){
            result.setText("Congrats! You have a good score");
            score.setText(Integer.toString(resultScore));
        }else {
            result.setText("You have passed the test");
            score.setText(Integer.toString(resultScore));
        }
        Button homeButton = findViewById(R.id.homeB);
        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(resultScreen.this,Makharij.class);
                startActivity(intent1);
            }
        });

        Button shareButton = findViewById(R.id.share);
        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.setType("text/plain");
                intent2.setAction(Intent.ACTION_SEND);
                startActivity(intent2);
            }
        });    }

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