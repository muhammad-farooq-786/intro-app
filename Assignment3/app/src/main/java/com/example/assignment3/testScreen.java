package com.example.assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class testScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_screen);

        int count = 1;
        String[] questions =
                new String[] {"Given word \"م\" is from which group of emission point:\na) ghunna\n b) halqiyah",
                        "Given word \"ع\" is from which group of emission point:\na) halqiyah\n b) ghunna",
                        "Given word \"ق\" is from which group of emission point:\na) lahatiyah\n b) halqiyah",
                        "Given word \"ج\" is from which group of emission point:\na) shajariyah-hafiyah\n b) tarfiyah",
                        "Given word \"ن\" is from which group of emission point:\na) tarfiyah\n b) halqiyah"};
        TextView qView = findViewById(R.id.QuestionView);
        TextView qNumber = findViewById(R.id.qNum);
        Button aButton = findViewById(R.id.answerButton);
        aButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText= findViewById(R.id.ansEdit);
                if(editText.getText().toString().equals("a)")){
                    Toast.makeText(testScreen.this,"Your answer is correct",Toast.LENGTH_LONG).show();
                }
                else if (!editText.getText().toString().equals("a)") && !editText.getText().toString().equals("b)")){
                    Toast.makeText(testScreen.this,"Please write appropriate option",Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(testScreen.this,"Your answer is wrong",Toast.LENGTH_LONG).show();
                }
                int count=1;
                String qNum = Integer.toString(count);
                qNumber.setText(qNum);
                qView.setText(questions[count-1]);
                count++;
            }
        });
    }
}