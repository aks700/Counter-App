package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView welcome_text,counter_text;
    Button btn;
    Button bt1;
    Button bt2;
    int counter=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn=findViewById(R.id.btn);
        bt1=findViewById(R.id.btn2);
        bt2=findViewById(R.id.btn3);
        counter_text=findViewById(R.id.counter_Text);
        welcome_text=findViewById(R.id.welcome_text);


        //Adding functionalites
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   counter_text.setText(""+increseCount());
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText(""+decreaseCounter());
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter_text.setText(""+resetCounter());
            }
        });



    }

    public int increseCount()
    {
      return ++counter;
    }
    public int decreaseCounter()
    {
        if(counter==0) return 0;
        return --counter;
    }
    public int resetCounter()
    {
        counter=0;
        return counter;
    }
}