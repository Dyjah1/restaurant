package com.example.marii.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class FoodMenu extends AppCompatActivity {
    String[] breakfast = {"Breakfast", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    String[] lunch = {"Lunch", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    String[] dinner = {"Dinner", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    String[] salads = {"Salads", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    String[] drinks = {"Drinks", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    String[] specials = {"Specials", "Samosa.........500","Egg chops.......750", "Chapati........500", "Beef Sausage.......950"};
    private Button check_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_menu);

        Spinner spinner = (Spinner)findViewById(R.id.breakfast);
        Spinner spinner2 = (Spinner)findViewById(R.id.lunch);
        Spinner spinner3 = (Spinner)findViewById(R.id.dinner);
        Spinner spinner4 = (Spinner)findViewById(R.id.drinks);
        Spinner spinner5 = (Spinner)findViewById(R.id.specials);
        Spinner spinner6 = (Spinner)findViewById(R.id.salads);
        check_out = (Button)findViewById(R.id.check_out);

        check_out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodMenu.this, YourOrder.class);
                startActivity(intent);
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+breakfast[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, breakfast);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);


        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+lunch[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter2 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, lunch);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(arrayAdapter2);


        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+dinner[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter3 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, dinner);
        arrayAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(arrayAdapter3);


        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+salads[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter4 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, salads);
        arrayAdapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(arrayAdapter4);


        spinner5.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+drinks[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter5 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, drinks);
        arrayAdapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner5.setAdapter(arrayAdapter5);


        spinner6.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You chose "+specials[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter arrayAdapter6 = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, specials);
        arrayAdapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner6.setAdapter(arrayAdapter6);



    }
}
