package com.example.marii.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Send_friend_money extends AppCompatActivity {

    ImageView number1,number2,number3,number4,number5,number6,number7,number8,number9,number0,delete,enter;
    EditText amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_friend_money);


        number1=(ImageView) findViewById(R.id.number1);
        number2=(ImageView) findViewById(R.id.number2);
        number3=(ImageView) findViewById(R.id.number3);
        number4=(ImageView) findViewById(R.id.number4);
        number5=(ImageView) findViewById(R.id.number5);
        number6=(ImageView) findViewById(R.id.number6);
        number7=(ImageView) findViewById(R.id.number7);
        number8=(ImageView) findViewById(R.id.number8);
        number9=(ImageView) findViewById(R.id.number9);
        delete=(ImageView) findViewById(R.id.delete);
        number0=(ImageView) findViewById(R.id.number0);
        enter=(ImageView) findViewById(R.id.enter);
        amount=(EditText) findViewById(R.id.amount);

        number1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("1");

            }
        });

        number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("2");

            }
        });

        number3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("3");

            }
        });

        number4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("4");

            }
        });

        number5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("5");

            }
        });

        number6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("6");

            }
        });

        number7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("7");

            }
        });
        number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("8");

            }
        });

        number9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("9");

            }
        });

        number0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                amount.append("0");

            }
        });


    }
}
