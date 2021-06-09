package com.example.financious;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;

public class RegistrationActivity extends AppCompatActivity {

    private EditText mEmail;
    private EditText mpass;
    private Button btnreg;
    private TextView msingin;
    public  String[] registration=new String[10];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        registration();
    }

    private  void registration(){
        mEmail=findViewById(R.id.email_reg);
        mpass =findViewById(R.id.pass_reg);
        btnreg=findViewById(R.id.btn_reg);
        msingin=findViewById(R.id.signin_reg);

        //listners
        btnreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email=mEmail.getText().toString();
                String pass=mpass.getText().toString().trim();

                if(TextUtils.isEmpty(email)){
                    mEmail.setError("Email Required!");
                    return;
                }
                if(TextUtils.isEmpty(pass)){
                    mpass.setError("Password Required!");
                    return;
                }
                int index=0;
                for(int i=0 ;registration[i]!=null;i++){
                    index=i;
                }
                registration[index]=email;
                registration[index+1]=pass;
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }

        });

        msingin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }

}