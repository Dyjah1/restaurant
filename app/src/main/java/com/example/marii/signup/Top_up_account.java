package com.example.marii.signup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import java.lang.String;
import java.util.Arrays;

import android.view.inputmethod.InputConnection;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;


public class Top_up_account extends AppCompatActivity {
    private Spinner top_up_from;
    String[] methods = {"From Bank Account", "From Airtel Money", "From M-Pesa", "From Tigo Pesa", "From T-Pesa", "From Ezy-pesa", "From digital wallet", "Other"};
    EditText amount;
    ImageView number1,number2,number3,number4,number5,number6,number7,number8,number9,number0,delete,enter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_up_account);

        top_up_from=(Spinner)findViewById(R.id.top_up_from);
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
        amount=(EditText) findViewById(R.id.editText);

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

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String amount1=amount.getText().toString();
                char [] amount2= amount1.toCharArray();
                char [] amount3= Arrays.copyOfRange(amount2,0,amount2.length-2);
                String amount4= amount3.toString();
                //amount1.substring(0);
                amount.setText(amount4);

            }
        });




        top_up_from.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, methods);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        top_up_from.setAdapter(arrayAdapter);




    }
}
