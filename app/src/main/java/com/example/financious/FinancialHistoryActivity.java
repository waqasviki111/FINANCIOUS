package com.example.financious;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;

public class FinancialHistoryActivity extends AppCompatActivity {

    private Button tabular;
    private  Button graphical;
    private  Button delete;
    private  Button suggestions;
    private Button logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financial_history);

        financiall();

    }
    private void financiall(){
        tabular=findViewById(R.id.btn_table);
        graphical=findViewById(R.id.btn_graph);
        delete=findViewById(R.id.btn_delete);
        suggestions=findViewById(R.id.btn_suggestions);
        logout=findViewById(R.id.btn_log);

        tabular.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getApplicationContext(),Table_View.class));
                }
            });

        graphical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Graph.class));
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Delete.class));
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
        suggestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Suggestions.class));
            }
        });


    }

}