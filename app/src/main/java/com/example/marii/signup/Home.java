package com.example.marii.signup;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.Toolbar;

public class Home extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    android.support.v7.widget.Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    private Button placeOrder;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //NavigationView navigationView = (NavigationView)findViewById(R.id.design_navigation_view);
        placeOrder = (Button)findViewById(R.id.place_order);
        NavigationView mNavigationView = (NavigationView) findViewById(R.id.design_navigation_view);


        placeOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home.this, FoodMenu.class);
                startActivity(intent);
            }
        });

        if (mNavigationView != null) {
            mNavigationView.setNavigationItemSelectedListener(this);
        }




        toolbar = (android.support.v7.widget.Toolbar)findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);

        drawerLayout=(DrawerLayout)findViewById(R.id.drawerLayout);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        /*navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id1 = menuItem.getItemId();
                switch (menuItem.getItemId()){
                    case R.id.navigation_menu:
                        Intent intent = new Intent(getApplicationContext(), this)
                }
            }
        });*/

    }

    /*public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.item1){
            Toast.makeText(getApplicationContext(), "Will come back for you", Toast.LENGTH_SHORT).show();
            return true;
        }
        else if(id==R.id.item2){
            Toast.makeText(getApplicationContext(), "Chill out, am working on it", Toast.LENGTH_SHORT).show();
            return true;
        }
        return true;
    }*/




    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)){

            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav1) {
            Intent intent= new Intent(Home.this,Send_friend_money.class);
            startActivity(intent);
        }
        else if (id == R.id.nav2) {
            Intent intent= new Intent(Home.this,Top_up_account.class);
            startActivity(intent);

        }
        else if (id == R.id.nav3) {
            Intent intent= new Intent(Home.this,Invite_Friends.class);
            startActivity(intent);

        }
        else if (id == R.id.nav4) {

        }
        else if (id == R.id.nav5) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

