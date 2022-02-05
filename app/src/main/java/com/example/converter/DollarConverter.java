package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class DollarConverter extends AppCompatActivity {

    private EditText et;
    private Button db;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dollar_converter);

        et = findViewById(R.id.tkId);
        db = findViewById(R.id.DollarButton);
        result = findViewById(R.id.DollRes);

        db.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String taka = et.getText().toString();
                    double tk = Double.parseDouble(taka);

                    if (v.getId() == R.id.DollarButton) {
                        double res = tk / 85.00;
                        result.setText(String.format("Result: $%.2f",res));
                    }
                }
                catch(Exception e){
                    Toast.makeText(DollarConverter.this,"Please enter amount",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
