package com.example.marii.signup;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class YourOrder extends AppCompatActivity {
    private TextView order1;
    private TextView order2;
    private TextView order3;
    private Button proceed;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_your_order);

        order1 = (TextView)findViewById(R.id.order_1);
        order2 = (TextView)findViewById(R.id.order_2);
        order3 = (TextView)findViewById(R.id.order_3);
        proceed = (Button)findViewById(R.id.proceed);

        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(YourOrder.this, Billing.class);
                startActivity(intent);
            }
        });

        toolbar = (Toolbar)findViewById(R.id.order_toolbar);
        setSupportActionBar(toolbar);

    }
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.order_menu, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.edit:
                Intent intent = new Intent(YourOrder.this, FoodMenu.class);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}
