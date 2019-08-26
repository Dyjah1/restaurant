package com.example.marii.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Billing extends AppCompatActivity {
    private TextView bill;
    private Spinner payMethod;
    private Button logIn;
    private Button reserve;
    private Button delivery;

    String[] methods = {"Pay with Visa", "Pay with Mastercard", "Pay with Airtel Money", "Pay with M-Pesa", "Pay with Tigo Pesa", "Pay with T-Pesa", "Pay with Ezy-pesa", "Pay from digital wallet", "Other"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);

        bill = (TextView)findViewById(R.id.bill);
        payMethod = (Spinner)findViewById(R.id.payment_method);
        logIn = (Button)findViewById(R.id.login_prompt);
        reserve = (Button)findViewById(R.id.reserve);
        delivery = (Button)findViewById(R.id.delivery);

        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Billing.this, LogIn.class);
                startActivity(intent);
            }
        });

        reserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Billing.this, Reservations.class );
                startActivity(intent1);
            }
        });

        delivery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Billing.this, Delivery.class);
                startActivity(intent2);
            }
        });

        payMethod.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, methods);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        payMethod.setAdapter(arrayAdapter);

    }
}
