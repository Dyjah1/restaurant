package com.example.marii.signup;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username;
    private EditText mail;
    private EditText pwd;
    private EditText confirm;
    private EditText phone;
    private Button sign_up;
    private TextView prompt;
    private EditText answer;
    private Spinner question;

    String[] questions = {"What is your pet's name?", "What is your mother's maiden name?", "What was your childhood best friend's name?"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.user_name);
        mail = (EditText)findViewById(R.id.e_mail);
        pwd = (EditText)findViewById(R.id.pwd);
        confirm = (EditText)findViewById(R.id.conf_pwd);
        phone = (EditText)findViewById(R.id.phone_no);
        sign_up = (Button) findViewById(R.id.sign_up_btn);
        answer = (EditText)findViewById(R.id.answer);
        prompt = (TextView)findViewById(R.id.prompt);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), questions[position], Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, questions);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(arrayAdapter);

        sign_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authenticate(username.getText().toString(),mail.getText().toString(),pwd.getText().toString(),confirm.getText().toString(),phone.getText().toString());
            }
        });
    }

    public void authenticate(String username, String mail, String pwd, String confirm, String phone){
        if(username.isEmpty() && mail.isEmpty() && pwd.isEmpty() && confirm.isEmpty() && phone.isEmpty()){
            Toast.makeText(getApplicationContext(), "Please fill all fields", Toast.LENGTH_SHORT).show();
        }
        else{
            final ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
            progressDialog.setIndeterminate(true);
            progressDialog.setMessage("Creating Account...");
            progressDialog.show();

            Toast.makeText(getApplicationContext(), "Account created!", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(MainActivity.this, Home.class);
            startActivity(intent);
        }

    }
}
