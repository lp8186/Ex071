package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Credits extends AppCompatActivity {
    TextView tv;
    double n1;
    String str1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);

        tv= (TextView) findViewById(R.id.tv);
        Intent getAnswer = getIntent();
        n1= getAnswer.getDoubleExtra("finalAnswer",0);
        str1= String.valueOf(n1);
        tv.setText(str1);



    }

    public void back(View view) {
        finish();
    }
}