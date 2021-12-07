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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class testScreen extends AppCompatActivity {

    int count = 1;
    int result = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar ab = getSupportActionBar();
        ab.setDisplayHomeAsUpEnabled(true);


        String[] questions =
                new String[] {"Given word \"م\" is from which group of emission point:\na) ghunna\n b) halqiyah",
                        "Given word \"ع\" is from which group of emission point:\na) halqiyah\n b) ghunna",
                        "Given word \"ق\" is from which group of emission point:\na) lahatiyah\n b) halqiyah",
                        "Given word \"ج\" is from which group of emission point:\na) shajariyah-hafiyah\n b) tarfiyah",
                        "Given word \"ن\" is from which group of emission point:\na) tarfiyah\n b) halqiyah"};
        TextView qView = findViewById(R.id.QuestionView);
        TextView qNumber = findViewById(R.id.qNum);
        qView.setText(questions[count-1]);
        Button aButton = findViewById(R.id.answerButton);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText= findViewById(R.id.ansEdit);
                if(editText.getText().toString().equals("a")){
                    Toast.makeText(testScreen.this,"Your answer is correct",Toast.LENGTH_SHORT).show();
                    result++;
                    count++;
                }
                else if (!editText.getText().toString().equals("a") && !editText.getText().toString().equals("b")){
                    Toast.makeText(testScreen.this,"Please write appropriate option",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(testScreen.this,"Your answer is wrong",Toast.LENGTH_SHORT).show();
                    count++;
                }
                if(count==5){
                    Intent intent = new Intent(testScreen.this,resultScreen.class);
                    intent.putExtra("result",Integer.toString(result));
                    startActivity(intent);
                }
                String qNum = Integer.toString(count);
                qView.setText(questions[count-1]);
                qNumber.setText(qNum);
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