package com.example.financious;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText memail;
    private  EditText mpass;
    private Button btnlogin;
    private TextView mforgetpass;
    private TextView msignuphere;
    RegistrationActivity array;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }
    private  void login(){

        memail=findViewById(R.id.email_login);
        mpass =findViewById(R.id.pass_login);
        btnlogin=findViewById(R.id.btn_login);
        mforgetpass=findViewById(R.id.forget_login);
        msignuphere=findViewById(R.id.signup_login);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email=memail.getText().toString().trim();
                String pass=mpass.getText().toString().trim();


                if(TextUtils.isEmpty(email)){
                    memail.setError("Email Required!");
                    return;
                }
                if(TextUtils.isEmpty(pass)){
                    mpass.setError("Password Required!");
                    return;
                }

                        startActivity(new Intent(getApplicationContext(),FinancialHistoryActivity.class));
                    }
        });

        msignuphere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
            }
        });

        mforgetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),RegistrationActivity.class));
            }
        });
    }

}






