package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class resultScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_screen);
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
}