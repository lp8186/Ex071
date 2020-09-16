package com.example.ex071;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText ed;
    String str;
    double num=0,answer;
    String sign="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed = (EditText) findViewById(R.id.ed);

    }

    public void plus(View view) {
        str = ed.getText().toString();
        if ((str.equals("-"))||(str.equals("")))
            num=0;
        else
            num = Double.parseDouble(str);
        ed.setText("");
        sign ="+";

    }

    public void minus(View view) {
        str = ed.getText().toString();
        if ((str.equals("-"))||(str.equals("")))
            num=0;
        else
            num = Double.parseDouble(str);
        ed.setText("");
        sign ="-";
    }

    public void multiplication(View view) {
        str = ed.getText().toString();
        if ((str.equals("-"))||str.equals(""))
            num=0;
        else
            num = Double.parseDouble(str);
        ed.setText("");
        sign ="*";
    }

    public void division(View view) {
        str = ed.getText().toString();
        if ((str.equals("-"))||(str.equals("")))
            num=0;
        else
            num = Double.parseDouble(str);
        ed.setText("");
        sign ="/";
    }

    public void answer(View view) {
        if(sign.equals("")) {
            answer= num;

        }
        else {
            str = ed.getText().toString();
            if (str.equals("-") || (str.equals(""))) {
                str = String.valueOf(num);
                ed.setText(str);
            } else if (!(sign.equals("/"))) {
                if (sign.equals("+"))
                    answer = num + Double.parseDouble(str);
                else if (sign.equals("-"))
                    answer = num - Double.parseDouble(str);
                else if (sign.equals("*"))
                    answer = num * Double.parseDouble(str);
                str = String.valueOf(answer);
                ed.setText(str);
            } else {
                if (str.equals("0"))
                    ed.setText("error- please click AC and try again");
                else {
                    answer = num / Double.parseDouble(str);
                    str = String.valueOf(answer);
                    ed.setText(str);
                }
            }
        }

    }



    public void clear(View view) {
        num = 0;
        sign = "";
        answer=0;
        ed.setText("");
    }


    public void credit(View view) {
        Intent sofe = new Intent(this, Credits.class);
        sofe.putExtra("finalAnswer",answer);
        startActivity(sofe);
    }
}