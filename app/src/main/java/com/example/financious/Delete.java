package com.example.financious;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Delete extends AppCompatActivity {

    private Button btn_ret;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        returnn();
    }
    private void returnn(){
        btn_ret=findViewById(R.id.btn_return);
        btn_ret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FinancialHistoryActivity.class));
            }
        });
    }
}