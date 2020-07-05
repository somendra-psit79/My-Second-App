package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etfirstValue, etSecondValue;
    TextView tvAns;
    Button add, subtract, multiply, divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstValue = findViewById(R.id.etFirstValue);
        etSecondValue = findViewById(R.id.etSecondValue);
        tvAns = findViewById(R.id.tvAns);
        add = findViewById(R.id.btAdd);
        subtract = findViewById(R.id.btSubtract);
        multiply = findViewById(R.id.btMultiply);
        divide = findViewById(R.id.btDivide);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue=Integer.parseInt(etfirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue + secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue;
                float ans;

                firstValue=Integer.parseInt(etfirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans= (firstValue - secondValue);
                tvAns.setText("Ans is = "+ans);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue, ans;

                firstValue=Integer.parseInt(etfirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());
                ans= firstValue * secondValue;
                tvAns.setText("Ans is = "+ans);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstValue, secondValue;

                firstValue=Integer.parseInt(etfirstValue.getText().toString());
                secondValue=Integer.parseInt(etSecondValue.getText().toString());

                float ans = (float) firstValue / secondValue;
                if(secondValue==0){
                    Toast.makeText(MainActivity.this, "Infinite", Toast.LENGTH_SHORT).show();
                }
                tvAns.setText("Ans is = "+ans);
            }
        });
    }
}